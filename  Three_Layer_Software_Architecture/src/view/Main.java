package view;

import controller.CategoryController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        CategoryController categoryController = new CategoryController();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("id giriniz : ");
            int id = Integer.valueOf(br.readLine());

            System.out.println("name giriniz : ");
            String name = br.readLine();

            categoryController.create(id, name);

            System.out.println(categoryController.getList());
        }
    }
}
