package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;


public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
        try
        {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

            //Se enviarán dos mensajes
           
                //Se escribe en el servidor usando su flujo de datos
           salidaServidor.writeUTF("Ese Guli como molas!!!");
            

            cs.close();//Fin de la conexión

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}