package dsa.projecte_dsa.Classes;

import okhttp3.Credentials;

public class Usuari {

    /*Llista d'atributs*/
    private String nom;
    private String cognom;
    private String nomUsuari;
    private String contra;
    boolean clau;
    private int vidas;
    private int coins;


    /*Constructor de la classe*/
    public Usuari(String nom, String cognom, String nomUsuari, String contra) {
        this.nom = nom;
        this.cognom = cognom;
        this.nomUsuari = nomUsuari;
        this.contra = contra;
        this.clau = false;
    }

    /*Getters i setters*/
    public String getUserDetails(){
        return  Credentials.basic("ausername","apassword");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getNomUsuari() {
        return nomUsuari;
    }

    public void setNomUsuari(String nomUsuari) {
        this.nomUsuari = nomUsuari;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public boolean getClau() {
        return clau;
    }

    public void setClau(boolean clau) {
        this.clau = clau;
    }
}


