package com.example.zhakonze.rsa_tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragAdapter extends FragmentPagerAdapter
{
    private Context context;

    public FragAdapter(Context mCon, FragmentManager fm)
    {
        super(fm);
        this.context = mCon;
    }

    @Override
    public Fragment getItem(int position)
    {
        if (position == 0)
            return new HangOutFragment();
        else if (position == 1)
            return new MallsFragment();
        else
            return new SightsFragment();
    }

    @Override
    public int getCount()
    {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return context.getString(R.string.category_HangOuts);
        else if (position == 1)
            return context.getString(R.string.category_Malls);
        else
            return context.getString(R.string.category_SightSeeing);
    }
}
