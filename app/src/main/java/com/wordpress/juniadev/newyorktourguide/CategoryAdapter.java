package com.wordpress.juniadev.newyorktourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * FragmentPagerAdapter to display each attraction category.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private final Context context;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new MuseumsFragment();
            case 1: return new RestaurantsFragment();
            case 2: return new SightseeingFragment();
            default: return new ShoppingFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return context.getString(R.string.category_museums);
            case 1: return context.getString(R.string.category_restaurants);
            case 2: return context.getString(R.string.category_sightseeing);
            default: return context.getString(R.string.category_shopping);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
