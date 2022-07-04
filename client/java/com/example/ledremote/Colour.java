package com.example.ledremote;

public class Colour {
    int red;
    int green;
    int blue;

    Colour(int red , int green , int blue){
        this.red = red ;
        this.green = green;
        this.blue = blue;
    }

    Colour(Colour copiedColour){
       this.copyColour(copiedColour);
    }

    public int getRed() {
        return red;
    }

    public int getGreen(){
        return green;
    }

    public int getBlue(){
        return blue;
    }

    public void setColour(int red , int green , int blue){
        this.red = red ;
        this.green = green;
        this.blue = blue;
    }

    public void copyColour(Colour copiedColour){
        this.red = copiedColour.getRed();
        this.green = copiedColour.getGreen();
        this.blue = copiedColour.getBlue();
    }

    public String getRGBMessage(){
        String RGBColour = " "+ Integer.toString(red) + "," + Integer.toString(green) + "," + Integer.toString(blue);
        return RGBColour;
    }

}
