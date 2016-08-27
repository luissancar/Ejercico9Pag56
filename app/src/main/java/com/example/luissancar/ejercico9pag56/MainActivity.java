package com.example.luissancar.ejercico9pag56;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        a=(int) (Math.random()*10001);
        Toast.makeText(MainActivity.this, String.valueOf(a), Toast.LENGTH_SHORT).show();
    }
    public void pulsado(View view){
        if (a==Integer.parseInt(et1.getText().toString()))
            Toast.makeText(MainActivity.this, "correcto", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this, "mal", Toast.LENGTH_SHORT).show();

    }
}
