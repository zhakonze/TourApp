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
        description.add(new Des("Maboneng Precinct"," 276 Fox St, City and Suburban, Johannesburg, 2094", "Get lost in the city of Jozi filled will food, music and fun", "Open 8am - 10pm ", " Most VISITED", "+2786 133 3444 ", R.drawable.maboneng));
        description.add(new Des("Kong Club Rosebank"," Rosebank, Johannesburg, 2196", "Come join some of SA's coolest kids at Kong", "Open 3pm - late ", "Most visited 4/5 ", " +2763 136 9468", R.drawable.kongclub));
        description.add(new Des("THE SANDS","58, Wierda Rd E, Sandton, Johannesburg, 2196", "Come meet some of the youngest high rollers", "Open 3pm - late ", "Most visited 4/5 ", "011 783 1302 ", R.drawable.sands));
        description.add(new Des("Montecasino","Montecasino Blvd, Fourways, Sandton, 2055", "Leisure complex designed like an Italian village, housing a casino, 2 theaters, cinemas and a mall ", "24 hours ", "Most VISITED ", " 011 510 7000", R.drawable.montecasino));

        DesAdapter adapter = new DesAdapter(getActivity(), description, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }


}
