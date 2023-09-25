import org.hibernate.*;
import org.hibernate.cfg.*;

class EmployeeOperation
{
public static void main(String args[])
{
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");

SessionFactory factory = cfg.buildSessionFactory();

Session session = null;

try {
session = factory.openSession();
System.out.println("Session Open");
}//end of try
catch(Exception e) {
System.out.println("Issue"+e);
}//end of catch
finally {
session.close();
System.out.println("Session close");
}//end of finally
}//end of main
}//end of class