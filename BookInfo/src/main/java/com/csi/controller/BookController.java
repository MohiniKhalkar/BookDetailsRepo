package com.csi.controller;

import com.csi.model.Book;
import com.csi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/savedata")
    public ResponseEntity<Book> saveData(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.savedata(book));
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Book>> getAllData() {
        return ResponseEntity.ok(bookService.getalldata());
    }

    @GetMapping("/say")
    public String sayHello() {
        return "WLCOME TO INDI";
    }


    @GetMapping("/priyanka")
    public String sayPriyanka() {
        return "here Priyanka";
    }

    @GetMapping("/herepractise")
    public String herepractise() {
        return "here ";
    }
    @PutMapping("/updateData/{bookId}")
    public ResponseEntity<Book> updateData(@PathVariable long bookId, @RequestBody Book book) {
        return ResponseEntity.ok(bookService.updateData(book));

    }

    @DeleteMapping("/deleteDataById/{bookId}")
    public ResponseEntity<String> deleteDataById(@PathVariable long bookId) {
        bookService.deleteDataById(bookId);
        return ResponseEntity.ok("Data Deleted Successfully");
    }

}
