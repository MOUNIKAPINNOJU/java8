package org.springboot;


import java.awt.*;

class Shape{
    void draw(){
        System.out.println("Drawing");
    }
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class Java17Features {
    public static void main(String[] args){



    }

}
