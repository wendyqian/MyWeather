package com.example.wendy_q.myweather.bean;

import org.xmlpull.v1.XmlPullParser;

/**
 * Created by Wendy_Q on 2015/3/24.
 */
public class TodayWeather {
    private String city;
    private String updatetime;
    private String temperature;
    private String humidity;
    private String pm25;
    private String quality;
    private String winddirection;
    private String windspeed;
    private String date;
    private String high;
    private String low;
    private String type;

    public String getDate(){
        return date;
    }
    public String getHigh(){
        return high;
    }
    public String getLow(){
        return low;
    }
    public String getType(){
        return type;
    }
    @Override
    public String toString(){
        return "TodayWeather{"+
                "city ='" + city + '\'' +
                ", updatetime = '" + updatetime + '\'' +
                ", temperature = '" + temperature + '\'' +
                ", humidity = '" + humidity + '\'' +
                ", pm25 = '" + pm25 + '\'' +
                ", quality = '" + quality + '\'' +
                ", winddirection = '" + winddirection + '\'' +
                ", windspeed = '" + windspeed + '\'' +
                ", date = '" + date + '\'' +
                ", high = '" + high + '\'' +
                ", low = '" + low + '\'' +
                ", type = '" + type + '\'' +
                '}';
    }

    

}
