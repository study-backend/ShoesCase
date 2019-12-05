package shop.shoes.dao;

import java.util.List;

import shop.shoes.model.CategoryDTO;

public interface CategoryDAO {
	public List<CategoryDTO> selectAll() throws Exception;
}
