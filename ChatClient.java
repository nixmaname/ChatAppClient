import java.io.DataInputStream;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient implements Runnable {
    private static Socket clientSocket = null;
    private static PrintStream outS = null;
    private static DataInputStream inS = null;
    private static BufferedReader inputLine = null;
    private static boolean closed = false;
    public static void main(String[] args) {
        int portNumber = 6969;
        String ip = "172.20.10.12"; // IP we're connected on, otherwise use "localhost"
