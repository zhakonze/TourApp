package com.example.zhakonze.rsa_tourapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zhakonze on 2018/09/21.
 */

public class DesAdapter extends ArrayAdapter<Des>
{
    //@NonNull
    //@Override
    private int mColorRes;

    public DesAdapter(Activity context, ArrayList<Des> words, int Color)
    {
        super(context, 0, words);
        mColorRes = Color;
    }

    //@NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        Des DescriptiveInfo = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.DescImg_ImageView);

        TextView _nameTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        _nameTextView.setText(DescriptiveInfo.getmName());

        TextView _addressTextView = (TextView) listItemView.findViewById(R.id.addTextView);
        _addressTextView.setText(DescriptiveInfo.getmAdd());

        TextView _descriptionTextView = (TextView) listItemView.findViewById(R.id.descripTextView);
        _descriptionTextView.setText(DescriptiveInfo.getmDes());

        TextView _scheduleTextView = (TextView) listItemView.findViewById(R.id.scheduleTextView);
        _scheduleTextView.setText(DescriptiveInfo.getmSche());

        TextView _priceTextView = (TextView) listItemView.findViewById(R.id.priceTextView);
        _priceTextView.setText(DescriptiveInfo.getmPrice());

        TextView _phoneTextView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        _phoneTextView.setText(DescriptiveInfo.getmPhone());


        if(DescriptiveInfo.hasImage()) {
            imageView.setImageResource(DescriptiveInfo.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);

        }else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }

}