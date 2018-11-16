package com.example.consultants.week4_daily4.ui.user;

import android.util.Log;

import com.example.consultants.week4_daily4.model.Dicks.DicksGood;
import com.example.consultants.week4_daily4.model.Dicks.Venue;
import com.example.consultants.week4_daily4.model.data.DickCallback;
import com.example.consultants.week4_daily4.model.data.DickRepository;

import java.util.List;

import javax.inject.Inject;

public class UserPresenter implements UserContract.Presenter {
    public static final String TAG = UserPresenter.class.getSimpleName() + "_TAG";
    UserContract.View view;
    DickRepository dickRepository;

    @Inject
    public UserPresenter(DickRepository dickRepository) {
        Log.d(TAG, "UserPresenter: ");
        this.dickRepository = dickRepository;
    }

    @Inject
    @Override
    public void getDickVenue() {
        Log.d(TAG, "getDickVenue: ");

        //TODO need to change 'new DickCallback' -> dagger
        dickRepository.getDickVenue(new DickCallback() {
            @Override
            public void onSuccess(List<Venue> venueList) {
                view.onDickVenue(venueList);
            }

            @Override
            public void onFailure(String error) {
                view.showError(error);

            }
        });

    }

    @Override
    public void onAttach(UserContract.View view) {
        this.view = view;
    }

    @Override
    public void onDetach() {
        this.view = null;
    }
}
