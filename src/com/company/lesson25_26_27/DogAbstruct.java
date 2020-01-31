package com.company.lesson25_26_27;

public class DogAbstruct extends AnimalAbstract {
    @Override
    public void saySmth() {
        System.out.println("Gav");
    }

    @Override
    public void eat() {
        System.out.println("Meet");
    }

    public void sit(){
        System.out.println("i'm seet");
    }
}
