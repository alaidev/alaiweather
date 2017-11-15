package com.example.alairaner.alaiweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alairaner on 2017/11/15.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
