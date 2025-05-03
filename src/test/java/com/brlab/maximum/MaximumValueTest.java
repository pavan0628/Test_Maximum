package com.brlab.maximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MaximumValueTest {

    @Test
    void findIntMaxTest(){

        Assertions.assertEquals(100,MaximumValue.FindMaxInt(10,100,20));

    }
  
}