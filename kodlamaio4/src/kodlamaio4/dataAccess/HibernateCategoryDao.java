package kodlamaio4.dataAccess;

import kodlamaio4.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	
	}
}
