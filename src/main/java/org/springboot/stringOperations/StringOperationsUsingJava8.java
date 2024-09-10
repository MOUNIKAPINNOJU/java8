package org.springboot.stringOperations;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringOperationsUsingJava8 {
    public static void main(String[] args){
        String original = "Mounika";
        String reverse = new StringBuilder(original).reverse().toString();

        //1)Print reverse of given String
        String reverseJava8 = IntStream.range(0, original.length())
                .mapToObj(i->original.charAt(original.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());

      //  System.out.println(reverse);
      //  System.out.println(reverseJava8);

        int[] array = {1, 3, 44, 55, 22, 33, 7, 6, 4};

        //ascending order
        //2)Swap integers from given array[1,3,44,55,22,33,7,6,4] in ascending order
        int[] sortedArray = Arrays.stream(array).sorted()
                .toArray();
      //  System.out.println(sortedArray[2]);
        //descending order
        //3)Swap integers from given array[1,3,44,55,22,33,7,6,4] in descending order
        int[] descendingOrder = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        String input ="aaaabbccddddddeef";
        //4)Input =”aaaabbccddddddeef” .Write a program to find the max repeating character
        Map.Entry<Character, Long> maxEntry = input.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new RuntimeException("No max repeating charactor found"));

       // System.out.println("Max repeating character is: "+maxEntry.getKey());
      //  System.out.println("Count: "+ maxEntry.getValue());

        //5)Input =”aaaabbccddddddeef” .Write a program to find the min repeating character
        Map.Entry<Character, Long> minEntry = input.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .orElseThrow(()-> new RuntimeException("No min repeating character found"));

      //  System.out.println("Min repeating character is: "+ minEntry.getKey());
       // System.out.println("Count :"+ minEntry.getValue());
        //7)Write a program to find occurrence of each character from given input. Input =”aaaabbccddddddeef”
        Map<Character, Long> occurances = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        occurances.forEach((character, count)->System.out.println(character+ ": "+count));

        //6)Find first non-repeating character from given String. (input = “JAVA AND JAVA” and output: N)

        //8)Write a program to remove duplicate elements from given input. Input =”aaaabbccddddddeef”
        String distinctString = input.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

       // System.out.println(distinctString);

        String javaString = "Java is Simple";

        List<String> stringList = Arrays.asList(javaString.split(" "));
        Collections.reverse(stringList);

        String reverseString = String.join(" ", stringList);
       // System.out.println(reverseString);

        //10)“1a2b3c1d5f”. write a program to print output in below order:
        //          “abbcccdfffff”
        String inputString = "1a2b3c1d5f";
        StringBuilder outputString = new StringBuilder();
        for(int i=0;i<inputString.length();i=i+2){
            int count = Character.getNumericValue(inputString.charAt(i));

            char character = inputString.charAt(i+1);

            for(int j=0;j<count;j++){
                outputString.append(character);
            }
        }
       // System.out.println(outputString.toString());

        //anagram
        String input1 = "ANT";
        String input2 = "TAN";
            if(input1.length() != input2.length()){
                //System.out.println(false);
            }

            input1 = input1.toLowerCase();
            input2 = input2.toLowerCase();

            boolean result = Arrays.equals(input1.chars().sorted().toArray(), input2.chars().sorted().toArray());
          //  System.out.println(result);

            for(int amstrongNumber=0;amstrongNumber<100;amstrongNumber++){
                int originalNumber = amstrongNumber;
                int amstrongNumberLength = String.valueOf(amstrongNumber).length();

                double amstrongSum = 0;
                while(originalNumber>0){
                    int temp = originalNumber % 10;
                    amstrongSum = amstrongSum + Math.pow(temp, amstrongNumberLength);
                    originalNumber = originalNumber/10;
                }
                if(amstrongSum == amstrongNumber){
                    //System.out.println("yes");
                }
                else{
                    //System.out.println("No");
                }
            }

            String vowelString = "HelloWorld";
            String vowels = "AEIOUaeiou";
            for(char ch : vowelString.toCharArray()){
                if(vowels.indexOf(ch) != -1){
                    System.out.println("True");
                }
            }
            System.out.println("False");

    }
}
