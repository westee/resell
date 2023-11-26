package com.westee.cake.util;

import java.util.Random;

public class Utils {

    public static String generateRandomCode() {
        return generateRandomCode(4);
    }

    public static String generateRandomCode(int codeLength) {
        StringBuilder sb = new StringBuilder();
        String letters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        for (int i = 0; i < codeLength; i++) {
            int index = random.nextInt(letters.length());
            sb.append(letters.charAt(index));
        }
        return sb.toString();
    }
}
