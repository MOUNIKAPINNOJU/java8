package org.springboot.designPatterns.factoryDesignPattern;

public class Windows implements OS{
    @Override
    public void spec() {
        System.out.println("Random OS");
    }
}
