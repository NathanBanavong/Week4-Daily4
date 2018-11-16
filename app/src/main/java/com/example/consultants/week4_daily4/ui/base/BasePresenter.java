package com.example.consultants.week4_daily4.ui.base;

public interface BasePresenter<V extends BaseView> {
    void onAttach(V view);

    void onDetach();
}
