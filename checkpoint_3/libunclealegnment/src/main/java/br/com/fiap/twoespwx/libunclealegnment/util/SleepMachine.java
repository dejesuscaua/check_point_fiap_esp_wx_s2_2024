package br.com.fiap.twoespwx.libunclealegnment.util;

import java.util.Random;



public class SleepMachine {

    public static void sleep() {
        sleep(100, 2000);
    }
    public static void sleep(int minSleep, int maxSleep) {
        Random randomGenerator = new Random();
        int max = maxSleep;
        int min = minSleep;
        int randomSleepTime = randomGenerator.nextInt((max - min +1)) + min;
        try {
            Thread.sleep(randomSleepTime);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
