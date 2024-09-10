package org.springboot.designPatterns.factoryDesignPattern.builderDesignPattern;

public class Shop {
    public static void main(String[] args){
        Phone p = new PhoneBuilder().setOs("Android").setRam(128).getPhone();
        System.out.println(p);
    }
}
