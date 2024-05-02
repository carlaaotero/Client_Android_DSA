package dsa.projecte_dsa.Classes;

public class Usuari {

    /*Llista d'atributs*/
    private String id;
    private String nom;
    private String cognom;
    private String nomUsuari;
    private String contra;

    /*Constructor de la classe*/
    public Usuari(String id, String nom, String cognom, String nomUsuari, String contra) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.nomUsuari = nomUsuari;
        this.contra = contra;
    }
    /*Getters i setters*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}


