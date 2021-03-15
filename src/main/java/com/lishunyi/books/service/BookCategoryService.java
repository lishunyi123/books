package com.lishunyi.books.service;

import com.lishunyi.books.entity.BookCategory;

import java.util.List;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/15 14:39
 **/
public interface BookCategoryService {

    /**
     * 根据频道查询所有一级类目
     *
     * @param channel 频道：false男频；true女频
     * @return 一级类目集合
     */
    List<BookCategory> findBookCategoryListByChannel(Boolean channel);

    /**
     * 添加类目
     *
     * @param bookCategory 类目对象
     * @return 是否成功
     */
    Boolean saveBookCategory(BookCategory bookCategory);
}
