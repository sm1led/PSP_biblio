package com.company;

import java.util.ArrayList;

public class Phone {
    public static ArrayList<String> countryCode = new ArrayList<String>();
    public static ArrayList<Integer> countryNumLength = new ArrayList<Integer>();
    public static ArrayList<String> countryName = new ArrayList<String>();


    public void addCountry(String code, int length, String name) {
        countryCode.add(code);
        countryNumLength.add(length);
        countryName.add(name);
    }

    public static void addLithuania() {
        countryCode.add("+370");
        countryNumLength.add(12);
        countryName.add("LT");
    }


    public static boolean checkForSymbols(String num) {

        for(int i = 0; i <= num.length(); i++) {
            if((num.charAt(i) < '0') || (num.charAt(i) > '9'))
                return false;
        }
        return true;
    }

    public static boolean startsWith(String num) {
        if(num.charAt(0) == '8')
            return true;
        else return false;
    }


        public static boolean checkCountry(String name, String num) {
        addLithuania();

        for(int i=0; i<countryName.size(); i++)
        {
            int codeLength = (countryCode.get(i)).length();
            if(name == countryName.get(i) && num.substring(0,codeLength).equals(countryCode.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void addCountryCode(String num, String name) {
        for(int i=0; i<countryName.size(); i++)
        {
            if(name == countryName.get(i)) {
                num = num.substring(1);
                num = num + countryCode.get(i);
            }
        }
    }

}
