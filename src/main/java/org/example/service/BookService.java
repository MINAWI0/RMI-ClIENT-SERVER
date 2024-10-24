package org.example.service;

import org.example.models.Books;

import java.rmi.Remote;
import java.sql.SQLException;
import java.util.List;

public interface BookService extends Remote {
    List<Books> getAllBooks() throws  SQLException;
    Books getBookByName(String name) throws SQLException;
}
