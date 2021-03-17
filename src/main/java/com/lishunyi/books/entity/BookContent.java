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
 * @since 2021/3/15 13:56
 **/
@EqualsAndHashCode(callSuper = true)
@Table(name = "book_content")
@Entity
@Data
@NoArgsConstructor
public class BookContent extends BaseEntity {
    private Long indexId;

    @Column(nullable = false, columnDefinition = "MEDIUMTEXT")
    private String content;
}
