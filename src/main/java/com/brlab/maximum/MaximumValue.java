package com.brlab.maximum;

public class MaximumValue {

    static Integer findMaxInt(Integer a, Integer b,Integer c){
        Integer max=a;

        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
         return max;
    }
    static Float findMaxFloat(Float a, Float b,Float c){
        Float max=a;

        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
    static String findMaxString(String a, String b,String c){
        String max=a;

        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
        return max;
    }
}
