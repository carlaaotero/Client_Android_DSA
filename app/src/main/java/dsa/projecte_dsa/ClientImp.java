package dsa.projecte_dsa;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*Classe amb l'objectiu de crear una instància de la interfície Client utilitzant Retrofif
* per realitzar crides a l'API del servidor*/

public class ClientImp {

    //BASE_URL conté la URL base de l'API del servidor
    public static final String BASE_URL = "http://147.83.7.205:8080/dsaAPP/";

    private Client client;

    /*Constructor privat per evitar que es pugui instanciar externament,
    * només es podrà obtenir una instància de CLient amb getClient()*/
    private ClientImp(){

    }

    private Client getClient() {
        //Si encara no s'ha creat cap instància, es crea una nova instància
        if (client == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            client = retrofit.create(Client.class);
        }
        return client;

    }
}