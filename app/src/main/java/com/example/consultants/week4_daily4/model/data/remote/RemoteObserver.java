package com.example.consultants.week4_daily4.model.data.remote;

import android.util.Log;

import com.example.consultants.week4_daily4.model.Dicks.DicksGood;
import com.example.consultants.week4_daily4.model.data.DickCallback;

import java.util.Observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class RemoteObserver implements Observer<DicksGood> {

    public static final String TAG = RemoteObserver.class.getSimpleName() + "_TAG";
    DickCallback dickCallback;

    public RemoteObserver(DickCallback callback) {
        Log.d(TAG, "RemoteObserver: ");
        this.dickCallback = callback;
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(DicksGood dicksGood) {
        dickCallback.onSuccess(dicksGood.getVenues());

    }

    @Override
    public void onError(Throwable e) {
        dickCallback.onFailure(e.getMessage());
    }

    @Override
    public void onComplete() {

    }
}
