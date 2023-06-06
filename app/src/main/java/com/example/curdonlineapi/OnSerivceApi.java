package com.example.curdonlineapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OnSerivceApi {
    @GET("renukaTemplates")
    Call<List<Shop>> getApiDetails();
}
