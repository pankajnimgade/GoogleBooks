package com.list.book.googlebooklist.data.view.model;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.list.book.googlebooklist.data.types.volume.Volume;
import com.list.book.googlebooklist.data.types.volume.VolumeResponse;
import com.list.book.googlebooklist.network.IVolumeCall;
import com.list.book.googlebooklist.network.VolumeNet;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VolumeViewModel extends ViewModel {

    private static final String TAG = VolumeViewModel.class.getSimpleName();

    private int startIndex;

    private String searchText;

    private boolean isNetworkCallInProgress = false;

    {
        startIndex = 1;
    }

    public VolumeViewModel() {
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    private MutableLiveData<List<Volume>> mutableLiveData;

    public MutableLiveData<List<Volume>> getMutableLiveData() {

        if (mutableLiveData == null) {

            mutableLiveData = new MutableLiveData<>();
            initialList();

        }

        return mutableLiveData;
    }

    private void initialList() {
        Log.d(TAG, "initialList: " + startIndex);
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(new ArrayList<>());
        IVolumeCall iVolumeCall = VolumeNet.getVolumeRetrofit().create(IVolumeCall.class);
        Call<VolumeResponse> volumeResponse = iVolumeCall.getVolumeResponse(searchText, startIndex, 10);

        if (!isNetworkCallInProgress) {

            isNetworkCallInProgress = true;
            volumeResponse.enqueue(responseCallback);
        }
    }

    public void loadMore() {

        if (!isNetworkCallInProgress) {

            isNetworkCallInProgress = true;

            startIndex++;
            Log.d(TAG, "loadMore: " + startIndex);
            IVolumeCall iVolumeCall = VolumeNet.getVolumeRetrofit().create(IVolumeCall.class);
            Call<VolumeResponse> volumeResponse = iVolumeCall.getVolumeResponse(searchText, startIndex, 10);


            volumeResponse.enqueue(responseCallback);
        }

    }

    private Callback<VolumeResponse> responseCallback = new Callback<VolumeResponse>() {

        @Override
        public void onResponse(Call<VolumeResponse> call, Response<VolumeResponse> response) {

            isNetworkCallInProgress = false;
            Log.d(TAG, "onResponse: " + response.body());
            if (response.body() != null &&
                    response.body().getItems() != null &&
                    response.body().getItems().size() > 0) {

                List<Volume> value = mutableLiveData.getValue();
                value.addAll(response.body().getItems());
                mutableLiveData.postValue(value);
            }
        }

        @Override
        public void onFailure(Call<VolumeResponse> call, Throwable t) {

            isNetworkCallInProgress = false;
            Log.d(TAG, "onFailure: " + t.getMessage());

        }
    };

}
