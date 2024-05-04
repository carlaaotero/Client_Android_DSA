package dsa.projecte_dsa;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import dsa.projecte_dsa.Classes.Usuari;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UsuariActivity extends AppCompatActivity {
    private static final String TAG = "UsuariActivity";
    private Client client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuari);

        // Configurar Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("URL_BASE_DE_TU_API")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Crear una instància de la interfície de la API
        client = retrofit.create(Client.class);

        // Exemple de trucada a l'API per obtenir detalls de l'usuari
        obtenerDetallesUsuario("TOKEN_DE_AUTORIZACIÓN_DEL_USUARIO");
    }

    private void obtenerDetallesUsuario(String token) {
        Call<Usuari> call = client.getUserDetails("Bearer " + token);
        call.enqueue(new Callback<Usuari>() {
            @Override
            public void onResponse(Call<Usuari> call, Response<Usuari> response) {
                if (response.isSuccessful()) {
                    Usuari usuario = response.body();
                    // Procesar els paràmetres rebuts de l'usuari
                    Log.d(TAG, "Paràmetres de l'usuari: " + usuario.toString());
                } else {
                    // Manejar el cas en que la sol·licitud no és exitosa
                    Log.e(TAG, "Error a l'obtenir paràmetres de l'usuari: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<Usuari> call, Throwable t) {
                // Manejar el cas d'error de la solicitud
                Log.e(TAG, "Error en la solicitud: " + t.getMessage(), t);
            }
        });
    }
}
