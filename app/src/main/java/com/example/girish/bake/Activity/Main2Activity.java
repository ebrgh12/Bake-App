package com.example.girish.bake.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.girish.bake.Model.BakeResponse;
import com.example.girish.bake.R;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
   // List<BakeResponse> mListDataModels = new ArrayList<BakeResponse>();
    MainActivity mListDataModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
