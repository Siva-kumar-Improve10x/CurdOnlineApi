package com.example.curdonlineapi.models;

import com.google.gson.annotations.SerializedName;

public class Money {

    private String amount;

    @SerializedName("currency_code")
    private String currencyCode;

    }