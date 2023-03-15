package com.example.dtstest.util;

import java.security.SecureRandom;
import java.util.Random;

public class AddArr {

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();
    static Random rn = new Random();

    public static int randomLength() {
        int min = 1;
        int max = 5;
        return (int) (Math.random() * (max - min)) + min;
    }

    public static String randomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        return sb.toString();
    }
}
