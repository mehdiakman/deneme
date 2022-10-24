package kodlamaio4.business;

import java.util.List;

import kodlamaio4.core.logging.Logger;
import kodlamaio4.dataAccess.CategoryDao;
import kodlamaio4.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Category[] categories;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao,Category[] categories,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.categories= categories;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for(Category c: categories)
			if (category.getCategoryName().equals(category.getCategoryName())) {
			throw new Exception("Kategori ismi tekrar edemez");
		}

		//CategoryDao categoryDao = new JdbcCategoryDao();
		categoryDao.add(category);
		
		
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		
		
	}
}
