package dsa.projecte_dsa.Classes;

import java.util.ArrayList;
import java.util.List;

public class Botiga {
    String color;
    String descripcio;
    int preu;
    String imatge;


    /*Constructor de la classe*/
    public Botiga(String color, String descripcio, int preu, String imatge){
        this.color = color;
        this.descripcio = descripcio;
        this.preu = preu;
        this.imatge = imatge;
    }
     /*Getters i setters*/
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripció() {
        return descripcio;
    }

    public void setDescripció(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getPreu() {
        return preu;
    }
    public void setPreu(int preu) {
        this.preu = preu;
    }

    public String getImatge() {
        return imatge;
    }

    public void setImatge(String imatge) {
        this.imatge = imatge;
    }



    public static List<Botiga> getCamiseta() {
        List<Botiga> articles = new ArrayList<>();
        articles.add(new Botiga("Vermella", "Guanyes una vida", 1, "https://i.pinimg.com/originals/2e/52/ab/2e52ab40fa59208c7f2d9c87f4a0227a.png"));
        articles.add(new Botiga("Verda", "Tens més temps", 2, "https://i.pinimg.com/originals/31/65/df/3165dfaa0fac0ca61802f9cdc1aef4d0.png"));
        articles.add(new Botiga("Negra", "Obtens una pista", 3, "https://s.namemc.com/3d/skin/body.png?id=6e52bc59debf0ea9&model=classic&width=308&height=308"));
        articles.add(new Botiga("Groga", "Recompensa", 4,"https://s.namemc.com/3d/skin/body.png?id=9489e7e4724918e8&model=slim&width=308&height=308" ));
        return articles;
    }
    public static String getColorCamiseta(List<Botiga> articles, int num){
        //comprovem si el num està dins del rang vàlid
        if (num >= 0 && num < articles.size()) {
            return articles.get(num).getColor();
        } else {
            return null;
        }
    }

    public static int getPreuCamiseta(List<Botiga> articles, int num){
        //comprovem si el num està dins del rang vàlid
        if (num >= 0 && num < articles.size()) {
            return articles.get(num).getPreu();
        } else {
            return 0;
        }
    }

    public static String getDescripcioCamiseta(List<Botiga> articles, int num){
        //comprovem si el num està dins del rang vàlid
        if (num >= 0 && num < articles.size()) {
            return articles.get(num).getDescripció();
        } else {
            return null;
        }
    }

    public static String getImatgeCamiseta(List<Botiga> articles, int num){
       //comprovem si el num està dins del rang vàlid
        if (num >= 0 && num < articles.size()) {
            return articles.get(num).getImatge();
        } else {
            return null;
        }
    }
}
