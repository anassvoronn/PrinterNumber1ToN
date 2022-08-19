package org.dz.solution;

public class PrinterNumberFrom1ToN {
    public int[] print(final int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Wrong number = " + number);
        }
        int index = 0;
        int[] resultArray = new int[number / 5];
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                resultArray[index] = i;
                index++;
            }
        }
        return resultArray;
    }
}
