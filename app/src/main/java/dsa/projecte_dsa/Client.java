package dsa.projecte_dsa;

import dsa.projecte_dsa.Classes.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
public interface Client {

        @POST("/registre")
        Call<Void> registre(@Body Usuari register);
        @POST("/login")
        Call<Void> login(@Body LoginComp login);

        //Per auntenticar l'usuari
        @GET("user")
        Call<Usuari> getUserDetails(@Header("Authorization") String credentials);
        @GET("/shop")
        Call<Void> botiga(@Body Camiseta camiseta);
}
