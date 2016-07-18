package com.eriko.aia2test.myaia2testapp;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by erikotsuda on 7/8/16.
 */

public class CardRecyclerView extends RecyclerView {
    public CardRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //setRecyclerAdapter(context);
    }

    /*
    public void setRecyclerAdapter(Context context){
        setLayoutManager(new LinearLayoutManager(context));
        setAdapter(new CardRecyclerAdapter(context,context.getResources().getStringArray(R.array.dummy)));
    }
    */
}