package com.lishunyi.books.service.impl;

import com.lishunyi.books.entity.BookCategory;
import com.lishunyi.books.repository.BookCategoryRepository;
import com.lishunyi.books.service.BookCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/15 14:40
 **/
@Service
@Slf4j
public class BookCategoryServiceImpl implements BookCategoryService {

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    /**
     * 根据频道查询所有一级类目
     *
     * @param channel 频道：false男频；true女频
     * @return 一级类目集合
     */
    @Override
    public List<BookCategory> findBookCategoryListByChannel(Boolean channel) {
        return bookCategoryRepository.findAllByChannelAndParentId(channel, 0L);
    }

    /**
     * 添加类目
     *
     * @param bookCategory 类目对象
     * @return 是否成功
     */
    @Override
    public Boolean saveBookCategory(BookCategory bookCategory) {
        // 优化，从redis取值
        if (!bookCategory.getParentId().equals(0L)) {
            Optional<BookCategory> parentCategoryOptional = bookCategoryRepository.findById(bookCategory.getParentId());
            parentCategoryOptional.orElseThrow(() -> new RuntimeException("父类目不存在！"));
            if (!parentCategoryOptional.get().getParentId().equals(0L)) {
                throw new RuntimeException("最多只能有二级类目");
            }
        }
        bookCategoryRepository.save(bookCategory);
        return true;
    }
}
