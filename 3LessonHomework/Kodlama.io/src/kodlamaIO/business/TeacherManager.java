package kodlamaIO.business;

import kodlamaIO.dataAccess.ITeacherDao;
import kodlamaIO.entities.Teacher;
import kodlamaIO.logging.ILogger;

public class TeacherManager {
    private final ITeacherDao teacherDao;
    private  final ILogger[] loggers;

    public TeacherManager(ITeacherDao teacherDao, ILogger[] loggers){
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }

    public  void add(Teacher teacher){
        teacherDao.add(teacher);

        for (ILogger logger: loggers){
            logger.log(teacher.getFirstName());
        }
    }

}
