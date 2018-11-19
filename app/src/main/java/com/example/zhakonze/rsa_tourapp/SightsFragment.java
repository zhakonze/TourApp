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
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.hang_out_layout, container, false);

        final ArrayList<Des> description = new ArrayList<Des>();
        description.add(new Des(getString(R.string.tm_name),getString(R.string.tm_address), getString(R.string.tm_description), getString(R.string.tm_schedule), getString(R.string.tm_price), getString(R.string.tm_phone), R.drawable.tablemountain));
        description.add(new Des(getString(R.string.moa_name),getString(R.string.knp_address), getString(R.string.knp_description), getString(R.string.knp_schedule), getString(R.string.knp_price), getString(R.string.knp_phone), R.drawable.krugernationalpark));
        description.add(new Des(getString(R.string.ch_name),getString(R.string.ch_address), getString(R.string.ch_description), getString(R.string.ch_schedule), getString(R.string.ch_price), getString(R.string.ch_phone), R.drawable.craddleofhumankind));
        description.add(new Des(getString(R.string.moa_name),getString(R.string.moa_address), getString(R.string.ri_description), getString(R.string.ri_schedule), getString(R.string.ri_price), getString(R.string.ri_phone), R.drawable.robbenisland));

        DesAdapter adapter = new DesAdapter(getActivity(), description, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
