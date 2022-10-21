package br.ucsal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class JogoDaVelha {

	public static void main(String[] args) throws IOException, IOException{
		
		ServerSocket socket;
		socket = new ServerSocket(4235);
		System.out.println("Servidor Alessandro");
		while(true) {
			Socket ssocket	= socket.accept();
			ServidorThead srun = new ServidorThead(ssocket);
			Thread thread = new Thread (srun);
			thread.start();
		}
	}

}
