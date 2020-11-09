package com.company.Server;

import com.company.RemoteInterface.MyRMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerMain extends UnicastRemoteObject implements MyRMIInterface {

    protected ServerMain() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("//localhost/MyServer", new ServerMain());
        } catch (RemoteException | MalformedURLException e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }

    @Override
    public int addInt(int a, int b) throws RemoteException {
        return a + b;
    }
}
