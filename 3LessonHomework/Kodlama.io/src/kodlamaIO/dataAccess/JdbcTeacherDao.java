package kodlamaIO.dataAccess;

import kodlamaIO.entities.Teacher;

public class JdbcTeacherDao implements ITeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Ogretmen eklendi: " + teacher.getFirstName());
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Ogretmen silindi: " + teacher.getFirstName());
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Ogretmen guncellendi: " + teacher.getFirstName());
    }
}
