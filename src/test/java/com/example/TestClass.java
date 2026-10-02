package com.example;

public class TestClass {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public static String checkAccess(int age){
        if (age > 18){
            return "Allowed";
        }
        else {
            return "Denied";
        }
    }

    public static String getGrade(int score){
        if (score >=  0 && score <= 20){
            return "E";
        }

        else if (score >=  21 && score <= 40){
            return "D";
        }

        else if (score >=  41 && score <= 60){
            return "F";
        }

        else if (score >=  61 && score <= 80){
            return "B";
        }

        else if (score >=  81 && score <= 100){
            return "A";
        }
        return "false";
    }

    public static boolean isPositive(int n){
        return n >= 0 ? true : false;
    }
}
