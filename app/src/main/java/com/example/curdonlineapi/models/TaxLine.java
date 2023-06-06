package com.example.curdonlineapi.models;

import com.example.curdonlineapi.models.SetPrice;
import com.google.gson.annotations.SerializedName;

public class TaxLine {
    @SerializedName("channel_liable")
    private Boolean channelLiable;

    private String price;
    @SerializedName("price_set")

    private SetPrice priceSet;

    private Float rate;

    private String title;

    }
