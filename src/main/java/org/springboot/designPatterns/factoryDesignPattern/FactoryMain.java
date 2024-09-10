package org.springboot.designPatterns.factoryDesignPattern;

public class FactoryMain {
    public static void main(String[] args){
        OperatingSystemFactory os = new OperatingSystemFactory();
        OS obj = os.getInstance("Open");
        obj.spec();
    }
}
