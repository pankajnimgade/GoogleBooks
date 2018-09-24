package com.list.book.googlebooklist.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VolumeNet {

    private static final String BASE_URL = "https://www.googleapis.com/books/v1/";

    private static Retrofit retrofit ;


    public static Retrofit getVolumeRetrofit(){

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
