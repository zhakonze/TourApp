package com.example.zhakonze.rsa_tourapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HangOutFragment extends Fragment
{


    public HangOutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.hang_out_layout, container, false);

        final ArrayList<Des> description = new ArrayList<Des>();
        description.add(new Des("Lutti","One", " lllll", "uhuhuhu ", " nnnn", "bbuu ", R.drawable.maboneng));
        description.add(new Des("Lutti","One", " jjijiji", "nihihnij ", "buhuhuih ", "nbnubn ", R.drawable.maboneng));
        description.add(new Des("Lutti","One", "nnuhuh ", "ijijij ", "huhuh ", "nbinih ", R.drawable.maboneng));
        description.add(new Des("Lutti","One", "jijij ", "jijij ", "hnihihb ", " nnnh", R.drawable.maboneng));

        DesAdapter adapter = new DesAdapter(getActivity(), description, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }


}
