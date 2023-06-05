package com.example.curdonlineapi;

import com.google.gson.annotations.SerializedName;

public class Shop {
    @SerializedName("_id")
    private String shopId;

    private Integer id;

    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;

    @SerializedName("app_id")
    private Integer appId;

    @SerializedName("buyer_accepts_marketing")
    private Boolean buyerAcceptsMarketing;

    @SerializedName("browser_ip")
    private Float browserIp;

    @SerializedName("cancel_reason")
    private String cancelReason;

    @SerializedName("cancelled_at")
    private String cancelledAt;

    @SerializedName("cart_token")
    private String cartToken;

    @SerializedName("checkout_id")
    private Integer checkoutId;

    @SerializedName("checkout_token")
    private String checkoutToken;

    @SerializedName("client_details")
    private ClientDetails clientDetails;

    @SerializedName("closed_at")
    private String closedAt;

    private Boolean confirmed;

    @SerializedName("created_at")
    private String createdAt;

    private String currency;

    @SerializedName("current_subtotal_price")
    private String currentSubtotalPrice;

    @SerializedName("current_subtotal_price_set")
    private SetPrice setPrice;

}
