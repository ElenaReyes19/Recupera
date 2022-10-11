package mx.ute.edu.recupera;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class RCPClient {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Scanner leer = new Scanner(System.in);
        String modelo, marca, color;
        int serie;
        int numAutos=0, opcMenu=0, posicion = 0;

        Methods arrayAutos;
        arrayAutos = new Methods(numAutos);

        System.out.println("Bienvenido ingrese los datos del auto a registrar ");
        System.out.println("Ingrese el numero de  productos que se registraran");
        numAutos = leer.nextInt();

        do {

            System.out.println("Menú");
            System.out.println("1.- Ingresar datos del Auto");
            System.out.println("2.- Imprimir Datos");
            System.out.println("3.- Salir");
            opcMenu = leer.nextInt();

            switch (opcMenu) {
                case 1:
                System.out.println("Modelo");
                modelo = sc.nextLine();
                System.out.println("Marca");
                marca = sc.nextLine();
                System.out.println("Color");
                color = sc.nextLine();
                System.out.println("Numero de serie");
                serie = sc.nextInt();
                arrayAutos.setDatosAutos(modelo, marca, color, serie);
                System.out.println("Se han registrado los datos");
                    break;
                case 2:
                    System.out.println("Ingrese el modelo del auto que desee consultar");
                    modelo= leer.next();
                    posicion = arrayAutos.arregloBusqueda(modelo);
                    if (posicion != -1) {
                        System.out.println("Datos del Auto ");
                        System.out.println("Modelo: " + arrayAutos.getModelo(posicion));
                        System.out.println("Marca: " + arrayAutos.getMarca(posicion));
                        System.out.println("Color: " + arrayAutos.getColor(posicion));
                        System.out.println("Serie: " + arrayAutos.getSerie(posicion));
                    } else {
                        System.out.println("modelo no encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Salio del sistema...");
                    break;
                default:
                    System.out.println("Opcion erronea...");
            }
        }while (opcMenu != 3);


    }
}

 // se lloro, pero se intento :(
