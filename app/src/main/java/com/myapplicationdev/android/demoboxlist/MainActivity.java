package com.myapplicationdev.android.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<pojo> alContactList;
    customAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.listViewBox);
        alContactList = new ArrayList<>();
        pojo item1 = new pojo("blue");
        pojo item2 = new pojo("orange");
        pojo item3 = new pojo("brown");
        alContactList.add(item1);
        alContactList.add(item2);
        alContactList.add(item3);

        caContact = new customAdapter(this,R.layout.row,alContactList);
        lvContact.setAdapter(caContact);
    }}
