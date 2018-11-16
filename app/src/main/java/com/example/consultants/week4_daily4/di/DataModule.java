package com.example.consultants.week4_daily4.di;

import com.example.consultants.week4_daily4.model.data.DickCallback;
import com.example.consultants.week4_daily4.model.data.DickRepository;
import com.example.consultants.week4_daily4.model.data.remote.RemoteDataSource;
import com.example.consultants.week4_daily4.model.data.remote.RemoteObserver;
import com.example.consultants.week4_daily4.ui.user.UserPresenter;

import dagger.Module;
import dagger.Provides;

//will provide object for injections
@Module
public class DataModule {

    @Provides
    RemoteObserver providesRemoteObsCallback(RemoteObserver callback) {
        return callback;
    }

    @Provides
    RemoteDataSource providesRemoteDataSource() {
        return new RemoteDataSource();
    }

    @Provides
    DickRepository providesRandomRepository(RemoteDataSource remoteDataSource) {
        return new DickRepository(remoteDataSource);
    }


}
