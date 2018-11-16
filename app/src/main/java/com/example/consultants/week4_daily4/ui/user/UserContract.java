package com.example.consultants.week4_daily4.ui.user;

import com.example.consultants.week4_daily4.model.Dicks.Venue;
import com.example.consultants.week4_daily4.ui.base.BasePresenter;
import com.example.consultants.week4_daily4.ui.base.BaseView;

import java.util.List;

public interface UserContract {

    interface View extends BaseView {

        void onDickVenue(List<Venue> users);
    }

    interface Presenter extends BasePresenter<View> {

        void getDickVenue();
    }

}
