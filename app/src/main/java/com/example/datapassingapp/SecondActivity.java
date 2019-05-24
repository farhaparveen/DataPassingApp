package com.example.datapassingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SecondActivity extends AppCompatActivity {

   // TextView t;
    ListView listView;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView=findViewById(R.id.listView1);
        Bundle bundle = getIntent().getExtras();
        List<Person> list = (List<Person>) bundle.get("mylist");
        Toast.makeText(this, list.get(0).name, Toast.LENGTH_SHORT).show();


       // This is for list of objects  Transfer from one activity to another using custom adapter

        customAdapter = new CustomAdapter(this,list);

        listView.setAdapter(customAdapter);







        //This is for list of objects  Transfer from one activity to another using built in adapter
         // ArrayAdapter<Person> arrayAdapter=new ArrayAdapter<Person>(this,R.layout.tvlst,list);

          // listView.setAdapter(arrayAdapter);







//This is for simple String Transfer from one activity to another
        //String s= getIntent().getStringExtra("hi");
       // t.setText(s);





    }
}
