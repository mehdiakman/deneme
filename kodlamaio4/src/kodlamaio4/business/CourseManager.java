package kodlamaio4.business;

import java.util.List;

import kodlamaio4.core.logging.Logger;
import kodlamaio4.dataAccess.CourseDao;
import kodlamaio4.dataAccess.JdbcCourseDao;
import kodlamaio4.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Course[] courses;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao,Course[] courses,Logger[] loggers) {
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception(" Kurs fiyatı 0 dan küçük olamaz ");
		}
	for(Course crse: courses) {
		if(crse.getCourseName().equals(course.getCourseName()));
		throw new Exception("Kurs adı tekrar edemez");
	}

		//CourseDao courseDao = new JdbcCourseDao();
		courseDao.add(course);
		
		
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}

	}
}
