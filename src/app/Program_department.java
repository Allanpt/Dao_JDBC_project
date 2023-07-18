package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program_department {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();

        System.out.println("=== TEST 1 - Insert Department");
        System.out.println("What's the new Department do you want to insert? ");
        String insertNewDepartment = sc.nextLine();
        Department dep = new Department(null,insertNewDepartment);
        departmentDao.insert(dep);

        System.out.println();

        System.out.println("=== TEST 2 - Delete Department");
        System.out.print("How many department do you want to delete? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            List<Department> list = departmentDao.findAll();
            for(Department d : list){
                System.out.println(d);
            }
            System.out.print("Which department ID do you want to delete?: ");
            int depId = sc.nextInt();
            departmentDao.deleteById(depId);
        }

        System.out.println();

        System.out.println("=== TEST 3 - FindAll");
        List<Department> list = departmentDao.findAll();
        for(Department d : list){
            System.out.println(d);
        }

        System.out.println();

        System.out.println("=== TEST 4 - FindById");
        for(Department d : list){
            System.out.println(d);
        }
        System.out.print("Which department ID do you want to find? ");
        int department = sc.nextInt();
        Department depId = departmentDao.findById(department);
        System.out.println(depId);

        System.out.println();

        System.out.println("=== TEST 5 - Update");
        for(Department d : list){
            System.out.println(d);
        }
        System.out.println("Which department ID do you want to update? ");
        int depIdUpdate = sc.nextInt();
        Department depUpdate = departmentDao.findById(depIdUpdate);
        System.out.println("What's the new 'Name' department");
        sc.nextLine();
        String newDepName = sc.nextLine();
        depUpdate.setName(newDepName);
        departmentDao.update(depUpdate);

    }
}
