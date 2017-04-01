package com.wordpress.juniadev.newyorktourguide;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class to retrieve attractions data.
 * All images retrieved from Wikipedia.
 */
public class AttractionUtil {

    public static List<Attraction> getMuseumList(Context ctx) {
        List<Attraction> list = new ArrayList<>();

        list.add(new Attraction(
                ctx.getString(R.string.memorial_9_11),
                ctx.getString(R.string.memorial_9_11_address),
                ctx.getString(R.string.memorial_9_11_hours),
                R.drawable.museum_911));

        list.add(new Attraction(
                ctx.getString(R.string.met),
                ctx.getString(R.string.met_address),
                ctx.getString(R.string.met_hours),
                R.drawable.museum_met));

        list.add(new Attraction(
                ctx.getString(R.string.ny_public_library),
                ctx.getString(R.string.ny_public_library_address),
                ctx.getString(R.string.ny_public_library_hours),
                R.drawable.museum_library));

        list.add(new Attraction(
                ctx.getString(R.string.moma),
                ctx.getString(R.string.moma_address),
                ctx.getString(R.string.moma_hours),
                R.drawable.museum_moma));

        list.add(new Attraction(
                ctx.getString(R.string.natural_history),
                ctx.getString(R.string.natural_history_address),
                ctx.getString(R.string.natural_history_hours),
                R.drawable.museum_natural));

        return list;
    }

    public static List<Attraction> getRestaurantsList(Context ctx) {
        List<Attraction> list = new ArrayList<>();

        list.add(new Attraction(
                ctx.getString(R.string.planet_hollywood),
                ctx.getString(R.string.planet_hollywood_address),
                ctx.getString(R.string.planet_hollywood_hours)));

        list.add(new Attraction(
                ctx.getString(R.string.pisillo),
                ctx.getString(R.string.pisillo_address),
                ctx.getString(R.string.pisillo_hours)));

        list.add(new Attraction(
                ctx.getString(R.string.five_guys),
                ctx.getString(R.string.five_guys_address),
                ctx.getString(R.string.five_guys_hours)));

        list.add(new Attraction(
                ctx.getString(R.string.rudys),
                ctx.getString(R.string.rudys_address),
                ctx.getString(R.string.rudys_hours)));

        list.add(new Attraction(
                ctx.getString(R.string.shake_shack),
                ctx.getString(R.string.shake_shack_address),
                ctx.getString(R.string.shake_shack_hours)));

        return list;
    }

    public static List<Attraction> getShoppingList(Context ctx) {
        List<Attraction> list = new ArrayList<>();

        list.add(new Attraction(
                ctx.getString(R.string.chelsea_market),
                ctx.getString(R.string.chelsea_market_address),
                ctx.getString(R.string.chelsea_market_hours)));

        list.add(new Attraction(
                ctx.getString(R.string.strand),
                ctx.getString(R.string.strand_address),
                ctx.getString(R.string.strand_hours)));

        list.add(new Attraction(
                ctx.getString(R.string.tiffany),
                ctx.getString(R.string.tiffany_address),
                ctx.getString(R.string.tiffany_hours)));

        list.add(new Attraction(
                ctx.getString(R.string.mms),
                ctx.getString(R.string.mms_address),
                ctx.getString(R.string.mms_hours)));

        list.add(new Attraction(
                ctx.getString(R.string.macys),
                ctx.getString(R.string.macys_address),
                ctx.getString(R.string.macys_hours)));

        return list;
    }

    public static List<Attraction> getSightseeingList(Context ctx) {
        List<Attraction> list = new ArrayList<>();

        list.add(new Attraction(
                ctx.getString(R.string.central_park),
                ctx.getString(R.string.central_park_address),
                ctx.getString(R.string.central_park_hours),
                R.drawable.sight_centralpark));

        list.add(new Attraction(
                ctx.getString(R.string.high_line),
                ctx.getString(R.string.high_line_address),
                ctx.getString(R.string.high_line_hours),
                R.drawable.sight_highline));

        list.add(new Attraction(
                ctx.getString(R.string.empire_state),
                ctx.getString(R.string.empire_state_address),
                ctx.getString(R.string.empire_state_hours),
                R.drawable.sight_empirestate));

        list.add(new Attraction(
                ctx.getString(R.string.statue_liberty),
                ctx.getString(R.string.statue_liberty_address),
                ctx.getString(R.string.statue_liberty_hours),
                R.drawable.sight_statue));

        list.add(new Attraction(
                ctx.getString(R.string.top_rock),
                ctx.getString(R.string.top_rock_address),
                ctx.getString(R.string.top_rock_hours),
                R.drawable.sight_top));

        return list;
    }
}
