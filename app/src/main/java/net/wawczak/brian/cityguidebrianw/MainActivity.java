package net.wawczak.brian.cityguidebrianw;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String[] attraction={"Art Institute of Chicago", "Magnificent Mile", "Willis Tower", "Navy Pier", "Water Tower"};

        setListAdapter(new ArrayAdapter<>(this, R.layout.activity_main, R.id.travel, attraction));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){

    }
}
