package com.moozhy.service;

import com.moozhy.model.ProductCategory;

import java.util.List;

/**
 * 类目
 * @author 陆逊
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
