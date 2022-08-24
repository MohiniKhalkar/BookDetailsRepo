package com.csi.service;

import com.csi.dao.BookDao;
import com.csi.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    public Book savedata(Book book) {
        return bookDao.savedata(book);
    }

    public List<Book> getalldata() {
        return bookDao.getalldata();
    }

    public Book updateData(Book book) {
      return   bookDao.updateData(book);
    }

    public void deleteDataById(long bookId) {
        bookDao.deleteDataById(bookId);
    }
}