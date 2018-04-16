/*    
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Naming;
/**
 *
 * @author vatsalsmacbook
 */
public class RPSServer {
    RPSIntf rps;
    public RPSServer(){
        try{
            rps=new RPSImpl();
            Naming.rebind("rmi://localhost:1099//RPSGame",rps);
            
        }
        catch(Exception e){
            
        }
    }
    public static void main(String[] args) {
//        RPSIntf game1 = (RPSIntf)new RPSServer();
        new RPSServer();
        // Your Game Logic Comes Here
        
        
    }
}
