package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    // reads verification codes from messages, pass the message to the method
    public static void verificationCode(String statement) {
        Pattern pattern = Pattern.compile("\\d+-*\\d+");
        Matcher matcher = pattern.matcher(statement);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
