package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/1/30.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cutyId;

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCutyId() {
        return cutyId;
    }

    public void setCutyId(int cutyId) {
        this.cutyId = cutyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
