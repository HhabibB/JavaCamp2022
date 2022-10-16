package kodlamaIO.business;

import kodlamaIO.dataAccess.ICourseDao;
import kodlamaIO.entities.Course;
import kodlamaIO.logging.ILogger;
import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private final ICourseDao courseDao;
    private final ILogger[] loggers;
    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;

    }

    List<String> courseNames = new ArrayList<String>();

    public void add(Course course) throws Exception{

        for(String courseName: courseNames){
            if(courseName.equals(course.getName())){
                throw new Exception("Bu isimde kurs mevcut");
            }
        }

        if(course.getPrice() < 0 ){
            throw new Exception("Fiyat 0 dan kucuk olamaz");
        } else{
            courseNames.add(course.getName());
            courseDao.add(course);

            for (ILogger logger: loggers){
                logger.log(course.getName());
            }        }

    }
}
