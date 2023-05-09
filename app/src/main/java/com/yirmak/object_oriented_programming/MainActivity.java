package com.yirmak.object_oriented_programming;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        NewClassLearning myClass = new NewClassLearning();
        myClass.name = "Yirmak";
        myClass.job = "App Developer";

        NewClassLearning newCLass = new NewClassLearning();
        newCLass.name = "Luna";
        newCLass.job = "Cat";
         */

        NewClassLearning myUser = new NewClassLearning("Yirmak", "App Developer");

        System.out.println(myUser.inf());

        System.out.println(myUser.name);
        System.out.println(myUser.job);

        //Encapsulation

        Games stray = new Games("Yirmak", "Stray", 80);
        System.out.println(stray.getGame());
        stray.setAge(31);
        System.out.println(stray.getAge());

        //Inheritance

        SuperAgas yirmak = new SuperAgas("Yirmak", "Feign", 18);
        System.out.println(yirmak.aga());
        System.out.println(yirmak.getAge());

        //Polymorphism

        //1.) Static Polymorphism

        Maths maths = new Maths();
        System.out.println(maths.sum());
        System.out.println(maths.sum(5, 3));
        System.out.println(maths.sum(5, 3, 4));

        //2.) Dynamic Polymorphism

        Animal myAnimal = new Animal();
        myAnimal.scu();

        Cat luna = new Cat();
        luna.test();
        luna.scu();

        //Abstract and Interface

        ceng myCeng = new ceng();
        myCeng.school = "SCU";
        myCeng.project = true;
        myCeng.info();


    }
}