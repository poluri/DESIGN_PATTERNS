public class EmployeeDaoProxy implements EmployeeTableDAO {

    EmployeeDaoImpl employeeDaoObj;

    EmployeeDaoProxy(){
        employeeDaoObj = new EmployeeDaoImpl();
    }
    @Override
    public void create(String client, EmployeeDO obj) throws Exception {

        if(client=="ADMIN"){
            employeeDaoObj.create(client,obj);
            return;
        }
        else{
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client=="ADMIN"){
            employeeDaoObj.delete(client,employeeId);
            return;
        }
        else{
            throw new Exception("Access Denied");
        }
    }

    @Override
    public EmployeeDO get(String client, int employeeId) throws Exception {
        if(client=="ADMIN"||client=="USER"){
            return employeeDaoObj.get(client,employeeId);

        }
        else{
            throw new Exception("Access Denied");
        }
    }
}
