package com.company;

public class Email {

    // allowed email symbols are = {'@', '!', '~', '$', '%', '^', '&', '*', '-', '+', '.', '?'};

    public static boolean hasEmailSymbol(String email) {
        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@')
                return true;
        }
        return false;
    }

    public static boolean hasBadSymbols(String email) {
        for(int i = 0; i < email.length(); i++) {
            if((email.charAt(i) >= 'a' && email.charAt(i) <= 'z')
                || (email.charAt(i) >= 'A' && email.charAt(i) <= 'Z')
                || (email.charAt(i) >= '0' && email.charAt(i) <= '9')
                || (email.charAt(i) == '@') || (email.charAt(i) == '!')
                || (email.charAt(i) == '~') || (email.charAt(i) == '$')
                || (email.charAt(i) == '%') || (email.charAt(i) == '^')
                || (email.charAt(i) == '&') || (email.charAt(i) == '*')
                || (email.charAt(i) == '-') || (email.charAt(i) == '+')
                || (email.charAt(i) == '.') || (email.charAt(i) == '?')) {}
            else return false;
        }
        return true;
    }

    public static boolean hasCorrectDomain(String email) {
        for(int i = 0; i < email.length(); i++)
        {
            if(email.charAt(i) == '@' && i != 0) {
                for(int j = i+1; j < email.length(); j++) {
                    if(email.charAt(j) == '.' && j != (email.length()-1) && j != (i+1))
                        return true;
                }
            }
        }
        return false;
    }

}
