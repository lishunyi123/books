package com.lishunyi.books.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/15 13:47
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
@Table(name = "book_category")
@SQLDelete(sql = "update book_category set is_deleted = 1 where id = ?")    // JpaRepository.delete删除时，不做实际删除，变更删除字段
@Where(clause = "is_deleted = 0")    // JpaRepository查询时，携带的查询条件，（未逻辑删除的）
@Builder
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
public class BookCategory extends BaseEntity {

    private Long parentId;

    private Boolean channel;

    private String categoryName;

    @Column(nullable = false, columnDefinition = "TINYINT", length = 4)
    private Integer sort;
}
