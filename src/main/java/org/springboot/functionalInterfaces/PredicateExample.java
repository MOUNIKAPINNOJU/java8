package org.springboot.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args){
        Predicate<String> checkLength = s->s.length()>=5;
        System.out.println(checkLength.test("Mounika"));
    }
}
