package com.company.Client;

import com.company.RemoteInterface.MyRMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientMain {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        MyRMIInterface serverLookUp = (MyRMIInterface) Naming.lookup("//localhost/MyServer");

        int a = 10;
        int b = 5;
        int response = serverLookUp.addInt(10, 5);
        System.out.println("Server response for 'addInt(" + a + ", " + b + ")' is: " + response);

    }
}
