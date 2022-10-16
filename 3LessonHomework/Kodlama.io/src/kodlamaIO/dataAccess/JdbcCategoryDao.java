package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;

public class JdbcCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategori eklendi: " + category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Kategori silindi: " + category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Kategori guncellendi: " + category.getName());
    }
}
