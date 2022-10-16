package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;

public interface ICategoryDao {
    void add(Category category);
    void delete(Category category);
    void update(Category category);
}
