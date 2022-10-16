package kodlamaIO.dataAccess;

import kodlamaIO.entities.Course;

public class JdbcCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Kurs eklendi: " + course.getName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Kurs silindi: " + course.getName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Kurs guncellendi: " + course.getName());
    }
}
