# Overview
The WS2812 is an adressable LED strip which can be contorlled by using a microcontroller like the esp8266 and arduino IDE. The goal of this project is to control the LED strip via an android application over your own WiFi network. The application is separated in a Server (microcontoller) and the client (android application).

## Server
### How to use the code of the Server?
1. Before using the serverscript you have to change ssid to your actual Wi-Fi-name and the password to your actual Wi-Fi password.
2. If the LED strip you are using has 300 LEDs you can use the script as it is. Otherwise you need to change the LED_COUNT to the number of LEDs your LED strip contains.
3. You can use Arduino IDE to upload the code to your microcontroller.

## Client
### How to use the code of the Client?
1. Change the IP address in the class "MessageCreator" to the address of your server.
2. For using the client you need to create an APK with the code an install it on your device.
3. You need to be connected to the same Wi-Fi network as the server.

# Add new Mode
If you want to add new modes you need to do the following changes:

## Server
1. Add a name to the char array with max. 5 characters.
2. Change the functions findMode() and turnModeOn() according to the comments in the code.

## Client
1. Add the name of your new mode to the class "Mode".
2. Add a button to the MainActivity.
3. Make sure that you send the Message in the form "Mode:R,G,B" else you need to change the clientMessageToCharArrays function on the Server. If you use the Mode, Colour and MessageSender class it is assured that the server can understand the clients message.
