package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {

    private int id;

    private String countyName;

    private String weather;

    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeather() {
        return weather;
    }

    public int getCityId() {
        return cityId;
    }
}
