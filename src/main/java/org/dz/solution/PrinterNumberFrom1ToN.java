package org.dz.solution;

public class PrinterNumberFrom1ToN {
    public void print(final int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Wrong number = " + number);
        }
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= number);
    }
}
