package com.kujudy.springbootmall.dao;

import com.kujudy.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
