package mx.ute.edu.recupera;

public class Methods {

    private BeanRegistro[] array;
    private int indice;

    public Methods(int longitud) { // se dan de alta
        array = new BeanRegistro[longitud];
    }

    public int setDatosAutos(String modelo, String marca, String color, int serie ) {//

        if (indice < array.length) {
            array[indice] = new BeanRegistro (modelo, marca, color, serie);
            indice++;
            return indice;
        } else {
            return -1;
        }
    }

    public int arregloBusqueda(String modelo) {//buscaqueda de modelo
        int i = 0;
        int resultado = -1;
        for (i = 0; i < indice; i++) {
            if (modelo.equals(array[i].getModelo())) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public void setModelo(int posicion, String modelo) {
        array[posicion].setModelo(modelo);

    }

    public String getModelo(int posicion) {
        String modelo;
        modelo = array[posicion].getModelo();
        return modelo;

    }

    public void setMarca(int posicion, String marca) {
        array[posicion].setMarca(marca);

    }

    public String getMarca(int posicion) {
        String marca;
        marca = array[posicion].getMarca();
        return marca;

    }

    public void setColor(int posicion, String color) {
        array[posicion].setColor(color);

    }

    public String getColor(int posicion) {
        String color;
        color = array[posicion].getColor();
        return color;

    }

    public void setSerie(int posicion, int serie) {
        array[posicion].setSerie(serie);

    }

    public int getSerie(int posicion) {
        int serie;
        serie = array[posicion].getSerie();
        return serie;

    }
}
