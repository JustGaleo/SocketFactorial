package sockets;
import java.net.*;
import java.util.Scanner;
public class Emisor {
		public static void main(String [] args){
                try {
                    String IP;
                    int Puerto;
                    String mensaje;
                    
                    Scanner entrada = new Scanner(System.in);
                    
                    System.out.println("Teclee el numero que guste mayor a 0");
                    mensaje = entrada.nextLine();
                    
                    System.out.println("Teclee la IP");
                    IP = entrada.nextLine();
                    InetAddress maquinaReceptora = InetAddress.getByName(IP);
                    
                    System.out.println("Teclee el puerto");
                    Puerto = entrada.nextInt();

                  
                    
                    byte[ ] almacen = mensaje.getBytes(); 
                    
                    DatagramSocket MiSoc = new DatagramSocket();
                    DatagramPacket datagrama = new DatagramPacket(almacen, almacen.length, maquinaReceptora, Puerto);
                    MiSoc.send(datagrama);
                    MiSoc.close( );
                    } 
                catch (Exception ex) {
                    ex.printStackTrace( ) ;
                } 
        }
}
