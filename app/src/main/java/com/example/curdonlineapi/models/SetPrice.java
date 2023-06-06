package com.example.curdonlineapi.models;

import com.example.curdonlineapi.models.Money;
import com.google.gson.annotations.SerializedName;

public class SetPrice {
    @SerializedName("shop_money")
    private Money shopMoney;

    @SerializedName("presentment_money")
    private Money presentmentMoney;


}
