package com.lishunyi.books.repository;

import com.lishunyi.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/12 11:41
 **/
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
