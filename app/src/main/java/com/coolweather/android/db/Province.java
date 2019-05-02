package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private int id;
    private String ProviceName;
    private int ProviceCode;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviceName() {
        return ProviceName;
    }

    public void setProviceName(String proviceName) {
        this.ProviceName = proviceName;
    }

    public int getProviceCode() {
        return ProviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.ProviceCode = proviceCode;
    }
}
