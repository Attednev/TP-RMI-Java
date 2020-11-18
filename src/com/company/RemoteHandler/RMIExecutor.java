package com.company.RemoteHandler;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIExecutor extends UnicastRemoteObject implements RMIInterface {
    public RMIExecutor() throws RemoteException {
        super();
    }

    @Override
    public int addInt(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public long quadrat(long sideLength) throws RemoteException {
        return sideLength * sideLength;
    }
}
