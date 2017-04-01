package com.wordpress.juniadev.newyorktourguide;

/**
 * Class that represents an attraction in the city.
 */
public class Attraction {

    private static final int NO_IMAGE_PROVIDED = -1;

    private final String name;
    private final String address;
    private final String hours;
    private final int imageResourceId;

    public Attraction(String name, String address, String hours) {
        this(name, address, hours, NO_IMAGE_PROVIDED);
    }

    public Attraction(String name, String address, String hours, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.hours = hours;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getHours() {
        return hours;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", hours='" + hours + '\'' +
                ", imageResourceId=" + imageResourceId +
                '}';
    }
}
