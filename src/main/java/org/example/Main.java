package org.example;

import org.example.service.BookService;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            BookService server = (BookService) registry.lookup("BookServiceImpl");
            System.out.println(server.getAllBooks());
        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}