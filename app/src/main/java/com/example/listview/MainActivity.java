package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listview;
ArrayList<String> friendList;
Button btn;
EditText tx;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         friendList = new ArrayList<String>();
        friendList.add("Saad");
        listview=(ListView) findViewById(R.id.listview);
        btn=(Button) findViewById(R.id.btn);
        tx=(EditText) findViewById(R.id.input);
        friendList.add("Anns");
        friendList.add("Molvi");
        friendList.add("Dar");
        friendList.add("Usman");
        friendList.add("Umer");

         arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,friendList);
        listview.setAdapter(arrayAdapter);
        btn.setOnClickListener(view -> {
            String ins=String.valueOf(tx.getText());
            if(ins.isEmpty())
            {

            }else
            {
                friendList.add(ins);
                arrayAdapter.notifyDataSetChanged();
            }

        });
    }
}