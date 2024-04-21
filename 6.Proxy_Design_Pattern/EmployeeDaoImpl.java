public class EmployeeDaoImpl implements EmployeeTableDAO{
    @Override
    public void create(String client, EmployeeDO obj) throws Exception {

        //create a Row
        System.out.println("Created New row in Employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {

        //delete a Row
        System.out.println("deleted row with employeeId "+employeeId);
    }

    @Override
    public EmployeeDO get(String client, int employeeId) throws Exception {

        //fetch Row
        System.out.println("fetching data from DB");
        return new EmployeeDO();
    }
}
