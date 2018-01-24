package com.bbd;

import java.util.ArrayList;

public class RomanConverter {

    public  static int Convert(String s) {

        if (s == "" || s == null){
            throw new RuntimeException("Can't accept empty String!!!!!!");
        }

        String str = s.toUpperCase();

        int currentVal = 0;
        int nextVal = 0;
        int consecutiveFreq = 1;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            System.out.println("New Loop");
            System.out.println("String: " + str);
            currentVal = getVal(str.charAt(i));

            if ((i + 1) < str.length()) {
                nextVal = getVal(str.charAt(i + 1));
            }
            else nextVal = 0;

            if (nextVal == currentVal) {
                consecutiveFreq++;
            }
            else {
                consecutiveFreq = 1;
            }

            if (consecutiveFreq > 3){
                throw new RuntimeException("Invalid Input!");
            }

            if(nextVal <= currentVal){
                sum += currentVal;
            }
            else{
                switch (nextVal){
                    case 10: case 5:
                        if (currentVal == 1){
                            sum -= 1;
                        }
                        else{
                            throw new RuntimeException("Invalid Input!");
                        }
                        break;
                    case 100: case 50:
                        if (currentVal == 10){
                            sum -= 10;
                        }
                        else{
                            throw new RuntimeException("Invalid Input!");
                        }
                        break;
                    case 1000: case 500:
                        if (currentVal == 100){
                            sum -= 100;
                        }
                        else{
                            throw new RuntimeException("Invalid Input!");
                        }
                        break;
                }
            }
        }
        return sum;

    }

    private static int getVal(char curChar) {
        switch (curChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new RuntimeException("Invalid Character!");
        }
    }
}
