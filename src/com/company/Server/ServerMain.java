package com.company.Server;

import com.company.RemoteHandler.RMIExecutor;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMain {
   public static void main(String[] args) throws RemoteException {
        Registry reg = LocateRegistry.createRegistry(1099);
        reg.rebind("MyRMI", new RMIExecutor());
        System.err.println("Server created");
    }
}
