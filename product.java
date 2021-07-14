public class product{

//instance variables--values are changed from object to object.
int Pid;
String pname;
float cost;

public void getproductDetails(){

System.out.println(Pid);
System.out.println(pname);
System.out.println(cost);

}

public static void main (String[] a)
{

product p1=new product();

p1.Pid=10;
p1.pname="maruthi";
//p1.cost=1190.01f;
p1.getproductDetails();
System.out.println("product---p1--->"+p1);

//p2 object we did not set so jvm will give default values
//objects set in heap memory
//here in this entire program we are setting values multiple times for each object so this is not right way
//
product p2=new product();
p2.getproductDetails();




}

}