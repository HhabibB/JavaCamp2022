package kodlamaIO.dataAccess;

import kodlamaIO.entities.Teacher;

public class HIbernateTeacherDao implements ITeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Ogretmen eklendi.");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Ogretmen silindi.");
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Ogretmen guncellendi.");
    }
}
