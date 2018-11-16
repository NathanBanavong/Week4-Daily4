package com.example.consultants.week4_daily4.model.data;

import android.util.Log;

import com.example.consultants.week4_daily4.model.data.remote.RemoteDataSource;
import com.example.consultants.week4_daily4.model.data.remote.RemoteObserver;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class DickRepository {
    
    public static final String TAG = DickRepository.class.getSimpleName() + "_TAG";
    RemoteDataSource remoteDataSource;

    public DickRepository(RemoteDataSource remoteDataSource) {
        Log.d(TAG, "DickRepository: ");
        this.remoteDataSource = remoteDataSource;
    }

//    @Inject
    public void getDickVenue(final DickCallback callback) {
        Log.d(TAG, "getDickVenue: ");
        remoteDataSource.getDickUserObs()
//                    make the network call on the worker thread
                .subscribeOn(Schedulers.io())
//                    get the results back on the main thread
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new RemoteObserver(callback));
    }
}
