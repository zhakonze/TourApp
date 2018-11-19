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
        description.add(new Des(getString(R.string.mabo_name),getString(R.string.mabo_address), getString(R.string.mabo_description), getString(R.string.mabo_schedule), getString(R.string.mabo_price), getString(R.string.mabo_phone), R.drawable.maboneng));
        description.add(new Des(getString(R.string.kon_name),getString(R.string.kon_address), getString(R.string.kon_description), getString(R.string.kon_schedule), getString(R.string.kon_price), getString(R.string.kon_phone), R.drawable.kongclub));
        description.add(new Des(getString(R.string.san_name),getString(R.string.san_address), getString(R.string.san_description), getString(R.string.san_schedule), getString(R.string.san_price), getString(R.string.san_phone), R.drawable.sands));
        description.add(new Des(getString(R.string.mon_name),getString(R.string.mon_address), getString(R.string.mon_description), getString(R.string.mon_schedule), getString(R.string.mon_price),getString(R.string.mon_phone), R.drawable.montecasino));

        DesAdapter adapter = new DesAdapter(getActivity(), description, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }


}
