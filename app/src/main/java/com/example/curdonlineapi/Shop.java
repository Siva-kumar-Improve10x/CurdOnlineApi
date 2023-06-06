package com.example.curdonlineapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Shop {
    @SerializedName("_id")
    private String id;
    private Integer shopId;
    @SerializedName("admin_graphql_api_id")
    private String adminApiId;
    @SerializedName("app_id")
    private Integer appId;
    @SerializedName("browser_ip")
    private String browserIp;
    @SerializedName("buyer_accepts_marketing")
    private Boolean buyerAccepts;
    @SerializedName("cancel_reason")
    private String cancelReason;
    @SerializedName("cancelled_at")
    private String cancelled;
    @SerializedName("cart_token")
    private String cartToken;
    @SerializedName("checkout_id")
    private Integer checkoutId;
    @SerializedName("checkout_token")
    private String clientToken;
    @SerializedName("client_details")
    private ClientDetails clientDetails;
    @SerializedName("closed_at")
    private String closeAt;
    private Boolean confirmed;
    @SerializedName("created_at")
    private String createdAt;
    private String currency;
    @SerializedName("current_subtotal_price")
    private String currentSubtotal;
    @SerializedName("current_subtotal_price_set")
    private SetPrice setPrice;
    @SerializedName("current_total_discounts")
    private String currentDiscounts;
    @SerializedName("current_total_discounts_set")
    private SetPrice currentTotalDiscountsSet;
    @SerializedName("current_total_duties_set")
    private String currentTotalDutiesSet;
    @SerializedName("current_total_price")
    private String currentTotalPrice;
    @SerializedName("current_total_price_set")
    private SetPrice currentTotalPriceSet;
    @SerializedName("current_total_tax")
    private String currentTotalTax;
    @SerializedName("current_total_tax_set")
    private SetPrice currentTotalTaxSet;
    @SerializedName("customer_locale")
    private String customerLocale;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("discount_codes")
    private List<String> discountCodes;
    @SerializedName("estimated_taxes")
    private Boolean estimatedTaxes;
    @SerializedName("financial_status")
    private String financialStatus;
    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;
    private String gateway;
    @SerializedName("landing_site")
    private String landingSite;
    @SerializedName("landing_site_ref")
    private String landingSiteRef;
    @SerializedName("location_id")
    private String locationId;
    @SerializedName("note_attributes")
    private List<String> noteAttributes;
    private Integer number;
    @SerializedName("order_number")
    private Integer orderNumber;
    @SerializedName("order_status_url")
    private String orderStatusUrl;
    @SerializedName("original_total_duties_set")
    private String originalTotalDutiesSet;
    @SerializedName("presentment_currency")
    private String presentmentCurrency;
    @SerializedName("processed_at")
    private String processedAt;
    @SerializedName("processing_method")
    private String processingMethod;
    private String reference;
    @SerializedName("referring_site")
    private String referringSite;
    @SerializedName("source_identifier")
    private String sourceIdentifier;
    @SerializedName("source_name")
    private String sourceName;
    @SerializedName("source_url")
    private String sourceUrl;
    @SerializedName("subtotal_price")
    private String subtotalPrice;
    @SerializedName("subtotal_price_set")
    private SetPrice subtotalPriceSet;
    @SerializedName("taxes_included")
    private Boolean taxesIncluded;
    private Boolean test;
    private String tags;
    private String token;
    @SerializedName("total_discounts")
    private String totalDiscounts;
    @SerializedName("total_discounts_set")
    private SetPrice totalDiscountsSet;
    @SerializedName("total_line_items_price")
    private String totalLineItemsPrice;
    @SerializedName("total_line_items_price_set")
    private SetPrice totalLineItemsPriceSet;
    @SerializedName("total_outstanding")
    private String totalOutStanding;
    @SerializedName("total_price")
    private String totalPrice;
    @SerializedName("total_price_set")
    private SetPrice totalPriceSet;
    @SerializedName("total_price_usd")
    private String totalPriceUsd;
    @SerializedName("total_tax")
    private String totalTax;
    @SerializedName("total_shipping_price_set")
    private SetPrice totalShippingPriceSet;
    @SerializedName("total_tax_set")
    private SetPrice totalTaxSet;
    @SerializedName("total_tip_received")
    private String totalTipReceived;
    @SerializedName("total_weight")
    private Integer totalWeight;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("discount_applications")
    private List<String> discountApplications;
    private List<String> fulFillments;
    @SerializedName("line_items")
    private List<LineItems> lineItems;
    @SerializedName("payment_terms")
    private String paymentTerms;
    private List<String> refunds;

}
