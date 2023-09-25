package p2;
import p1.*;

public class B
{
int b = 20;
public void add()
{
A a = new A();
int res = b + a.getA();
System.out.println("Res = "+res);
}
}