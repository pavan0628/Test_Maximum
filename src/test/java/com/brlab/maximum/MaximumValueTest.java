package com.brlab.maximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MaximumValueTest {

    @Test
    void findIntMaxTest(){

        Assertions.assertEquals(100,MaximumValue.FindMaxInt(10,100,20));

    }

    @Test
    void findMaxTestFirstPosition(){

        Assertions.assertEquals(100,MaximumValue.FindMaxInt(100,90,20),"Test case failed because the excpected output is 100");

    }

    @Test
    void findMaxTestSecondPosition(){

        Assertions.assertEquals(90,MaximumValue.FindMaxInt(10,90,20),"Test case failed because the excpected output is 90");

    }

  
}