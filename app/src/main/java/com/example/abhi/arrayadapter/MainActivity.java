package com.example.abhi.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView lv;
    ArrayAdapter<String>aa;
    Button ascen,descen;
    String str[]={"Jan","Feb","Mar","Apr","May","Jun","Jul"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lv);
        ascen = (Button)findViewById(R.id.ascen);
        descen = (Button)findViewById(R.id.descen);
        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);
        lv.setAdapter(aa);
    }

    public void asc (View v){
        Arrays.sort(str);
        aa.notifyDataSetChanged();
    }
    public void des (View v){
        Arrays.sort(str);
        List<String> list = Arrays.asList(str);
        Collections.reverse(list);
        aa.notifyDataSetChanged();
    }
}
