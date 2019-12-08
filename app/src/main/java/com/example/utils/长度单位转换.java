package com.example.utils;

public class 长度单位转换 {
    public static String mmTocm(String input){
        String mmTocm;
        mmTocm = Double.toString(Double.parseDouble(input)*0.1);
        return mmTocm;
    }
    public static String mmTodm(String input){
        String mmTodm;
        mmTodm = Double.toString(Double.parseDouble(input)*0.01);
        return mmTodm;
    }
    public static String mmTom(String input){
        String mmTom;
        mmTom = Double.toString(Double.parseDouble(input)*0.001);
        return mmTom;
    }
    public static String cmTomm(String input){
        String cmTomm;
        cmTomm = Double.toString(Double.parseDouble(input)*10);
        return cmTomm;
    }
    public static String cmTodm(String input){
        String cmTodm;
        cmTodm = Double.toString(Double.parseDouble(input)*0.1);
        return cmTodm;
    }
    public static String cmTom(String input){
        String cmTom;
        cmTom = Double.toString(Double.parseDouble(input)*0.01);
        return cmTom;
    }
    public static String dmTomm(String input){
        String dmTomm;
        dmTomm = Double.toString(Double.parseDouble(input)*100);
        return dmTomm;
    }
    public static String dmTocm(String input){
        String dmTocm;
        dmTocm = Double.toString(Double.parseDouble(input)*10);
        return dmTocm;
    }
    public static String dmTom(String input){
        String dmTom;
        dmTom = Double.toString(Double.parseDouble(input)*0.1);
        return dmTom;
    }
    public static String mTomm(String input){
        String mTomm;
        mTomm = Double.toString(Double.parseDouble(input)*1000);
        return mTomm;
    }
    public static String mTocm(String input){
        String mTocm;
        mTocm = Double.toString(Double.parseDouble(input)*100);
        return mTocm;
    }
    public static String mTodm(String input){
        String mTodm;
        mTodm = Double.toString(Double.parseDouble(input)*10);
        return mTodm;
    }
}

