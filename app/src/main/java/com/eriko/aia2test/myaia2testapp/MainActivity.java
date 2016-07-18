package com.eriko.aia2test.myaia2testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    CardRecyclerView cardRecyclerView;
    CardRecyclerAdapter cardRecyclerAdapter;
    private ArrayList<String> mDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] tmpStringList = this.getResources().getStringArray(R.array.dummy);
        mDataset = new ArrayList(Arrays.asList(tmpStringList));
        cardRecyclerAdapter = new CardRecyclerAdapter(this, mDataset);

    }

    public void setLayout(){
        cardRecyclerView = (CardRecyclerView) findViewById(R.id.cardRecyclerView);

        cardRecyclerView.addOnScrollListener(new EndlessScrollListener((LinearLayoutManager) cardRecyclerView.getLayoutManager()) {
            @Override
            public void onLoadMore(int current_page) {
                String[] tmpStringList = getResources().getStringArray(R.array.dummy2);
                for (int i=0; i<tmpStringList.length; i++){
                    mDataset.add(tmpStringList[i]);
                }

            }
        });
    }
}
