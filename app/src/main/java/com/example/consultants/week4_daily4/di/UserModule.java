package com.example.consultants.week4_daily4.di;

import com.example.consultants.week4_daily4.model.data.DickRepository;
import com.example.consultants.week4_daily4.ui.user.UserPresenter;

import dagger.Module;
import dagger.Provides;

@Module(includes = DataModule.class)
public class UserModule {

    @Provides
    UserPresenter providesUserPresenter(DickRepository dickRepository) {
        return new UserPresenter(dickRepository);
    }

}
