import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.util.Random;
import java.net.*;
//import sun.net.InetAddressCachePolicy;

import java.lang.String;


public class randomNum{

	public static void main(String[] args) throws IOException{
		System.out.println("Waiting for client");
		InetAddress address = InetAddress.getByName("<IP ADDRE>");
		//byte[] ipaddress = new byte[]{i.p address}; 
		//InetAddress add = InetAddress.getByAddress(ipaddress);
		ServerSocket server = new ServerSocket( 8999,50,address); //8081
		


		while(true){
			//spin forever
			Random rand = new Random();
    		int number = rand.nextInt(1000000);
			try(Socket socket = server.accept()) {
				
				String s = String.valueOf(number);
				System.out.println("Connection Established");
				//socket.getOutputStream().write(s.getBytes("UTF-8"));
				OutputStream outputStream = socket.getOutputStream();
				PrintWriter printWriter = new PrintWriter(outputStream);
				printWriter.println("HTTP/1.0 200 OK");
				printWriter.println("");
				printWriter.println("<html>");
				printWriter.println("<body>");
				printWriter.println("<h1>WelCome to Software & Recq </h1>");
				printWriter.println("<h2> Random Number: " + s );
				printWriter.println("</body>");
				printWriter.println("</html>");
				printWriter.flush();						
			}
			catch(IOException e){
				System.out.println("Could not creat connection...");
				System.out.println(e);
			}
		
		}
		
		
	}
}