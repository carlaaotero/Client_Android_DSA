package dsa.projecte_dsa;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ClientImp {

    public static final String BASE_URL = "http://147.83.7.205:8080/dsaAPP/";

    private Client client;
    private ClientImp() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        client = retrofit.create(Client.class);
    }
}