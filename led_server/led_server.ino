#include "ESP8266WiFi.h"
#include <Adafruit_NeoPixel.h>
#ifdef __AVR__
#include <avr/power.h> // Required for 16 MHz Adafruit Trinket
#endif

#define LED_PIN    D4

// How many NeoPixels are attached to the Arduino?
#define LED_COUNT 300

Adafruit_NeoPixel strip(LED_COUNT, LED_PIN, NEO_GRB + NEO_KHZ800);
 
const char* ssid = "Wifi-Name";
const char* password = "XXXX-XXXX";
char Mode[30]; //Mode will be
char Red[10];
char Green[10];
char Blue[10];
char Modes[3][30]={"Regen","Farbe","TVmod"}; //with a new word, the number must not only be changed here, but also in findMode()and turnModeOn(), MAX 5 characters
int numberOfMode=0;

 
WiFiServer wifiServer(80);

void setup() {
  // put your setup code here, to run once:
#if defined(__AVR_ATtiny85__) && (F_CPU == 16000000)
  clock_prescale_set(clock_div_1);
#endif
  // END of Trinket-specific code.

  strip.begin();           // INITIALIZE NeoPixel strip object (REQUIRED)
  strip.show();            // Turn OFF all pixels ASAP
  strip.setBrightness(100); // Set BRIGHTNESS to about 1/5 (max = 255)
  
  Serial.begin(9600);
  Serial.println("Hello");
  delay(1000);
 
  WiFi.begin(ssid, password);
 
  while (WiFi.status() != WL_CONNECTED) {
    delay(1000);
    Serial.println("Connecting..");
  }
 
  Serial.print("Connected to WiFi. IP:");
  Serial.println(WiFi.localIP());
 
  wifiServer.begin(); 

}

void loop() {

 WiFiClient client = wifiServer.available(); 
 
  if (client) {
    Serial.println("Client connected");
    // Client handling code
    char clientMessage[200] = "";
    while (client.connected()) {
        

 
        while (client.available()>0) { 
            char c = client.read();
            char tmp[2] ={c};
            strcat(clientMessage, tmp);  
        }  
   }
 
    client.stop();
    Serial.println("Client disconnected");
    Serial.write(clientMessage);
    changeStripMode(clientMessage);
   
 }

}

void changeStripMode(char clientMessage[]){
  
  clientMessageToCharArrays(clientMessage);
  findMode();
  turnModeOn();
  
 
}

void turnModeOn(){ // Please add new mode here
  if(numberOfMode == 1){
    Serial.println("Rainbow");
    rainbow(2);   
    Serial.println(Mode);
  }else if(numberOfMode == 2){
    Serial.println("Farbe");
    farbe();
    Serial.println(Mode);
  }else if(numberOfMode == 3){
    Serial.println("TV");
    tvModus();
    Serial.println(Mode);
  }
}

void findMode(){
  bool match ;
  for(int i=0 ; i<3 ; i++){   // i<Number  Please change number if new word was added above.
    
      if(strcmp(Mode, Modes[i])==0){ 
        match = true;
      }else{
        match = false;
      }
    
    if(match == true){
      
      numberOfMode = i+1; 
    }
    
  }
}


//Reads the client's messages into the provided arrays for further processing
void clientMessageToCharArrays(char clientMessage[]){
  char delimiter[] = ",:";
  char *ptr;
  int argument=0;

  // initialisieren und ersten Abschnitt erstellen
  ptr = strtok(clientMessage, delimiter);

  while(ptr != NULL) {
    
    storeNextArgumentFromClientMessage(ptr , Mode);
    ptr = setPtrToNextArgumentInClientMessage(ptr,  delimiter);
    storeNextArgumentFromClientMessage(ptr , Red);
    ptr = setPtrToNextArgumentInClientMessage(ptr,  delimiter);
    storeNextArgumentFromClientMessage(ptr , Green);
    ptr = setPtrToNextArgumentInClientMessage(ptr,  delimiter);
    storeNextArgumentFromClientMessage(ptr , Blue);
    ptr = setPtrToNextArgumentInClientMessage(ptr,  delimiter);
    }
 }


  void storeNextArgumentFromClientMessage(char *ptr, char storeIntoThisArray[]){
    for(int i=0 ; i<= sizeof(ptr); i++){
    storeIntoThisArray[i]= ptr[i];
    }
  }
  

  char* setPtrToNextArgumentInClientMessage(char *ptr, char delimiter[]){
    ptr = strtok(NULL, delimiter);
    return ptr;
  }

//EFFECTS

void rainbow(int wait) {
  
  for(long firstPixelHue = 0; firstPixelHue < 5*65536; firstPixelHue += 256) {
    for(int i=0; i<strip.numPixels(); i++) { // For each pixel in strip...
      int pixelHue = firstPixelHue + (i * 65536L / strip.numPixels());
      strip.setPixelColor(i, strip.gamma32(strip.ColorHSV(pixelHue)));
    }
    strip.show(); // Update strip with new contents
    delay(wait);  // Pause for a moment
  }
  
}

void farbe(){
  int red = atoi(Red);
  int green = atoi(Green);
  int blue = atoi(Blue);
  strip.fill(strip.Color(red,green,blue),0);
  strip.show();
}

void tvModus(){
  int red = atoi(Red);
  int green = atoi(Green);
  int blue = atoi(Blue);
  strip.fill(strip.Color(0,0,0),0);
  strip.show();
  strip.fill(strip.Color(red,green,blue),130,170);
  strip.show();
}
