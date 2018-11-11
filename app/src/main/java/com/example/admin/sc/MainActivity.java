package com.example.admin.sc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button concursi = (Button) findViewById(R.id.concursi);
    Button conserti = (Button) findViewById(R.id.concerti);
    Button spectacli = (Button) findViewById(R.id.spectacli);


    concursi.setOnClickListener(this);
    conserti.setOnClickListener(this);
    spectacli.setOnClickListener(this);

}
