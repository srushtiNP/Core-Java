public class Laptop{
	
//Static Variaables
static int ramType;
static String displayType;
static int numberOfKeys;
static String operatingSystem;
static String material;

//instance variables
int warranty; 
int generation; 
String color;
int price;
String brand;
 
static{
	 ramType=8;
	 displayType="LCD";
	 numberOfKeys=104;
	 operatingSystem="Windows";
	 material="metal";
	
}

public Laptop(int warranty, int generation, String color, int price, String brand){
	this.warranty=warranty;
	this.generation=generation;
	this.color=color;
	this.brand=brand;
	this.price=price;
}


public static void main(String[] args)
{
	
Laptop laptop = new Laptop(2,11,"black",50000,"Lenevo");
System.out.println(laptop.warranty);
System.out.println(laptop.generation);
System.out.println(laptop.color);
System.out.println(laptop.price);
System.out.println(laptop.brand);
System.out.println(laptop.ramType);
System.out.println(laptop.displayType);
System.out.println(laptop.numberOfKeys);
System.out.println(laptop.material);
System.out.println("----------");



Laptop laptop2 = new Laptop(2,9,"Silver",65000,"HP");
System.out.println(laptop2.warranty);
System.out.println(laptop2.generation);
System.out.println(laptop2.color);
System.out.println(laptop2.price);
System.out.println(laptop2.brand);
System.out.println(laptop2.ramType);
System.out.println(laptop2.displayType);
System.out.println(laptop2.numberOfKeys);
System.out.println(laptop2.material);
System.out.println("----------");


}
}
