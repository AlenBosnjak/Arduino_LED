package com.example.ledremote;

import java.io.IOException;


public class MessageSender implements Runnable {

    MessageCreator createsMessage;

    MessageSender(Mode chosenMode, Colour chosenColour){
        createsMessage = new MessageCreator(chosenMode, chosenColour);
    }

    @Override
    public void run() {

        SocketOperations client = new SocketOperations();


        try {

            client.startConnection("x.x.x.x", 80);
            System.out.println("success 1");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            client.sendMessage(createsMessage.getMessage());



        } catch (IOException | InterruptedException e) {
            e.printStackTrace();

        }

        try {
            client.stopConnection();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
