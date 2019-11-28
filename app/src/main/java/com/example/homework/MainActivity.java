package com.example.homework;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view);
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }
        Button buttonxin = (Button) findViewById(R.id.button_xin);
        buttonxin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "作者太菜了，还未完成相关程序", Toast.LENGTH_SHORT).show();
            }
        });
        Button buttontencent = (Button) findViewById(R.id.button_tencent);
        buttontencent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "作者太菜了，还未完成相关程序", Toast.LENGTH_SHORT).show();
            }
        });
        Button buttonlogin = (Button) findViewById(R.id.button_login);
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,logActivity.class);
                startActivity(intent);
            }
        });
        Button buttonreg =(Button) findViewById(R.id.button_reg);
        buttonreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,regActivity.class);
                startActivity(intent);
            }
        });
    }
}
