package org.microsoft.xlw.net;

import javax.sound.midi.Receiver;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 熊立伟
 * @version 1.0
 * @date 2019-07-31 16:44
 */
public class main {
    public static Socket socket=null;
    public static   Scanner sc=null;
    public static  Scanner scs=null;
    public static PrintWriter pw=null;
    public static void main(String[] args) throws IOException {
     Socket socket=new Socket("127.0.0.1",9000);
        Scanner sc=new Scanner(socket.getInputStream());//网络输入流
        Scanner scs=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);

//while (true){
//    String str=sc.nextLine();
//    System.out.println("服务器端说："+str);
//    System.out.println("请输入");
//    pw.println(scs.next());
//}
        new Thread(new receive()).start();

        new Thread(new send()).start();
        }


        }
class receive implements Runnable {
    @Override

    public void run() {

        while (true){
            String str=main.sc.nextLine();
            System.out.println("服务器端说："+str);

        }
    }
}
class send implements Runnable {
    @Override

    public void run() {

        while (true){

            System.out.println("请输入");
            main.pw.println(main.scs.next());
        }
    }
}