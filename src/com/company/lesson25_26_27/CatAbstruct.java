package com.company.lesson25_26_27;

public class CatAbstruct extends AnimalAbstract {
    @Override
    public void saySmth() {
        System.out.println("mew");
    }

    @Override
    public void eat() {
        System.out.println("milk");
    }
}
