package kodlamaIO.dataAccess;

import kodlamaIO.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Kategoi eklendi.");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Kategori silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Kategori guncellendi.");
    }
}
