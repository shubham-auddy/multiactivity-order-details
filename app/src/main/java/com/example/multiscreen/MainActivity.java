package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String MSG="com.example.multiscreen.order";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeOrder(View view){
        Intent intent=new Intent(this,OrderActivity.class);
        EditText editText1=findViewById(R.id.et1);
        EditText editText2=findViewById(R.id.et2);
        EditText editText3=findViewById(R.id.et3);
        String message=editText1.getText().toString()+" , "+
                editText2.getText().toString()+" & "+
                editText3.getText().toString();
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}