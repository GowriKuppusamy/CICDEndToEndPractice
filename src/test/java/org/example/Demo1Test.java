package org.example;

import org.junit.Test;

public class Demo1Test extends Demo1 {
    @Test
    public void testCase1(){
         reverse("HELLO World");

    }
    @Test
    public void testCase2(){
        sort("HELLO");
    }
}
