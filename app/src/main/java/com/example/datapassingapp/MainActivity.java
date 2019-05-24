package com.example.datapassingapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button b;
    PersonList plist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b = findViewById(R.id.btn1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plist = new PersonList();
                List<Person> list = plist.displayPersondetails();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("mylist", (ArrayList<? extends Parcelable>) list);
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });


    }
}
