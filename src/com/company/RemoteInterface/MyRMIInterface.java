package com.company.RemoteInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRMIInterface extends Remote {

    public int addInt(int a, int b) throws RemoteException;

}
