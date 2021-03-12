package com.lishunyi.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/12 11:15
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "book")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BaseEntity {

    @Column
    private String bookName;

    @Column
    private Boolean bookEnable;

    @Column
    private String bookDesc;

    @Column
    private Long categoryId;

    @Column
    private Boolean bookStatus;

    @Column
    private Long authorId;

    @Column
    private String authorName;
}
