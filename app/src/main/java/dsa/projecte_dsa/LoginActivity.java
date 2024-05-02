package dsa.projecte_dsa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    /*Declaració de variables */
    private EditText nomUsuari;
    private EditText contra;
    private Button loginButton;
    private Button registreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*Assignació de les referències als elements de la interfície*/
        nomUsuari = findViewById(R.id.nomUsuari);
        contra = findViewById(R.id.contra);
        loginButton = findViewById(R.id.loginButton);
        registreButton = findViewById(R.id.registreButton);

        /*Es defineix l'esdeveniment de click per al botó Login*/
        loginButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //S'obté les dades introduïdes per l'usuari
                String username = nomUsuari.getText().toString();
                String password = contra.getText().toString();

                //Validem les credencials de l'usuari
                if (validarLogin(username, password)) {
                    //Si les credencials són correctes, redirigeix l'usuari a l'activitat principal del joc
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Tanca l'activitat actual per prevenir que l'usuari pugui tornar enrere
                } else {
                    //Si les credencials NO son correctes, mostra un missatge d'error a l'usuari
                    Toast.makeText(LoginActivity.this, "Nom d'usuari o contra incorrectes", Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*Es defineix l'esdeveniment de click per al botó Registre*/
        registreButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Redirigeix a l'usuari a l'activitat de registre
                Intent intent = new Intent(LoginActivity.this, RegistreActivity.class);
                startActivity(intent);
            }
        });
    }
    /*Mètode per validar les credencials de l'usuari*/
    private boolean validarLogin(String nomUsuari, String contra){
        //FALTA FER API

        return true;
    }
}

