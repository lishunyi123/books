package com.lishunyi.books.service.impl;

import com.lishunyi.books.entity.BookCategory;
import com.lishunyi.books.service.BookCategoryService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional(rollbackFor = Exception.class)
class BookCategoryServiceImplTest {

    @Autowired
    private BookCategoryService bookCategoryService;

    @Test
    void findBookCategoryListByChannel() {
        bookCategoryService.findBookCategoryListByChannel(false);
    }

    @Test
    void saveBookCategory() {
        Boolean bookCategory = bookCategoryService.saveBookCategory(BookCategory.builder()
                .categoryName("不好").channel(false).parentId(0L).sort(4).deleted(Boolean.TRUE).build());
        assertTrue(bookCategory);
    }
}