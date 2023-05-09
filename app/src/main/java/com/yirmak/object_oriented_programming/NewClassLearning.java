package com.yirmak.object_oriented_programming;

public class NewClassLearning extends People {

    //Property

    String name;
    String job;

    //Constructor = It is the first method that opens when an object is called.


    public NewClassLearning(String nameInput, String jobInput) {
        this.name = nameInput;
        this.job = jobInput;

        System.out.println("User Created");

    }



}
