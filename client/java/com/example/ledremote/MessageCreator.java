package com.example.ledremote;

public class MessageCreator {
    String Message;
    MessageCreator(Mode modus , Colour colour){
        Message = modus.getNameOfMode() + colour.getRGBMessage();

    }

    public String getMessage(){
        return Message;
    }

}
