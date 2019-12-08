package com.example.utils;

public class 汇率 {
    public static String CNYToUSD(String input){
        String inputfix;
        inputfix = Double.toString(Double.parseDouble(input)*0.1427);
        return inputfix;
    }
    public static String USDToCNY(String input){
        String inputfix;
        inputfix = Double.toString(Double.parseDouble(input)*7.0058);
        return inputfix;
    }
    public static String JPYToCNY(String input){
        String inputfix;
        inputfix = Double.toString(Double.parseDouble(input)*0.06432);
        return inputfix;
    }
    public static String CNYToJPY(String input){
        String inputfix;
        inputfix = Double.toString(Double.parseDouble(input)*15.5471);
        return inputfix;
    }
    public static String EURToCNY(String input){
        String inputfix;
        inputfix = Double.toString(Double.parseDouble(input)*7.7288);
        return inputfix;
    }
    public static String CNYToEUR(String input){
        String inputfix;
        inputfix = Double.toString(Double.parseDouble(input)*0.1294);
        return inputfix;
    }
}

