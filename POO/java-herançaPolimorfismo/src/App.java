public class App {
    public static void main(String[] args) throws Exception {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee){
        // if (employee instanceof Manager manager) {
        //     employee.setName("Jao");
        //     manager.setLogin("Joao");//((manager)employee).setlogin("...");
        //     manager.setPassword("123456");//
            
        //     System.out.println(employee.getName());
        //     System.out.println(manager.getLogin());
        //     System.out.println(manager.getPassword());
        // }

        switch (employee) {
            case Manager manager:
             manager.setName("Jao");
             manager.setLogin("Joao");//((manager)employee).setlogin("...");
             manager.setPassword("123456");//
             System.out.printf("=============%s==========\n",manager.getClass().getCanonicalName());
             System.out.println(manager.getName());
             System.out.println(manager.getLogin());
             System.out.println(manager.getPassword());
             System.out.println("=======================");
                break;
            
            case Salesman salesman:
             salesman.setCode("123");
             salesman.setName("Marcos");
             salesman.setSalary(12345);

             System.out.printf("=============%s=========\n",salesman.getClass().getCanonicalName());
             System.out.println(salesman.getCode());
             System.out.println(salesman.getName());
             System.out.println(salesman.getSalary());
             System.out.println("=======================");


                break;
            default:
                break;
        }

    }
}
