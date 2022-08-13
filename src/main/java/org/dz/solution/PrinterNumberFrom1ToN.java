package org.dz.solution;

public class PrinterNumberFrom1ToN {
    public void print(final int number) {
        if (number % 5 != 0){
            throw new IllegalArgumentException("there is a remainder");
        }
        int result;
        int i = 1;
        do {
            i++;
            result = number / 5;
        } while (i <= number);

    }
}
