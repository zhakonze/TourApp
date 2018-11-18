package com.example.zhakonze.rsa_tourapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HangOut extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new HangOutFragment())
                .commit();
    }

//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
//    {
//        View mView = inflater.inflate(R.layout.hang_out_layout, container, false);
//        ArrayList<Des> description = new ArrayList<Des>();
//
//        description.add(new Des("Lutti","One", " lllll", "uhuhuhu ", " nnnn", "bbuu ", R.drawable.maboneng));
//        description.add(new Des("Lutti","One", " jjijiji", "nihihnij ", "buhuhuih ", "nbnubn ", R.drawable.maboneng));
//        description.add(new Des("Lutti","One", "nnuhuh ", "ijijij ", "huhuh ", "nbinih ", R.drawable.maboneng));
//        description.add(new Des("Lutti","One", "jijij ", "jijij ", "hnihihb ", " nnnh", R.drawable.maboneng));
//
//
//        ListView listView = (ListView) getView().findViewById(R.id.list);
//        DesAdapter adapter = new DesAdapter(mView.getContext(), description);
//        listView.setAdapter(adapter);
//        return mView;
//    }
}
