package number;                        //declarde the Class package name
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.util.Random;
import java.net.*;                                                                                                                                                                
import java.lang.String;

/*    This is the child class generates the random number and returns the output
*     to its parent class.
*/
public class randomNum{
    public static String num( ){                            //method that returns the string
        Random rand =  new Random();                        //an object of Random class
        int num = rand.nextInt(1000000);                    //generates random number
        String returnNum = String.valueOf(num);             //convert integer to string

        return returnNum;                                   //returns the random number.
   }
}
