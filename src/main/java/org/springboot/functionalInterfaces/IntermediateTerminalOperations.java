package org.springboot.functionalInterfaces;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntermediateTerminalOperations {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        //numbers.add(11);
        numbers.add(11);
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        numbers.add(21);

        //filter
        numbers.stream().filter(n->n%2==0).forEach(a->System.out.print(a+" "));
        System.out.println();

        //Map
        numbers.stream().map(a->a*a).forEach(a->System.out.print(a+" "));
        System.out.println();
        //limit
        numbers.stream().map(a->a*a).limit(5).forEach(a->System.out.print(a+" "));
        System.out.println();
        //skip
        numbers.stream().map(a->a*a).skip(2).forEach(a->System.out.print(a+" "));
        System.out.println();
        //sorted
        numbers.stream().sorted().forEach(a->System.out.print(a+" "));
        System.out.println();
        //sorted-ascending order
        numbers.stream().sorted((n1,n2)->n2.compareTo(n1)).forEach(n->System.out.print(n+" "));
        System.out.println();
        //distinct and sorted
        numbers.stream().distinct().sorted().forEach(a->System.out.print(a+ " "));
        System.out.println();

        //min()
        Integer minValue = numbers.stream().min((n1,n2)->n1.compareTo(n2)).get();
        System.out.println(minValue);

        //max()
        System.out.println(numbers.stream().max((n1,n2)->n1.compareTo(n2)).get());

        //count()
        System.out.println(numbers.stream().filter(n->n%2==0).count());

        //collect
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //flatMap
        List<List<Integer>> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(Arrays.asList(1,2));
        listOfNumbers.add(Arrays.asList(3,4));
        listOfNumbers.add(Arrays.asList(5,6));
        listOfNumbers.add(Arrays.asList(7,8));

        List<Integer> flatList = listOfNumbers.stream().flatMap((list->list.stream())).collect(Collectors.toList());
        System.out.println(flatList);

        String fruits[] = new String[5];
        //fruits[2] = "Mango";
        Optional<String> checkNull = Optional.ofNullable(fruits[2]);
        System.out.println(checkNull.isPresent() ? checkNull.get() : 0);

        //list to set
        Set<Integer> set = numbers.stream().collect(Collectors.toSet());
        System.out.println(set);

        //list to Map
        Map<Integer, Integer> map = IntStream.range(0, numbers.size())
                .boxed()
                .collect(Collectors.toMap(i-> i, numbers::get));
        System.out.println(map);

        List<String> stringList = new ArrayList<>();
        stringList.add("Mounika");
        stringList.add("Manasa");
        stringList.add("Naveen");
        stringList.add("vijayalaxmi");
//        Map<Integer, Integer> map1 = IntStream.range(0, numbers.size())
//                .boxed()
//                .collect(Collectors.toMap(i->i, numbers::get));


        //List to Map
        Map<Integer, String> stringMap = IntStream.range(0, stringList.size())
                .boxed()
                .collect(Collectors.toMap(i->i, stringList::get));
        System.out.println(stringMap);

        //set to Map
//        Map<Integer, Integer> setMap = IntStream.range(0, set.size())
//                .boxed()
//                .collect(Collectors.toMap(i->i, set::get));

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);

//        Map<Integer, Integer> setMap1 = integerSet.stream()
//                .collect(Collectors.toMap(i->i, Integer));



    }
}
