package com.brlab.maximum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MaximumValueTest {

    @Test
    void findMaxTestFirstPosition(){
        MaximumValue maximumValue=new MaximumValue(100,90,20);
        Assertions.assertEquals(100, maximumValue.testMaximum(),"Test case failed because the excpected output is 100");

    }
    @Test
    void findMaxTestSecondPosition(){
        MaximumValue maximumValue=new MaximumValue(10,90,20);
        Assertions.assertEquals(90,maximumValue.testMaximum(),"Test case failed because the excpected output is 90");

    }
    @Test
    void findMaxTestThirdPosition(){
        MaximumValue maximumValue=new MaximumValue(100,90,200);
        Assertions.assertEquals(200,maximumValue.testMaximum(),"Test case failed because the excpected output is 200");

    }
    @Test
    void findMaxFloatTestFirstPosition(){
        MaximumValue maximumValue=new MaximumValue(100.0f,90.0f,20.0f);
        Assertions.assertEquals(100.0, maximumValue.testMaximum(),"Test case failed because the excpected output is 100.0");



    }
    @Test
    void findMaxFloatTestSecondPosition(){
        MaximumValue maximumValue=new MaximumValue(10.0f,90.0f,20.0f);
        Assertions.assertEquals(90.0, maximumValue.testMaximum(),"Test case failed because the excpected output is 90.0");


    }
    @Test
    void findMaxFloatTestThirdPosition(){
        MaximumValue maximumValue=new MaximumValue(10.0f,90.0f,200.0f);
        Assertions.assertEquals(200.0, maximumValue.testMaximum(),"Test case failed because the excpected output is 200.0");
    }

    @Test
    void findMaxStringTestFirstPosition(){
        MaximumValue maximumValue=new MaximumValue("Yogesh","Rohan","Vinay");
        Assertions.assertEquals("Yogesh", maximumValue.testMaximum(),"Test case failed because the excpected output is Yogesh");

    }
    @Test
    void findMaxStringTestSecondPosition(){
        MaximumValue maximumValue=new MaximumValue("Rohan","Yogesh","Vinay");
        Assertions.assertEquals("Yogesh", maximumValue.testMaximum(),"Test case failed because the excpected output is Yogesh");

    }
    @Test
    void findMaxStringTestThirdPosition(){
        MaximumValue maximumValue=new MaximumValue("Rohan","Vinay","Yogesh");
        Assertions.assertEquals(100, maximumValue.testMaximum(),"Test case failed because the excpected output is Yogesh");

    }
  
}