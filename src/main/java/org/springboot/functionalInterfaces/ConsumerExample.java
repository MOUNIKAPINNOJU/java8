package org.springboot.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){
        Consumer<Integer> squareMe = a->System.out.println(a*a);
        squareMe.accept(5);

    }
}
