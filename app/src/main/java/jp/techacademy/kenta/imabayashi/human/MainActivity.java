package jp.techacademy.kenta.imabayashi.human;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("健太",29,"読書");
        human.say();
        human.think();

        Human human1 = new Human("健",29,"映画");
        human1.say();
        human1.think();


    }
}
