package com.androidgroup.uac.entity;

public class Data {
    private int responseCode;
    private String result;

    public int getResponseCode() {
        return responseCode;
    }

    public Data setResponseCode(int responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public String getResult() {
        return result;
    }

    public Data setResult(String result) {
        this.result = result;
        return this;
    }
}
