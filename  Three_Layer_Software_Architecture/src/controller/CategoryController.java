package controller;

import entity.Category;
import java.util.List;
import model.CategoryDAO;

public class CategoryController {

    private CategoryDAO categoryDAO;

    public void create(int categoryID,String name) {
        Category category=new Category(categoryID, name);
        this.getCategoryDAO().insert(category);
    }

    public List<Category> getList() {
        return this.getCategoryDAO().getList();
    }

    public CategoryDAO getCategoryDAO() {
        if (this.categoryDAO == null) {
            this.categoryDAO = new CategoryDAO();
        } 
        return categoryDAO;
    }

    public void setCategoryDAO(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }
}
