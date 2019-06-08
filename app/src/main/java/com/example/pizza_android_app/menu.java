package com.example.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    ListView listView;
    String data[]={"Veggie Supreme","Pizza Margareta","Tomato Sauce", "Garlic Basil","Mozerella","Olives and Oregano","Cheese Pizza","Farm house","Country special","Paneer Makhni"};
    Spinner spin;
    String data1[]={"Veg", "Non-Veg"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        listView=(ListView)findViewById(R.id.listview);
        spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter adapter=new ArrayAdapter(menu.this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);

        ArrayAdapter adapter1=new ArrayAdapter(menu.this, android.R.layout.simple_list_item_1, data1);
        spin.setAdapter(adapter1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView txt=(TextView)view;
                Toast.makeText(menu.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();

                    }
             });

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                TextView txt=(TextView)view;
                Toast.makeText(menu.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}

