public class products{

//instance variables--values are changed from object to object.
//here we are declaring properties
int Pid;
String pname;
float cost;

//setproductsDetails we are initialisation values
public void setproductsDetails(int i,String j,float k){

Pid=i;
pname=j;
cost=k;

}

public void getproductsDetails(){

System.out.println(Pid);
System.out.println(pname);
System.out.println(cost);

}

	public static void main (String[] a)
{

products p1=new products();


p1.setproductsDetails(1,"Laptop",145.01f);
p1.getproductsDetails();
System.out.println("products---p1--->"+p1);

//p2 object we did not set so jvm will give default values
//objects set in heap memory
//here in this entire program we are setting values intialisation in setproductsDetails
//
products p2=new products();
p2.setproductsDetails(2,"Pen",146.02f);
p2.getproductsDetails();




}

}