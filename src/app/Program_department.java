package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program_department {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();

        System.out.println("=== TEST 1 - Insert Department");
        Department dep = new Department(null,"Games");
        departmentDao.insert(dep);

        System.out.println();

        System.out.println("=== TEST 2 - Delete Department");
        System.out.println("How many department do you want to delete?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Which department ID do you want to delete?: ");

            int depId = sc.nextInt();
            departmentDao.deleteById(depId);
        }


    }
}
