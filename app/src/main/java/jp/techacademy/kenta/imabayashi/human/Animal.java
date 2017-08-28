package jp.techacademy.kenta.imabayashi.human;

/**
 * Created by kenta on 2017/08/28.
 */

public abstract class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    abstract void say();
}
