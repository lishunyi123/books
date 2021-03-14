package com.lishunyi.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/12 11:15
 **/
@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = -6464890573950973456L;

    @Column
    @Id
    private Long id;

    @Column
    private LocalDateTime createTime;

    @Column
    private Long createBy;

    @Column
    private LocalDateTime updateTime;

    @Column
    private Long updateBy;

    @Column(name = "is_deleted")
    private Boolean deleted;
}
