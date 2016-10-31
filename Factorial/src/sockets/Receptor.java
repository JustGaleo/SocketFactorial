package sockets;

import java.net.*;
import java.util.Scanner;

public class Receptor {
		public static void main(String [] args){
				try {
                                        
					int num;
					final int MAX_LON = 10;
					int puerto;
					Scanner entrada = new Scanner(System.in);
					System.out.println("Teclee el puerto");
					puerto = entrada.nextInt();

					DatagramSocket MiSoc = new DatagramSocket (puerto);
					byte[] almacen = new byte[MAX_LON];
                                
					DatagramPacket datagrama = new DatagramPacket (almacen, MAX_LON);
					MiSoc.receive (datagrama);
					String mensaje = new String(almacen);

					num = Integer.parseInt(mensaje.trim());
					long factorial = 1;
					while ( num!=0) {
						factorial=factorial*num;
						num--;
						}
					System.out.println("El factorial es " + factorial);
					MiSoc.close( );

				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}	
}
