package com.brlab.maximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MaximumValueTest {

    @Test
    void findMaxTestFirstPosition(){

        Assertions.assertEquals(100,MaximumValue.findMaximum(100,90,20),"Test case failed because the excpected output is 100");

    }
    @Test
    void findMaxTestSecondPosition(){

        Assertions.assertEquals(90,MaximumValue.findMaximum(10,90,20),"Test case failed because the excpected output is 90");

    }
    @Test
    void findMaxTestThirdPosition(){

        Assertions.assertEquals(200,MaximumValue.findMaximum(10,90,200),"Test case failed because the excpected output is 200");

    }
    @Test
    void findMaxFloatTestFirstPosition(){

        Assertions.assertEquals(100.0f,MaximumValue.findMaximum(100.0f,90.0f,20.0f),"Test case failed because the excpected output is 100.0");

    }
    @Test
    void findMaxFloatTestSecondPosition(){

        Assertions.assertEquals(90.0f,MaximumValue.findMaximum(10.0f,90.0f,20.0f),"Test case failed because the excpected output is 90.0");

    }
    @Test
    void findMaxFloatTestThirdPosition(){

        Assertions.assertEquals(200.0f,MaximumValue.findMaximum(10.0f,90.0f,200.0f),"Test case failed because the excpected output is 200.0");

    }
    @Test
    void findMaxStringTestFirstPosition(){
        Assertions.assertEquals("Yogesh",MaximumValue.findMaximum("Yogesh","Rohan","Vinay"),"Test case failed because the excpected output is Yogesh");
    }
    @Test
    void findMaxStringTestSecondPosition(){
        Assertions.assertEquals("Yogesh",MaximumValue.findMaximum("Rohan","Yogesh","Vinay"),"Test case failed because the excpected output is Yogesh");
    }
    @Test
    void findMaxStringTestThirdPosition(){
        Assertions.assertEquals("Yogesh",MaximumValue.findMaximum("Rohan","Vinay","Yogesh"),"Test case failed because the excpected output is Yogesh");
    }
  
}