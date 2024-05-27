import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class cliente {
    public static void main(String[] args) {
        Registry registro;
        interfaz objetoRemoto;
        try {
            registro = LocateRegistry.getRegistry("172.31.115.130", 1099);
            // crear una instancia de la implementacion de la interfaz

            objetoRemoto = (interfaz) registro.lookup("ClienteRemoto");

            String mensaje = objetoRemoto.mensaje();
            System.out.println(mensaje);
            double respuesta = objetoRemoto.suma(5, 9);
            System.out.println(respuesta);

        } catch (AccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
