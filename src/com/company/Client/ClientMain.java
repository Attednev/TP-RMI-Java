package com.company.Client;

import com.company.RemoteHandler.RMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientMain {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        RMIInterface rmiExecutor = (RMIInterface) Naming.lookup("rmi://localhost/MyRMI");
        int a = 10;
        int b = 5;
        int response = rmiExecutor.addInt(a, b);
        System.out.println("Server response for 'addInt(" +
                a + ", " + b + ")' is: " + response);
        long sideLength = 10;
        long responseQuadrat = rmiExecutor.quadrat(sideLength);
        System.out.println("Server response for 'quadrat(" +
                sideLength + ")' is: " + responseQuadrat);
    }
}
