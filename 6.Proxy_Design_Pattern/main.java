public class main {

    public static void main(String[] args) {


        try{
            EmployeeTableDAO empTableObj = new EmployeeDaoProxy();
            empTableObj.create("USER",new EmployeeDO());
            System.out.println("Operation successful");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            EmployeeTableDAO empTableObj = new EmployeeDaoProxy();
            empTableObj.create("ADMIN",new EmployeeDO());
            System.out.println("Operation successful");

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
