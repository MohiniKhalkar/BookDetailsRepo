package com.csi.dao;

import com.csi.model.Book;
import com.csi.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDao {
    @Autowired
    BookRepo bookRepo;

    public Book savedata(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> getalldata() {
        return bookRepo.findAll();
    }

    public Book updateData(Book book) {
        return bookRepo.save(book);
    }

    public void deleteDataById(long bookId) {
        bookRepo.deleteById(bookId);
    }
}
