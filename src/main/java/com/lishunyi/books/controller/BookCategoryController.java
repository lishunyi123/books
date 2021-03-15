package com.lishunyi.books.controller;

import com.lishunyi.books.entity.BookCategory;
import com.lishunyi.books.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/15 16:31
 **/
@RestController
@RequestMapping("/book-category")
public class BookCategoryController {

    @Autowired
    private BookCategoryService bookCategoryService;

    @GetMapping("/list-by-channel/{channel}")
    public List<BookCategory> findBookCategoryListByChannel(@PathVariable(value = "channel") Boolean channel) {
        return bookCategoryService.findBookCategoryListByChannel(channel);
    }
}
