package it.corso.dto;

import it.corso.model.CategoryName;

public class CategoryShowDto {

	private int id;

	private CategoryName categoryName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CategoryName getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(CategoryName categoryName) {
		this.categoryName = categoryName;
	}

}
