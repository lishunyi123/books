package com.lishunyi.books.repository;

import com.lishunyi.books.entity.BookCategory;
import com.lishunyi.jpa.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/15 14:11
 **/
@Repository
public interface BookCategoryRepository extends BaseRepository<BookCategory, Long> {
    List<BookCategory> findAllByChannelAndParentId(boolean channel, Long parentId);
}
