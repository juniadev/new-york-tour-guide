package com.wordpress.juniadev.newyorktourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Adapter to populate the view with the attraction data.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {

    private final int colorId;

    public AttractionAdapter(@NonNull Context context, @NonNull List<Attraction> attractions, int colorId) {
        super(context, 0, attractions);
        this.colorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Attraction attraction = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.attraction_image);
        if (attraction.hasImage()) {
            imageView.setImageResource(attraction.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.attraction_name);
        nameTextView.setText(attraction.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.attraction_address);
        addressTextView.setText(attraction.getAddress());

        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.attraction_hours);
        hoursTextView.setText(attraction.getHours());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), colorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
