package com.example.curdonlineapi.network;

import com.example.curdonlineapi.models.Shop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OnSerivceApi {
    @GET("renukaTemplates")
    Call<List<Shop>> getApiDetails();
}
