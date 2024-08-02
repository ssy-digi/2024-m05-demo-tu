package fr.digi.m052024.service;

public class Operation {

    public int addition(int a, int b) {

        if (b > 0) {
            while(b-- > 0) {
                a++;
            }
        } else {
            while (b++ < 0) {
                a--;
            }
        }
        return a;
    }

    public double division(double a, double b) {
        return a / b;
    }
}
