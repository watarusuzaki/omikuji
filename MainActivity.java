package com.investkoko;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //型の　箱の名前　= activity_mainからomikuji_buttonというものを探す
        Button omikujiButton = findViewById(R.id.omikuji_button);

        omikujiButton.setOnClickListener(new View.OnClickListener() {
            //ボタンを押したら何をするかを記入する
            @Override
            public void onClick(View v) {
                //ランダムな数字(数値)を取得する
                Random random = new Random();
                //0-5のランダムの数値をnumに入れる
                int ram_num = random.nextInt(5);
                //運勢の文字を入れる箱
                String str = "";

                //で、0の時は大吉、1の時は吉、のような分岐処理を作る
                switch (ram_num){
                    case 0:
                        str = "大吉";
                        break;
                    case 1:
                        str = "吉";
                        break;
                    case 2:
                        str = "中吉";
                        break;
                    case 3:
                        str = "小吉";
                        break;
                    case 4:
                        str = "末吉";
                        break;
                    case 5:
                        str = "凶";
                        break;
                }
                Toast.makeText(MainActivity.this, str,Toast.LENGTH_SHORT).show();
            }
        });
    }
}