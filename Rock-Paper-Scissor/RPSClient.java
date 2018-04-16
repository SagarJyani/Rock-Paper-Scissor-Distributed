/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Naming;
import java.util.*;
/**
 *
 * @author vatsalsmacbook
 */
public class RPSClient {
    public static void main(String[] args) {
        try{
            RPSIntf rps=(RPSIntf)Naming.lookup("rmi://localhost//RPSGame");
            Scanner sc=new Scanner(System.in);
            int id=sc.nextInt();
            sc.nextLine();
            char ch='a';
            char play = 't';
            while(true){
                while(true){
                    ch=sc.nextLine().charAt(0);
                    if(ch=='r'||ch=='p'||ch=='s') break;
                }
                rps.register(ch, id);
                while(!rps.handPlayed());
                System.out.println(rps.getResult(id));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
