package com.zain.onlineshopping.dao;

import java.util.List;

import com.zain.onlineshopping.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
