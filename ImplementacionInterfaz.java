import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplementacionInterfaz extends UnicastRemoteObject implements interfaz {

    // Constructor
    public ImplementacionInterfaz() throws RemoteException {
        super();
    }

    // Implemetar los metodos indicados en la intefaz
    public String mensaje() throws RemoteException {
        return "Hola desde el servidor";

    }

    public double suma(double a, double b) throws RemoteException {
        return a + b;

    }

}