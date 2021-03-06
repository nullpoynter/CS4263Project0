import java.util.Random;
import java.lang.String;
import java.net.*;
import java.io.*;

public class randomNum{

	public static void main(String[] args) throws IOException{
		System.out.println("Waiting for client");
		InetAddress address = InetAddress.getLocalHost();
		//InetAddress address = InetAddress.getByName(<IP Address>);       //use only for pc's ip address
		ServerSocket server = new ServerSocket(8080);       //creates the port available to given i.p address
		System.out.println(address);
		
		//spins forever unless user enter the default address of the port
		while(true){
			Random rand = new Random();                         //object of the given class
    			int number = rand.nextInt(1000000);                 //generates random number 
			try(Socket socket = server.accept()) {
				
				String s = String.valueOf(number);	    //converts int to string
				System.out.println("Connection Established");
				OutputStream outputStream = socket.getOutputStream();  //helps to catch STDOUT and pass it  
				PrintWriter printWriter = new PrintWriter(outputStream);  //writer to a file
				printWriter.println("HTTP/1.0 200 OK");                   //default simple HTTP response
				printWriter.println("");
				printWriter.println("<html>");
				printWriter.println(s);
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
