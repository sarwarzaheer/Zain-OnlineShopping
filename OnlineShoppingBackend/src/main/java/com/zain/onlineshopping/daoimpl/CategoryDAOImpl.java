package com.zain.onlineshopping.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zain.onlineshopping.dao.CategoryDAO;
import com.zain.onlineshopping.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static{
		
		Category  category = new  Category();
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("some description for Mobile"); 
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//second category
		category = new  Category();
		category.setId(2);
		category.setName("TV");
		category.setDescription("some description for TV"); 
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		// third category
		category = new  Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("some description for Laptop"); 
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}
 
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
        for(Category category : categories){
        	if(category.getId()== id) return category;
        }
		return null;
	}

}
