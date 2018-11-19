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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.hang_out_layout, container, false);

        final ArrayList<Des> description = new ArrayList<Des>();
        description.add(new Des(getString(R.string.men_name),getString(R.string.men_address), getString(R.string.men_description), getString(R.string.men_schedule), getString(R.string.men_price), getString(R.string.men_phone), R.drawable.menlynmall));
        description.add(new Des(getString(R.string.for_name),getString(R.string.for_address), getString(R.string.for_description), getString(R.string.for_schedule), getString(R.string.for_price), getString(R.string.for_phone), R.drawable.foresthillcity));
        description.add(new Des(getString(R.string.sndc_name),getString(R.string.sndc_address), getString(R.string.sndc_description), getString(R.string.sndc_schedule), getString(R.string.sndc_price), getString(R.string.sndc_phone), R.drawable.sandtoncity));
        description.add(new Des(getString(R.string.moa_name),getString(R.string.moa_address), getString(R.string.moa_description), getString(R.string.moa_schedule), getString(R.string.moa_price), getString(R.string.moa_phone), R.drawable.moa));

        DesAdapter adapter = new DesAdapter(getActivity(), description, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
