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
        description.add(new Des("Table Mountain","Cape Town", "The highest point of Table Mountain is 3,563 feet above sea level", "Most visited 5/5 ", " 5 Star", "+2773 102 7145 ", R.drawable.tablemountain));
        description.add(new Des("Kruger National Park","Limpopo", "Kruger National Park is one of Africa’s largest game reserves", "Most visited 4/5 ", "4.5 Star ", "+2773 102 7145  ", R.drawable.krugernationalpark));
        description.add(new Des("The Cradle of Humankind","Johannesburg", "The Cradle of Humankind is a paleoanthropological site about 50 km northwest of JHB ", "Most visited 3/5 ", "3.5 Star ", "+2773 102 7145 ", R.drawable.craddleofhumankind));
        description.add(new Des("Robben Island","Cape Town", "Robben Island is an island in Table Bay, 6.9 kilometres west of the coast of Bloubergstrand, Cape Town, South Africa ", "Most visit 4/5 ", "4.5 Star ", " +2773 102 7145", R.drawable.robbenisland));

        DesAdapter adapter = new DesAdapter(getActivity(), description, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
