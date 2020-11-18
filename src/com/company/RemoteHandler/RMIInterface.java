package com.company.RemoteHandler;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    public int addInt(int a, int b) throws RemoteException;

    public long quadrat(long sideLength) throws RemoteException;

}
