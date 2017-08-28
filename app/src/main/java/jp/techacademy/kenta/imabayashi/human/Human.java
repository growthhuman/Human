package jp.techacademy.kenta.imabayashi.human;

import android.util.Log;

/**
 * Created by kenta on 2017/08/28.
 */

public class Human extends Animal implements Thinkable {

    String hobby;

    public Human(String name, int age,String hobby) {
        super(name,age);
        this.hobby = hobby;
    }

    @Override
    void say() {
        Log.d("javatest","私の名前は"+ this.name + "です。"+"年は"+this.age +"歳です");
    }


    @Override
    public void think() {
        Log.d("javatest","私は"+this.hobby+"について考える");
    }
}
