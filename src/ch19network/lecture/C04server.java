package ch19network.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C04server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            try (serverSocket; socket; os; osw; bw;) {
                bw.write("안녕하십니까 행님 :)");

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
