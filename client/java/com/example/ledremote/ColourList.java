package com.example.ledremote;

import java.util.ArrayList;

public class ColourList {
    private ArrayList<Colour> allColours = new ArrayList<Colour>(65);

    ColourList(){

        allColours.add(new Colour(0,0,0));
        allColours.add(1,new Colour(255,51,153));

        allColours.add(2,new Colour(255,0,127));
        allColours.add(3,new Colour(204,0,102));
        allColours.add(4,new Colour(153,0,76));
        allColours.add(5,new Colour(102,0,51));

        allColours.add(6,new Colour(255,51,255));
        allColours.add(7,new Colour(255,0,255));
        allColours.add(8,new Colour(204,0,204));
        allColours.add(9,new Colour(153,0,153));
        allColours.add(10,new Colour(102,0,102));

        allColours.add(11,new Colour(153,51,255));
        allColours.add(12,new Colour(127,0,255));
        allColours.add(13,new Colour(102,0,204));
        allColours.add(14,new Colour(76,0,153));
        allColours.add(15,new Colour(51,0,102));

        allColours.add(16,new Colour(51,51,255));
        allColours.add(17,new Colour(0,0,255));
        allColours.add(18,new Colour(0,0,204));
        allColours.add(19,new Colour(0,0,153));
        allColours.add(20,new Colour(0,0,102));

        allColours.add(21,new Colour(51,153,255));
        allColours.add(22,new Colour(0,128,255));
        allColours.add(23,new Colour(0,102,204));
        allColours.add(24,new Colour(0,76,153));
        allColours.add(25,new Colour(0,51,102));

        allColours.add(26,new Colour(51,255,255));
        allColours.add(27,new Colour(0,255,255));
        allColours.add(28,new Colour(0,204,204));
        allColours.add(29,new Colour(0,153,153));
        allColours.add(30,new Colour(0,102,102));

        allColours.add(31,new Colour(51,255,153));
        allColours.add(32,new Colour(0,255,128));
        allColours.add(33,new Colour(0,204,102));
        allColours.add(34,new Colour(0,153,76));
        allColours.add(35,new Colour(0,102,51));

        allColours.add(36,new Colour(51,255,51));
        allColours.add(37,new Colour(0,255,0));
        allColours.add(38,new Colour(0,204,0));
        allColours.add(39,new Colour(0,153,0));
        allColours.add(40,new Colour(0,102,0));

        allColours.add(41,new Colour(153,255,51));
        allColours.add(42,new Colour(128,255,0));
        allColours.add(43,new Colour(102,204,0));
        allColours.add(44,new Colour(76,153,0));
        allColours.add(45,new Colour(51,102,0));

        allColours.add(46,new Colour(255,255,51));
        allColours.add(47,new Colour(255,255,0));
        allColours.add(48,new Colour(204,204,0));
        allColours.add(49,new Colour(153,153,0));
        allColours.add(50,new Colour(102,102,0));

        allColours.add(51,new Colour(255,153,51));
        allColours.add(52,new Colour(255,128,0));
        allColours.add(53,new Colour(204,102,0));
        allColours.add(54,new Colour(153,76,0));
        allColours.add(55,new Colour(102,51,0));

        allColours.add(56,new Colour(255,51,51));
        allColours.add(57,new Colour(255,0,0));
        allColours.add(58,new Colour(204,0,0));
        allColours.add(59,new Colour(153,0,0));
        allColours.add(60,new Colour(102,0,0));



    }
    public Colour getColourAtIndex(int index){
        Colour tempColour = allColours.get(index);
        return tempColour;
    }
}
