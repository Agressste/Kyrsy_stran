package com.example.testjava;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMain = (ListView) findViewById(R.id.listViews);

        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.flag_russia, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.flag_south_africa, R.string.africa, R.string.africaZAR));
        list.add(new DataFlags(R.drawable.flag_singapure, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.flag_turkey, R.string.turkish, R.string.turkishTRY));

        list.add(new DataFlags(R.drawable.flag_germany, R.string.german, R.string.germanEUR));
        list.add(new DataFlags(R.drawable.flag_sweden, R.string.swedish, R.string.swedenSEK));
        list.add(new DataFlags(R.drawable.flag_hongkong, R.string.hongkong, R.string.hongkongHKD));


        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        lvMain.setAdapter(myListAdaptery);
    }
}