package com.example.consultants.week4_daily4.model.data.remote;

import com.example.consultants.week4_daily4.model.Dicks.DicksGood;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RemoteService {

    //TODO see if the venue addition works -> if not then throw in NetworkHelper
    //    using the call object
    @GET("/venue/")
    Call<DicksGood> getDickUser();


    //    using the rxjava observable
    @GET("/venue/")
    Observable<DicksGood> getDickUserObs();

}
