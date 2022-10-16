package kodlamaIO.dataAccess;

import kodlamaIO.entities.Course;

public class HibernateCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Kurs eklendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Kurs silindi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Kurs guncellendi.");
    }
}
