package com.example.consultants.week4_daily4.ui.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.consultants.week4_daily4.di.DaggerUserComponent;
import com.example.consultants.week4_daily4.model.Dicks.DicksGood;
import com.example.consultants.week4_daily4.model.data.remote.RemoteDataSource;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName() + "_TAG";

    private RecyclerView rvVenueList;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Inject
    UserPresenter presenter;

    @Inject
    RemoteDataSource remoteDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent.create().inject(this);

        bindRecyclerView();

    }

    private void bindRecyclerView() {
//        rvVenueList = findViewById(R.id.rv_Venues);
        adapter = new RecyclerViewAdapter(rvVenueList);
        layoutManager = new LinearLayoutManager(this);
        rvVenueList.setAdapter(adapter);
        rvVenueList.setLayoutManager(layoutManager);

    }

    public void onRetrofit(View view) {

        remoteDataSource.getDickVenue().enqueue(new Callback<DicksGood>() {
            @Override
            public void onResponse(Call<DicksGood> call, Response<DicksGood> response) {
                Log.d(TAG, "onResponse: " + Thread.currentThread().getName());
                Log.d(TAG, "onResponse: " + response.body().getVenues().toString());
            }

            @Override
            public void onFailure(Call<DicksGood> call, Throwable t) {

            }
        });
    }

//    public void onRxJava(View view) {
//        presenter.getDickVenue();
//    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }


}
