package com.example.tarea2_2;

import com.example.tarea2_2.ContentModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ContentApi {
    String Ruta0 = "/posts";
    String Ruta1= "/posts/{valor}";

    @GET(Ruta0)
    Call<List<ContentModel>> getContents();
    @GET(Ruta1)
    Call<ContentModel> getContent(@Path("valor") String valor);
}
