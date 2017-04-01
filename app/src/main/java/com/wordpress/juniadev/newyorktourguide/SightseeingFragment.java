package com.wordpress.juniadev.newyorktourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * A {@link Fragment} subclass that represents an attraction in the Sightseeing category.
 */
public class SightseeingFragment extends Fragment {

    public SightseeingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final List<Attraction> sights = AttractionUtil.getSightseeingList(getActivity());

        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), sights, R.color.bg_sightseeing);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }
}
