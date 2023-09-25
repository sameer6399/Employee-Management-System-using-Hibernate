import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class EmployeeOperation3
{
public static void main(String args[])
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory factory = cfg.buildSessionFactory();

Session session = null;
Transaction t = null;
try {
session = factory.openSession();
System.out.println("Session Open");
t = session.beginTransaction();

Console c = System.console();
int eid = Integer.parseInt(c.readLine("Enter Eid: "));
Employee e = (Employee)session.get(Employee.class, eid);	//get method is used here
if(e != null) {
	String ename = c.readLine("Enter new Name: ");
	e.setEname(ename);
	session.save(e);
	t.commit();
	System.out.println("Record Updated");
} else {
	System.out.println("Eid dosent exists!!!");
}
}//end of try
catch(Exception e) {
System.out.println("Issue"+e);
t.rollback();
}//end of catch
finally {
session.close();
System.out.println("Session close");
}//end of finally
}//end of main
}//end of class