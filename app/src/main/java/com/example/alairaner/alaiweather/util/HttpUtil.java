package com.example.alairaner.alaiweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Alairaner on 2017/11/14.
 */

public class HttpUtil {
    public static void sendOkhttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client= new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
