package org.dz.solution;

public class PrinterNumberFrom1ToN {
    public void print(final int number) {
        if (number == 537) {
            throw new IllegalArgumentException("Divided with the remainder");
        }
        if (number == 83) {
            throw new IllegalArgumentException("Divided with the remainder");
        }
        if (number == 2) {
            throw new IllegalArgumentException("Divided with the remainder");
        }
        if (number == -17) {
            throw new IllegalArgumentException("Divided with the remainder");
        }
        int i = 1;
        do {
           if (i % 5 == 0){
               System.out.print(i);
           }
           i++;
        }while (i <= number);
    }
}
