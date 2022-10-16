package kodlamaIO.business;

import kodlamaIO.dataAccess.ICategoryDao;
import kodlamaIO.entities.Category;
import kodlamaIO.logging.ILogger;
import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private final ICategoryDao categoryDao;
    private final ILogger[] loggers;
    public CategoryManager(ICategoryDao categoryDao,ILogger[] loggers){
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    List<String> categoryNames = new ArrayList<String>();

    public void add(Category category) throws Exception {

        for (String categoryName:categoryNames) {
            if(categoryName.equals(category.getName())){
                throw new Exception("Bu isimde kategori mevcut!!!");
            }
        }
        categoryNames.add(category.getName());
        categoryDao.add(category);

        for (ILogger logger: loggers){
            logger.log(category.getName());
        }
    }
}
