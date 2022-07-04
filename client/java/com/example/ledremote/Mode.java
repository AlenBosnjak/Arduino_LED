package com.example.ledremote;

public class Mode {
    private String nameOfMode;
    private String eineFarbe = "Farbe:";
    private String regenBogen = "Regenbogen:";
    private String TvMode = "TVmode:";

    Mode(String name){
        if(name.equals(eineFarbe) || name.equals(regenBogen) || name.equals(TvMode)) {
            nameOfMode = name;
        }else nameOfMode = null;
    }

    public String getNameOfMode() {
        return nameOfMode;
    }



}
