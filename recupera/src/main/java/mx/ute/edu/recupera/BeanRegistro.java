package mx.ute.edu.recupera;

public class BeanRegistro {

    private String modelo;
    private String marca;
    private String color;
       private int   serie;

    public BeanRegistro(String modelo, String marca, String color, int serie ){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.serie = serie;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
