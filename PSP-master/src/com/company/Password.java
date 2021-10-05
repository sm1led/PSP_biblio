package com.company;

public class Password {
    public static char[] specials = {'@', '#', '!', '~', '$', '%', '^', '&', '*', '(', ')', '-', '+', '/', ':', '.', ',', '<', '>', '?', '|'};


    // checks password length
    public static boolean passwordLengthCheck(String pass, int length) {
        if (pass.length() >= length) {
            return true;
        } else {
            return false;
        }
    }

    // checks for uppercase
    public static boolean passwordUppercaseCheck(String pass) {
        int count = 0;

        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            String s1 = Character.toString(c);
            if (pass.contains(s1))
                count = 1;
        }

        if (count == 1)
            return true;
        else return false;
    }

    public static boolean passwordSpecialSymbol(String pass) {
        String chars = specials.toString();

        for (int i = 0; i <= pass.length(); i++) {

            for (int j = 0; j <= chars.length(); j++) {
                if (pass.charAt(i) == specials[j])
                    return true;
            }
        }
        return false;
    }
}
