package com.test.basics;



 class Animal {
    public static void hide() {
        System.out.format("The hide method in Animal.%n");
    }
    public void override() {
        System.out.format("The override method in Animal.%n");
    }
}


public class Cat extends Animal {
    public static void hide() {
        System.out.format("The hide method in Cat.%n");
    }
    public void override() {
        System.out.format("The override method in Cat.%n");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println("Create a Cat instance ...");
        myCat.hide(); 
        Cat.hide();
        myCat.override();
        
        Animal myAnimal = myCat;
        System.out.println("\nCast the Cat instance to Animal...");
        myAnimal.hide();   //BAD STYLE
        Animal.hide();     //Better!
        myAnimal.override();

        Animal myAnimal1 = new Animal();
        System.out.println("\nCreate an Animal instance....");
        myAnimal1.hide();   //BAD STYLE
        Animal.hide();     //Better!
        myAnimal1.override();
    }
}
