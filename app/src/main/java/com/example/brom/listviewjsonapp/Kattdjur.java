package com.example.brom.listviewjsonapp;

/**
 * Created by a17okaoz on 2018-04-19.
 */

//Variablar för klassen Kattdjur
public class Kattdjur {
    private int id;
    private String name;
    private String company;
    private String category;
    private String location;
    private int size;
    private String auxdata;


    //Constructor
    public Kattdjur(int inId, String inName, String inCompany, String inCategory, String inLocation, int inSize, String inAuxdata){
        id = inId;
        name = inName;
        company = inCompany;
        category = inCategory;
        location = inLocation;
        size = inSize;
        auxdata = inAuxdata;
    }

    public String toString() {return name;}

    public String info(){
        String str = name;
        str+=" It´s latin name is ";
        str+= company;
        str+=" is located in ";
        str+= location;
        str+=" and has an height of ";
        str+= Integer.toString(Integer.parseInt(String.valueOf(size)));
        str+="m.";
        str+=auxdata;
        return str;
    }
}
