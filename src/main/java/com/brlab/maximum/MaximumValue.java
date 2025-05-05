package com.brlab.maximum;



public class MaximumValue<E extends Comparable<E>> {


    E a, b, c;

    MaximumValue(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Instance method that uses static generic method
    public E testMaximum() {
        return MaximumValue.findMaximum(a, b, c);
    }

    static <E extends Comparable>E findMaximum(E a, E b, E c){
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
