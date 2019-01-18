package com.example.iqiqiya.log_smali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = "丑小鸭";
        switch (name){
            case "丑小鸭":
                Log.i("Hello","会飞的丑小鸭");
                break;
            case "小天鹅":
                Log.i("Hello","会飞的小天鹅");
                break;
            case "唐老鸭":
                Log.i("Hello","唐老鸭不会飞");
                break;
            default:
                Log.i("Hello","没有符合的name值");
                break;
        }
    }
}
