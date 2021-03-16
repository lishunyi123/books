package com.lishunyi.books.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
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
@EntityListeners(AuditingEntityListener.class)
@DynamicInsert
@DynamicUpdate
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = -6464890573950973456L;

    @Column
    @Id
    @GeneratedValue(generator = "SnowflakeId")
    @GenericGenerator(name = "SnowflakeId", strategy = "com.lishunyi.books.config.SnowflakeIdGenerator")
    private Long id;

    @Column
    @CreatedDate
    private LocalDateTime createTime;

    @Column
    @CreatedBy
    private Long createBy;

    @Column
    @LastModifiedDate
    private LocalDateTime updateTime;

    @Column
    @LastModifiedBy
    private Long updateBy;

    @Column(name = "is_deleted")
    private Boolean deleted;
}
