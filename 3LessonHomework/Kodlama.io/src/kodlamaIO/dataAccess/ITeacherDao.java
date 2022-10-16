package kodlamaIO.dataAccess;

import kodlamaIO.entities.Teacher;

public interface ITeacherDao {
    void add(Teacher teacher);
    void delete(Teacher teacher);
    void update(Teacher teacher);
}
