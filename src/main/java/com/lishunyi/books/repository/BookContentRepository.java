package com.lishunyi.books.repository;

import com.lishunyi.books.entity.BookContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/15 14:07
 **/
@Repository
public interface BookContentRepository extends JpaRepository<BookContent, Long> {
}
