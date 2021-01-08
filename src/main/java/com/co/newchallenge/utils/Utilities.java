package com.co.newchallenge.utils;

import java.util.Random;

public class Utilities {
    public static String createRandomEmail(){
        String userIdChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder userId = new StringBuilder();
        Random random = new Random();

        while (userId.length() < 8) {
            int index = random.nextInt(userIdChars.length());
            userId.append(userIdChars.charAt(index));
        }

        return userId.toString();
    }
}
