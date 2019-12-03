package com.example.intenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Intent intent =getIntent();
        String data=intent.getStringExtra("data");
        Toast.makeText(SecondActivity.this, data, Toast.LENGTH_LONG).show();

        Button bn=(Button) findViewById(R.id.bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =new Intent();
                intent1.putExtra("data_return","Hello MainActivity From SecondActivity");
                setResult(RESULT_OK,intent1);
                finish();
            }
        });
    }
}
