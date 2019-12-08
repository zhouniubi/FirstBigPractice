package com.example.utils;

public class 体积 {
    public static String mmTocm(String input){
        String mmTocm;
        mmTocm = Double.toString(Math.pow(Double.parseDouble(input)*0.1, 3));
        return mmTocm;
    }
    public static String mmTodm(String input){
        String mmTodm;
        mmTodm = Double.toString(Math.pow(Double.parseDouble(input)*0.01, 3));
        return mmTodm;
    }
    public static String mmTom(String input){
        String mmTom;
        mmTom = Double.toString(Math.pow(Double.parseDouble(input)*0.001, 3));
        return mmTom;
    }
    public static String cmTomm(String input){
        String cmTomm;
        cmTomm = Double.toString(Math.pow(Double.parseDouble(input)*10, 3));
        return cmTomm;
    }
    public static String cmTodm(String input){
        String cmTodm;
        cmTodm = Double.toString(Math.pow(Double.parseDouble(input)*0.1, 3));
        return cmTodm;
    }
    public static String cmTom(String input){
        String cmTom;
        cmTom = Double.toString(Math.pow(Double.parseDouble(input)*0.01, 3));
        return cmTom;
    }
    public static String dmTomm(String input){
        String dmTomm;
        dmTomm = Double.toString(Math.pow(Double.parseDouble(input)*100, 3));
        return dmTomm;
    }
    public static String dmTocm(String input){
        String dmTocm;
        dmTocm = Double.toString(Math.pow(Double.parseDouble(input)*10, 3));
        return dmTocm;
    }
    public static String dmTom(String input){
        String dmTom;
        dmTom = Double.toString(Math.pow(Double.parseDouble(input)*0.1, 3));
        return dmTom;
    }
    public static String mTomm(String input){
        String mTomm;
        mTomm = Double.toString(Math.pow(Double.parseDouble(input)*1000, 3));
        return mTomm;
    }
    public static String mTocm(String input){
        String mTocm;
        mTocm = Double.toString(Math.pow(Double.parseDouble(input)*100, 3));
        return mTocm;
    }
    public static String mTodm(String input){
        String mTodm;
        mTodm = Double.toString(Math.pow(Double.parseDouble(input)*10, 3));
        return mTodm;
    }

}
