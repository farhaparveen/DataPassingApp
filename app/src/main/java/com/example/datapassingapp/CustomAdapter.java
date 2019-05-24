package com.example.datapassingapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private Context mContext;
    private List<Person> personList;

    public CustomAdapter(Context context, List<Person> personList) {

        this.mContext = context;
        this.personList = personList;
    }


    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int position) {
        return personList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
  Log.d("farha","getView");
        View listItem = convertView;

        if(listItem == null)

            listItem = LayoutInflater.from(mContext).inflate(R.layout.listperson,parent,false);



        Person currentPerson = personList.get(position);

        TextView name = listItem.findViewById(R.id.txt1);

        name.setText(currentPerson.getName());




        ImageView image = listItem.findViewById(R.id.img1);

        image.setImageResource(currentPerson.getImg());


        return listItem;

    }


}

