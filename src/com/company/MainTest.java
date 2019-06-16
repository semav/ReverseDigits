package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void revertDigitsTest(){
        int result = Main.revertDigits(12345);
        assertEquals(54321,result);
    }

    @Test
    public void revertDigitsTest2(){
        int result = Main.revertDigits(-12345);
        assertEquals(-54321,result);
    }

    @Test
    public void revertDigitsTest3(){
        int result = Main.revertDigits(112233445);
        assertEquals(544332211,result);
    }
}
