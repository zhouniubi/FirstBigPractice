

package com.example.utils;
import android.util.Log;
import java.math.*;
import java.util.Stack;

public class 计算 {
    public static StringBuffer toPostfix(String infix) {
        Stack<String> stack = new Stack<String>();
        StringBuffer postfix = new StringBuffer(infix.length() * 2);
        int i = 0;
        // 特殊转换
        infix = infix.replace("Cos", "c");
        infix = infix.replace("Sin", "s");
        infix = infix.replace("Ln", "L");
        infix = infix.replace("Lg", "g");
        infix = infix.replace("Abs", "a");
        while (i < infix.length()) {
            char ch = infix.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                    while (!stack.isEmpty() && !stack.peek().equals("("))
                        postfix.append(stack.pop());
                    stack.push(ch + "");
                    i++;
                    break;
                case '×':
                case '÷':

                    while (!stack.isEmpty() && (stack.peek().equals("×") || stack.peek().equals("÷")))
                        postfix.append(stack.pop());
                    stack.push(ch + "");
                    i++;
                    break;
                case 'π':
                case '%':
                case 's':
                case 'c':
                case '^':
                case 'L':
                case 'g':
                case 'a':
                case '√':
                case 'E':
                case '!':
                    while (!stack.isEmpty()
                            && (stack.peek().equals('%') || stack.peek().equals("s") || stack.peek().equals("c")
                            || stack.peek().equals("^") || stack.peek().equals("L") || stack.peek().equals("g")
                            || stack.peek().equals("a") || stack.peek().equals("√") || stack.peek().equals("E")|| stack.peek().equals("π")|| stack.peek().equals("!")))
                        postfix.append(stack.pop());
                    stack.push(ch + "");
                    i++;
                    break;
                case '(':
                    stack.push(ch + "");
                    i++;
                    break;
                case ')':
                    String out = stack.pop();
                    while (out != null && !out.equals("(")) {
                        postfix.append(out);
                        out = stack.pop();
                    }
                    i++;
                    break;
                default:
                    while (i < infix.length() && (ch >= '0' && ch <= '9' || ch == '.')) {
                        postfix.append(ch);
                        /* Log.i("num",String.valueOf(ch)); */
                        i++;
                        if (i < infix.length()) {
                            ch = infix.charAt(i);
                            /* Log.i("i",String.valueOf(i)); */
                        }

                    }
                    postfix.append(" ");
            }
        }
        while (!stack.isEmpty())
            postfix.append(stack.pop());
        return postfix;
    }

    public static double toValue(StringBuffer postfix) {
        Stack<Double> stack = new Stack<>();
        double value = 0;
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (ch >= '0' && ch <= '9' || ch == '.') {
                String s = "";
                while (ch != ' ') {
                    s += ch;
                    ch = postfix.charAt(++i);
                }
                stack.push(Double.valueOf(s));
                value = Double.valueOf(s);

            } else if (ch != ' ' && (ch == '%' || ch == 's' || ch == 'c' || ch == 'L' || ch == 'g' || ch == 'a'
                    || ch == '√' || ch == 'E'|| ch == '!'|| ch == 'π')) {
                Double x = stack.pop();
                switch (ch) {
                    case '%':
                        value = x * 0.01;
                        break;
                    case 's':
                        value = Math.sin(x * (2 * Math.PI) / 360);
                        break;
                    case 'c':
                        value = Math.cos(x * (2 * Math.PI) / 360);
                        break;
                    case 'L':
                        value = Math.log(x);
                        break;
                    case 'g':
                        value = Math.log10(x);
                        break;
                    case 'a':
                        value = Math.abs(x);
                        break;
                    case '√':
                        value = Math.sqrt(x);
                        break;
                    case 'E':
                        value = x * Math.E;
                        break;
                    case 'π':
                        value = x * Math.PI;
                        break;
                    case '!':
                        for(int j=1;j<x;j++){
                            value*=j;

                        }
                        break;
                }
                stack.push(value);
            } else if (ch != ' ' && (ch == '+' || ch == '-' || ch == '×' || ch == '÷' || ch == '^')) {
                Double y = stack.pop(), x = stack.pop();
                switch (ch) {
                    case '+':
                        value = x + y;
                        break;
                    case '-':
                        value = x - y;
                        break;
                    case '×':
                        value = x * y;
                        break;
                    case '÷':
                        value = x / y;
                        break;
                    case '^':
                        value = Math.pow(x, y);
                        break;

                }
                /* System.out.println(x + (ch + "") + y + "=" + value + ","); */
                stack.push(value);
            }
        }
        return stack.pop();
    }
}