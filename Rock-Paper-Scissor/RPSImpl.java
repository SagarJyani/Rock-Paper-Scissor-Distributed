
import java.rmi.RemoteException;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vatsalsmacbook
 */

public class RPSImpl extends java.rmi.server.UnicastRemoteObject implements RPSIntf{

    static char playerHand[] = new char[2];
    static int win;
    static boolean seenResult[] = new boolean[2];
    public RPSImpl() throws RemoteException {        
        super();      
        playerHand[0] = 0;
        playerHand[1] = 0;
    }
    
    public void register(char handPlayed, int id) throws RemoteException {
        playerHand[id] = handPlayed;
        if (playerHand[0]!=0 && playerHand[1]!=0)   play();
    }
    
    public void play() throws RemoteException {
        win=calculate();
        String result=" Match "+ (win==0?("Won by Player "+0):(win==1?("Won by Player "+1):" tied"));
        System.out.println(result);
    }
    
    public boolean handPlayed(){
         return (playerHand[0]!=0 && playerHand[1]!=0);
    }

    private static void clear(){
        playerHand[0] = 0;
        playerHand[1] = 0;
        seenResult[0] = false;
        seenResult[1] = false;
    }
    
    public String getResult(int id){
       seenResult[id] = true;
       if(seenResult[0]&&seenResult[1]) clear();
       System.out.println(Arrays.toString(seenResult));
       return " Match "+ (win==0?("Won by Player "+0):(win==1?("Won by Player "+1):" tied"));
    }
    
    public static int calculate() {
//        if(playerHand[0] == 0 || playerHand[1] == 0)  return -2;
        if(playerHand[0] == 'r'){
            if (playerHand[1] == 'p') return 1;
            if (playerHand[1] == 's') return 0;
            else return -1;
        }
        if(playerHand[0] == 'p'){
            if (playerHand[1] == 's') return 1;
            if (playerHand[1] == 'r') return 0;
            else return -1;
        }
        if(playerHand[0] == 's'){
            if (playerHand[1] == 'r') return 1;
            if (playerHand[1] == 'p') return 0;
            else return -1;
        }
        return -2;
    }
    
}
