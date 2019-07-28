package com.moozhy.form;

import lombok.Data;

/**
 * @author 陆逊
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
