import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception
    {
        String ip = "localhost";
        int port = 9999;
        Socket s = new Socket(ip,port);

        String str = "Faraz Ali Ahmad";

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter output = new PrintWriter(os);
        os.write(str);

        os.flush();
    }
    
}
