package com.example.consultants.week4_daily4.di;

import com.example.consultants.week4_daily4.ui.user.MainActivity;

import dagger.Component;

//used in interface -> generate code using modules to fill requested dependencies
@Component(modules = UserModule.class)
public interface UserComponent {

    void inject(MainActivity userActivity);

}
