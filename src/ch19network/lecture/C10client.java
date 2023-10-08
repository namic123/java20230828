package ch19network.lecture;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class C10client {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("172.30.1.81",7000);
           Writer writer = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bos = new BufferedWriter(writer);
            try(socket;writer;bos;){
                Scanner scanner = new Scanner(System.in);
                while(true){
                    System.out.println("입력 >");
                    String chat = scanner.nextLine();
                    bos.write(chat);
                    bos.newLine();
                    bos.flush();
                    if(chat.equals("out")) break;
                }
            }

        }catch (IOException e){e.printStackTrace();}

    }
    
}
