package com.brlab.maximum;

public class MaximumValue {

    static <E extends Comparable>Comparable findMaximum(E a, E b, E c){
        E max=a;

        if(b.compareTo(max)>0){
            max=b;
        }
        if(c.compareTo(max)>0){
            max=c;
        }
         return max;
    }

}
