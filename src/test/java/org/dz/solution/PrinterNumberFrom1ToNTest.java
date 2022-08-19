package org.dz.solution;

import org.junit.Assert;
import org.junit.Test;


public class PrinterNumberFrom1ToNTest {

    @Test
    public void print10() {
        PrinterNumberFrom1ToN printer = new PrinterNumberFrom1ToN();
        int[] result = printer.print(10);
        Assert.assertArrayEquals(new int[]{5, 10}, result);

    }

    @Test
    public void print2() {
        PrinterNumberFrom1ToN printer = new PrinterNumberFrom1ToN();
        printer.print(2);
    }

    @Test
    public void print50() {
        PrinterNumberFrom1ToN printer = new PrinterNumberFrom1ToN();
        printer.print(50);
    }

    @Test
    public void print5() {
        PrinterNumberFrom1ToN printer = new PrinterNumberFrom1ToN();
        printer.print(5);
    }

    @Test
    public void print537() {
        PrinterNumberFrom1ToN printer = new PrinterNumberFrom1ToN();
        printer.print(537);
    }

    @Test
    public void print83() {
        PrinterNumberFrom1ToN printer = new PrinterNumberFrom1ToN();
        printer.print(83);
    }

    @Test
    public void print645() {
        PrinterNumberFrom1ToN printer = new PrinterNumberFrom1ToN();
        printer.print(645);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printMinus17() {
        PrinterNumberFrom1ToN printer = new PrinterNumberFrom1ToN();
        printer.print(-17);
    }


}