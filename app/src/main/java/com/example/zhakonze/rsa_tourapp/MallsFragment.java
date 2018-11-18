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
        description.add(new Des("Menlyn Mall","Atterbury Rd & Lois Ave, Menlyn Park, Pretoria, 0063", "Open 8am - 8pm", "5 Star ", " 55 shop", "+2773 102 7145", R.drawable.menlynmall));
        description.add(new Des("Forest Hill Mall","Marie Rd, Monavoni, Centurion, 0157", "Open 8am - 8pm", "5 Star ", "5 Star ", "+2773 102 7145 ", R.drawable.foresthillcity));
        description.add(new Des("Sandton City","Unit U61a, Sandton City, 83 Rivonia Rd, Sandhurst, Sandton, 2196", "Open 8am - 8pm", "5 Star ", "65 shop ", "+2773 102 7145 ", R.drawable.sandtoncity));
        description.add(new Des("Mall of Africa","Lone Creek Cres & Magwa Crescent, Waterfall City, Gauteng", "Open 8am - 8pm", "5 Star ", "75 shop ", " +2773 102 7145", R.drawable.moa));

        DesAdapter adapter = new DesAdapter(getActivity(), description, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
