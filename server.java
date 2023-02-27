import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//ACHINTYA BHAVARAJU
public class server {
	public static void main(String[] args) throws Exception{
		//create server TCP socket
		 ServerSocket server=new ServerSocket(5000);
		 
		 //list client wait time
		 System.out.println("Server started"); 
         System.out.println("Waiting for a client ..."); 
         //wait for accept
		 Socket socket = server.accept(); 
	//declare when client joins server
		 System.out.println("Client has joined sharing ");
		 
         DataInputStream  readInput   = new DataInputStream(socket.getInputStream());
	     DataOutputStream writeOutput     = new DataOutputStream(socket.getOutputStream());
	     
	     Scanner ip = new Scanner(System.in);
	     
//wait to get the stream socket
	     String lines=readInput.readUTF();
	     
//file writen
	     FileWriter myWriter = new FileWriter("/home/achintya/Desktop/achi.txt");
	     myWriter.write(lines);
	     myWriter.close();
	     
	     //close server
	     server.close();
	     //close socket
	     socket.close();
	     writeOutput.close();
	     readInput.close();
	     ip.close();
		//list that it is closed
	}
}

