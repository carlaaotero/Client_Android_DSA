package dsa.projecte_dsa.Classes;

import java.util.ArrayList;
import java.util.List;

public class Camiseta {
    String color;
    int preu;
    /*Constructor de la classe*/
    public Camiseta(String color, int preu){
        this.color = color;
        this.preu = preu;
    }
     /*Getters i setters*/
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getPreu() {
        return preu;
    }
    public void setPreu(int preu) {
        this.preu = preu;
    }

    public static List<Camiseta> getCamiseta() {
        List<Camiseta> articles = new ArrayList<>();
        articles.add(new Camiseta("Vermella", 25));
        articles.add(new Camiseta("Verda", 28));
        articles.add(new Camiseta("Negra", 25));
        articles.add(new Camiseta("Groga", 58));
        return articles;
    }
}
