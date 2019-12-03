package com.example.intenttest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    String returnedData=data.getStringExtra("data_return");
                    Toast.makeText(MainActivity.this, returnedData, Toast.LENGTH_LONG).show();
                }
                break;
            case 2:
                if (resultCode==RESULT_OK){
                    String returnedData=data.getStringExtra("data_return");
                    Toast.makeText(MainActivity.this, returnedData, Toast.LENGTH_LONG).show();
                }
                break;
                default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bn1=(Button) findViewById(R.id.bn1);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data="Hello SecondActivity";
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("data",data);
                //startActivity(intent);
                startActivityForResult(intent,1);
            }
        });


        Button bn2=(Button) findViewById(R.id.bn2);
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data="Hello ThirdActivity";
                Intent intent =new Intent(MainActivity.this,ThirdActivity.class);
                intent.putExtra("data",data);
               // startActivity(intent);
                startActivityForResult(intent,2);
            }
        });



    }
}
