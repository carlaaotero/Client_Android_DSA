package dsa.projecte_dsa.Classes;

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
}
