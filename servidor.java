import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class servidor {
    public static void main(String[] args) {
        try {
            // crear una instancia de implementacion de la interfaz
            interfaz objetoRemoto = new ImplementacionInterfaz();
            // crear registro RMI en un puerto especifico

            Registry registro = LocateRegistry.createRegistry(1099);
            // vincular implementacion remota con un nombre especifico
            registro.rebind("ClienteRemoto", objetoRemoto);

            System.out.println("Servidor iniciado");
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
