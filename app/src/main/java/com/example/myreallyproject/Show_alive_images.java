package com.example.myreallyproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Show_alive_images extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_alive_images);
        ArrayList<Image_class> images = new ArrayList<>();
        String[] proPlain = {"airplain","sky","vihcle"};
        String[] proBalons = {"party","sky","balon"};
        String[] proFlawers = {"party","flower","holiday"};
        String[] proMountains = {"mountain","tree","nature"};
        String[] proCar = {"car","vihcle","reno"};
        String[] proSmoke = {"smoke","fire","sky"};
        images.add(new Image_class("airplain",proPlain));
        images.add(new Image_class("blons",proBalons));
        images.add(new Image_class("flaewrs",proFlawers));
        images.add(new Image_class("mountains",proMountains));
        images.add(new Image_class("car",proCar));
        images.add(new Image_class("smoke",proSmoke));
        RecyclerView recyclerView = findViewById(R.id.recyclerView_alive);
        editText = findViewById(R.id.edit_atribute);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void afterTextChanged(Editable editable) {
                for (int i = 0; i < images.size(); i++) {
                    boolean flag = false;
                    for (int j = 0; j < 3; j++) {
                           if(editText.getText().toString().equals(images.get(i).getProperties()[j].
                                   substring(0, editText.getText().toString().length())))
                           {
                               Log.d("main", "j: "+j);
                                flag = true;
                           }
                    }
                    if(!flag){
                        images.remove(i);
                    }
                }
                ChatAdapter chatAdapter = new ChatAdapter(images);
                recyclerView.setAdapter(chatAdapter);
            }
        });
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(layoutManager);
        ChatAdapter chatAdapter = new ChatAdapter(images);
        recyclerView.setAdapter(chatAdapter);
    }
}