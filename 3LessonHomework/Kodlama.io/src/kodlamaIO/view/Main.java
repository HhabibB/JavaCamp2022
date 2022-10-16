package kodlamaIO.view;

import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CourseManager;
import kodlamaIO.business.TeacherManager;
import kodlamaIO.dataAccess.JdbcCategoryDao;
import kodlamaIO.dataAccess.JdbcCourseDao;
import kodlamaIO.dataAccess.JdbcTeacherDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Teacher;
import kodlamaIO.logging.DatabaseLogger;
import kodlamaIO.logging.FileLogger;
import kodlamaIO.logging.ILogger;
import kodlamaIO.logging.MailLogger;


public class Main {
    public static void main(String[] args) throws Exception {

        ILogger[] loggers ={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        Teacher teacher = new Teacher(1,"Habib","Askerli");
        TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(),loggers);
        teacherManager.add(teacher);

        Course course1 = new Course(1,"Java","Yazilim Gelistirici Kampi - JAVA",5);
        Course course2 = new Course(2,"C#","Yazilim gelistirici kampi - C#",0);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
        courseManager.add(course1);
        courseManager.add(course2);


        Category category1 = new Category(1,"Programlama");
        Category category2 = new Category(2,"Tumu");
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
        categoryManager.add(category1);
        categoryManager.add(category2);




    }
}