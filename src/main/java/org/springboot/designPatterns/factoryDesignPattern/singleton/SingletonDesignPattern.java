package org.springboot.designPatterns.factoryDesignPattern.singleton;

class SingletonExample{
    static SingletonExample singletonExampleObj = new SingletonExample();
    private SingletonExample(){

    }
    public static SingletonExample getInstance(){
        return singletonExampleObj;
    }
}

public class SingletonDesignPattern {
    public static void main(String[] args){
            SingletonExample obj1 = SingletonExample.getInstance();
            SingletonExample obj2 = SingletonExample.getInstance();
            System.out.println(obj1+"-----"+obj2);
    }
}
