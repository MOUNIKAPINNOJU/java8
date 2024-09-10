package org.springboot.stringOperations;


public class StringOperations {

    public static void StringOperations(){
        String str1 = new String("Mounika");
        String str2 = "Mounika";
        String str3 = "MOUNIKA";
        String str4 = new String("MOUNIKA");
        String str5 = "Mounika";

        //references and content is checked
        System.out.println(str1==str2); //false
        System.out.println(str1==str3); //false
        System.out.println(str1==str4); //false
        System.out.println(str2==str3); //false
        System.out.println(str2==str4); //false
        System.out.println(str3==str4); //false
        System.out.println(str2==str5); //true
        System.out.println();

        //only content is checked
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //false
        System.out.println(str1.equals(str4)); //false
        System.out.println(str2.equals(str3)); //false
        System.out.println(str2.equals(str4)); //false
        System.out.println(str3.equals(str4)); //true
        System.out.println();

        //only content is checked with ignoring case
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true
        System.out.println(str1.equalsIgnoreCase(str4)); //true
        System.out.println(str2.equalsIgnoreCase(str3)); //true
        System.out.println(str2.equalsIgnoreCase(str4)); //true
        System.out.println(str3.equalsIgnoreCase(str4)); //true
        System.out.println();

    }



}
