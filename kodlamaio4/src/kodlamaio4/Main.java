package kodlamaio4;

import java.util.ArrayList;
import java.util.List;

import kodlamaio4.business.CategoryManager;
import kodlamaio4.business.CourseManager;
import kodlamaio4.business.InstructorManager;
import kodlamaio4.core.logging.DatabaseLogger;
import kodlamaio4.core.logging.FileLogger;
import kodlamaio4.core.logging.Logger;
import kodlamaio4.core.logging.MailLogger;
import kodlamaio4.dataAccess.HibernateCategoryDao;
import kodlamaio4.dataAccess.HibernateInstructorDao;
import kodlamaio4.dataAccess.JdbcCourseDao;
import kodlamaio4.entities.Category;
import kodlamaio4.entities.Course;
import kodlamaio4.entities.Instructor;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new MailLogger(),new FileLogger(),new DatabaseLogger()};
		
		Course course1 = new Course(1, "Java","Eğitim","Engin",0);
		Course course2 = new Course(2, "Java","Eğitim","Engin",0);
		
		List<Course> courseDb= new ArrayList<>();
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers,courseDb);
		courseManager.add(course1);
		//courseManager.add(course2);
		
		
		
		Category category1= new Category(1,"Java");
		Category category2= new Category(2,"Java");
		
		List<Category> categoryDb = new ArrayList<>();
		
		CategoryManager categoryManager= new CategoryManager(categoryDb,new HibernateCategoryDao(),loggers);
		categoryManager.add(category1);
		//categoryManager.add(category2);
		
		
		Instructor instructor = new Instructor(1,"Engin","Demirog");
		InstructorManager intInstructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
		InstructorManager.add
	}

}
