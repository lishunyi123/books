package com.lishunyi.books.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author 李顺仪
 * @version 1.0
 * @since 2021/3/16 11:16
 **/
@Data
public class BookCategoryDTO {

    @NotNull
    private Long parentId;

    @NotNull
    private Boolean channel;

    @NotBlank
    private String categoryName;

    @NotNull
    private Integer sort;
}
