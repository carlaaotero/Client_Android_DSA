package dsa.projecte_dsa;

import dsa.projecte_dsa.Classes.*;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
public interface Client {

        //Un usuari es registra
        @POST("/registre")
        Call<Void> registre(@Body RegisterComp register);
        //Un usuari inicia sessió
        @POST("/login")
        Call<Void> login(@Body LoginComp login);
        //Per auntenticar l'usuari
        @GET("/user")
        Call<Usuari> getUserDetails(@Header("Authorization") String credentials);
        //Retorna una llista amb els objectes de la botiga
        @GET("/shop")
        Call<Void> botiga(@Body Camiseta camiseta);
}
