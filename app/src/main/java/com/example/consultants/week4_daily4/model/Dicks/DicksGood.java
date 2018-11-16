
package com.example.consultants.week4_daily4.model.Dicks;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DicksGood implements Serializable
{

    @SerializedName("venues")
    @Expose
    private List<Venue> venues = null;
    private final static long serialVersionUID = -7195866669415821285L;

    public List<Venue> getVenues() {
        return venues;
    }

    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

}
