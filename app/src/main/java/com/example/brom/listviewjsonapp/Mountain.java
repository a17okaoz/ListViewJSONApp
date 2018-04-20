package com.example.brom.listviewjsonapp;

/**
 * Created by a17okaoz on 2018-04-19.
 */

//Variablar för klassen Mountain
public class Mountain {
    private String name;
    private String location;
    private int height;
    private String url;


    //Constructor
    public Mountain (String inName, String inLocation, int inHeight){
        name = inName;
        location = inLocation;
        height = inHeight;
    }

    public Mountain(String inName){
        name = inName;
        location ="";
        height =-1;
    }

    public String toString() {
        return name;
    }

    public String info(){
        String str = name;
        str+=" is located in ";
        str+= location;
        str+=" and has an height of ";
        str+= Integer.toString(height);
        str+="m.";
        return str;
    }
}
