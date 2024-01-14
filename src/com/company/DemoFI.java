package com.company;


@FunctionalInterface
interface Welcome {
    void welcomeMessage();
}


//Kazdy interface funkcyjny musi mieć:
//        Some key point -
//        1. >= It's a Java 8 Feature
//        2. Exactly ONE Abstract method in an Interface
//        3. Single Abstract Method Interface (SAM)
//        4. @FunctionalInterface java annotation is used



public class DemoFI {

    public static void main(String[] args) {

        Welcome welcome = () -> System.out.println("Welcome Interface is implemented");
        welcome.welcomeMessage();

    }
}

































