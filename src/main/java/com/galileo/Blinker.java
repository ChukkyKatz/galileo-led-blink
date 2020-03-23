package com.galileo;

import mraa.Dir;
import mraa.Gpio;

public class Blinker {
    public static void main(String[] args) throws Exception {
        Gpio gpio = new Gpio(3, true, true);
        gpio.dir(Dir.DIR_OUT);
        for (int i = 0; i < 20; i++) {
            gpio.write(1);
            Thread.sleep(1000);
            System.out.println(gpio.read());
            gpio.write(0);
            Thread.sleep(1000);
            System.out.println(gpio.read());
        }
    }
}
