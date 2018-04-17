/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar Jyani
 */
public interface RPSIntf extends java.rmi.Remote{
//    handle global variables and caccept user inputs
    public int register(char handPlayed) throws java.rmi.RemoteException;
    public boolean handPlayed()throws java.rmi.RemoteException;
    public String getResult(int id)throws java.rmi.RemoteException;

////  Called after both user have given their input
//    public String result() throws java.rmi.RemoteException;
//    
}
