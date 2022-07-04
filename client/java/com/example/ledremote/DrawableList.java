package com.example.ledremote;

import java.util.ArrayList;

public class DrawableList {
    private ArrayList<String> allDrawables = new ArrayList<String>(65);

    DrawableList(){

        allDrawables.add(new String("zero"));
        allDrawables.add(1,new String("rosa_5"));
        allDrawables.add(2,new String("rosa_4"));
        allDrawables.add(3,new String("rosa_3"));
        allDrawables.add(4,new String("rosa_2"));
        allDrawables.add(5,new String("rosa_1"));

        allDrawables.add(6,new String("helllila_5"));
        allDrawables.add(7,new String("helllila_4"));
        allDrawables.add(8,new String("helllila_3"));
        allDrawables.add(9,new String("helllila_2"));
        allDrawables.add(10,new String("helllila_1"));

        allDrawables.add(11,new String("lila_5"));
        allDrawables.add(12,new String("lila_4"));
        allDrawables.add(13,new String("lila_3"));
        allDrawables.add(14,new String("lila_2"));
        allDrawables.add(15,new String("lila_1"));

        allDrawables.add(16,new String("blau_5"));
        allDrawables.add(17,new String("blau_4"));
        allDrawables.add(18,new String("blau_3"));
        allDrawables.add(19,new String("blau_2"));
        allDrawables.add(20,new String("blau_1"));

        allDrawables.add(21,new String("hellblau_5"));
        allDrawables.add(22,new String("hellblau_4"));
        allDrawables.add(23,new String("hellblau_3"));
        allDrawables.add(24,new String("hellblau_2"));
        allDrawables.add(25,new String("hellblau_1"));

        allDrawables.add(26,new String("cyan_5"));
        allDrawables.add(27,new String("cyan_4"));
        allDrawables.add(28,new String("cyan_3"));
        allDrawables.add(29,new String("cyan_2"));
        allDrawables.add(30,new String("cyan_1"));

        allDrawables.add(31,new String("mintgreen_5"));
        allDrawables.add(32,new String("mintgreen_4"));
        allDrawables.add(33,new String("mintgreen_3"));
        allDrawables.add(34,new String("mintgreen_2"));
        allDrawables.add(35,new String("mintgreen_1"));

        allDrawables.add(36,new String("green_5"));
        allDrawables.add(37,new String("green_4"));
        allDrawables.add(38,new String("green_3"));
        allDrawables.add(39,new String("green_2"));
        allDrawables.add(40,new String("green_1"));

        allDrawables.add(41,new String("limegreen_5"));
        allDrawables.add(42,new String("limegreen_4"));
        allDrawables.add(43,new String("limegreen_3"));
        allDrawables.add(44,new String("limegreen_2"));
        allDrawables.add(45,new String("limegreen_1"));

        allDrawables.add(46,new String("yellow_5"));
        allDrawables.add(47,new String("yellow_4"));
        allDrawables.add(48,new String("yellow_3"));
        allDrawables.add(49,new String("yellow_2"));
        allDrawables.add(50,new String("yellow_1"));

        allDrawables.add(51,new String("orange_5"));
        allDrawables.add(52,new String("orange_4"));
        allDrawables.add(53,new String("orange_3"));
        allDrawables.add(54,new String("orange_2"));
        allDrawables.add(55,new String("orange_1"));

        allDrawables.add(56,new String("red_5"));
        allDrawables.add(57,new String("red_4"));
        allDrawables.add(58,new String("red_3"));
        allDrawables.add(59,new String("red_2"));
        allDrawables.add(60,new String("red_1"));



    }
    public String getColourAtIndex(int index){
       String tempColour = allDrawables.get(index);
        return tempColour;
    }

}
