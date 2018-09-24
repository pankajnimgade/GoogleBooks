package com.list.book.googlebooklist.network;

import com.list.book.googlebooklist.data.types.volume.VolumeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IVolumeCall {

    @GET("volumes")
    Call<VolumeResponse> getVolumeResponse(@Query("q") String q,
                                           @Query("startIndex") int startIndex,
                                           @Query("maxResults") int maxResults);

}
