package com.example.consultants.week4_daily4.model.data;

import com.example.consultants.week4_daily4.model.Dicks.DicksGood;
import com.example.consultants.week4_daily4.model.Dicks.Venue;

import java.util.List;

public interface DickCallback {
    void onSuccess(List<Venue> venueList);

    void onFailure(String error);
}
