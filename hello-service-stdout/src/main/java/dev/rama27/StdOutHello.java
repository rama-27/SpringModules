package dev.rama27;

public class StdOutHello implements Hello{
    private final String greeting;
    public  StdOutHello(String greeting) {
        this.greeting = greeting;
    }
    @Override
    public void sayHello(String name) {
        System.out.println(greeting + " " + name);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}