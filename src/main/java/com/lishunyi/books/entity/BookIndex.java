package com.lishunyi.books.entity;

import com.lishunyi.jpa.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/15 13:52
 **/
@EqualsAndHashCode(callSuper = true)
@Table(name = "book_index")
@Entity
@Data
@NoArgsConstructor
public class BookIndex extends BaseEntity {

    private Long bookId;

    private Integer indexNum;

    private String indexName;

    private Integer wordCount;

    @Column(name = "is_vip")
    private Boolean vip;
}
