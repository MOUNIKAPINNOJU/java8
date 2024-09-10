package org.springboot.functionalInterfaces;

import java.util.function.Function;

public class FunctionalExample {
    public static void main(String[] args){
        Function<Integer, Integer> squareMe = s->s*s;
        System.out.println(squareMe.apply(5));
    }
}
