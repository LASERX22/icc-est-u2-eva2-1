package controllers;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Book;

public class LibroController{

    public Set<Book> procesarLibros(List<Book> libros){
        // for (Book book : libros) {
        //     books.add(book);
        // }
        
        return new TreeSet<>(libros);
        
    }    
}
