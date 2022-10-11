package mx.ute.edu.recupera;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;

public class RCPServlet {
    public static void main(String[] args) throws XmlRpcException, IOException {
        System.out.println("inicializar server");
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();
        mapping.addHandler( "Methods", Methods.class);
        WebServer server = new WebServer(1200);
        server.getXmlRpcServer().setHandlerMapping(mapping);
        server.start();
        System.out.println("waiting request");

    }
}
