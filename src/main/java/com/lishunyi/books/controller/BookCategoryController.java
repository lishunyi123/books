package com.lishunyi.books.controller;

import cn.hutool.core.bean.BeanUtil;
import com.lishunyi.base.http.Response;
import com.lishunyi.books.dto.BookCategoryDTO;
import com.lishunyi.books.entity.BookCategory;
import com.lishunyi.books.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/15 16:31
 **/
@RestController
@RequestMapping("/v1/book-category")
public class BookCategoryController {

    @Autowired
    private BookCategoryService bookCategoryService;

    @GetMapping("/{channel}")
    public Response<List<BookCategory>> findBookCategoryListByChannel(@PathVariable(value = "channel") Boolean channel) {
        return Response.success(bookCategoryService.findBookCategoryListByChannel(channel));
    }

    @PostMapping("/")
    public Boolean create(@RequestBody BookCategoryDTO dto) {
        BookCategory bookCategory = BeanUtil.copyProperties(dto, BookCategory.class);
        return bookCategoryService.saveBookCategory(bookCategory);
    }
}
