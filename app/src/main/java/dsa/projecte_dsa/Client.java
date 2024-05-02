package dsa.projecte_dsa;

import dsa.projecte_dsa.Classes.Usuari;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
public interface Client {

        @POST("/registre")
        Call<Void> registre(@Body Usuari register);
        @POST("/login")
        Call<Void> login(@Body Usuari login);
        @GET("/shop")
        Call<Void> botiga()
}
