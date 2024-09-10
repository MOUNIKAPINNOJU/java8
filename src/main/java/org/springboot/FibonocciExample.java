package org.springboot;

public class FibonocciExample {
    public static void main(String[] args){
        int number = 20;
        int first = 0;
        int second = 1;
        int next =0;
        for(int i=0;i<number;i++){
            System.out.print(first+" ");
            next = first + second;
            first = second;
            second = next;
        }

        int a = 3;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println();
        System.out.println(a+" "+b);
    }
}
