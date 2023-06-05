package com.example.curdonlineapi;

import com.google.gson.annotations.SerializedName;

public class SetPrice {
    @SerializedName("shop_money")
    private ShopMoney shopMoney;

    @SerializedName("presentment_money")
    private PresentmentMoney presentmentMoney;
}
