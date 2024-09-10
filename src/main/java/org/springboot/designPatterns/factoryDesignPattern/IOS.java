package org.springboot.designPatterns.factoryDesignPattern;

public class IOS implements OS{
    @Override
    public void spec() {
        System.out.println("Most Secure OS");
    }
}
