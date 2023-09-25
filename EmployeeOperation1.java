import org.hibernate.*;
import org.hibernate.cfg.*;
import java.io.*;

class EmployeeOperation1
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
Console c =System.console();
int eid = Integer.parseInt(c.readLine("Enter eid: "));
String ename = c.readLine("Enter ename: ");
Employee e = new Employee();
e.setEid(eid);
e.setEname(ename);
session.save(e);
t.commit();		//commit to insert the values
System.out.println("Record Inserted");
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