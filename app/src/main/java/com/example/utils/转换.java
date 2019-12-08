package com.example.utils;

public class 转换 {
    //十转多
    public static String 十转二(int input){
        String 二进制;
        二进制 = Integer.toBinaryString(input);
        return 二进制;
    }
    public static String 十转八(int input){
        String 八进制;
        八进制 = Integer.toOctalString(input);
        return 八进制;
    }
    public static String 十转十六(int input){
        String 十六进制;
        十六进制 = Integer.toHexString(input);
        return 十六进制;
    }
    //多转十
    public static String 二转十(String input){
        String 二转十;
        二转十=String.valueOf(Integer.parseInt(input, 2));
        return 二转十;
    }
    public static String 八转十(String input){
        String 八转十;
        八转十 = String.valueOf(Integer.parseInt(input, 8));
        return 八转十;
    }
    public static String 十六转十(String input){
        String 十六转十;
        十六转十 = String.valueOf(Integer.parseInt(input ,16));
        return 十六转十;
    }
}


