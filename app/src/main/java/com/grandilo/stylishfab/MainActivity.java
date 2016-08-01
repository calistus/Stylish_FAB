package com.grandilo.stylishfab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton buttonApple = (FloatingActionButton)findViewById(R.id.btn_apple);
        FloatingActionButton buttonOrange = (FloatingActionButton)findViewById(R.id.btn_orange);
        FloatingActionButton buttonBanana = (FloatingActionButton)findViewById(R.id.btn_banana);

        buttonApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"You clicked Apple", Toast.LENGTH_SHORT).show();
            }
        });

        buttonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"You clicked Orange", Toast.LENGTH_SHORT).show();
            }
        });

        buttonBanana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"You clicked Banana", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
