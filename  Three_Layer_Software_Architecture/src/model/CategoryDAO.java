package model;

import entity.Category;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {

    private List <Category> categoryList ;

    public CategoryDAO() {
        this.categoryList =new ArrayList<>();
    }    
    
    public void insert(Category category){
        this.categoryList.add(category);
    }
    
    public List<Category> getList(){
        return this.categoryList;
    }
}
