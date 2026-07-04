package org.example;

import org.testng.annotations.Test;

public class Demo1Test extends Demo1 {
    @Test
    public void testCase1(){
         reverse("HELLO World");

    }
    @Test
    public void testCase2(){
        sort("HELLO");
    }
    @Test
    public void testCase3(){
        print("Executed successfully for CICI");
    }
    @Test
    public void testCase4(){
        findMax(new int[]{12, 23, 34, 43, 32, 21, 65, 9, 876, 56});
    }
}
