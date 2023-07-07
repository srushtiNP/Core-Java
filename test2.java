                      Aptitude

1)b
2)c
3)d
4)a
5)d
6)c
7)a
8)d
9)a
10)b
11)a
12)b
13)d
14)c

                                               Answers for theory Questions
					  
1)constructor is a method it will helps us to intitialize the objects.whenever object is created that will excecuted.Constructor in java
is used to create the instance of the class and its name is the same as the class name and it has no return type. 
Sometimes constructors are also referred to as special methods.

2)In constructor there are two types
      1.parametrise constructor
      2.default Constructor	  
	   
	parametrise which means the constructor has some parameters so the name is parametrise constructor.
    default constructor that does not have any parameters hence the the constructor is default constructor.
	
3)Object it is a state and behaviours.state means features and behaviours meanas what the object will do for us(action).
example for object is :mobile
and states of that object are->color,size
    behaviour of that object->taking images,playing games
	
4)class is nothing but design or blueprint.
Everything in Java is associated with classes and objects along with its attributes and methods.

5)method overloading-method overloading means which has same method names but different parameters it is known as MethodOverloading.
   By changing parameters.
   
6)Variables are nothing but these will store the values and it keeps on changing.
there are two types in variables 1)instance varible
                                 2)local variables
								 
7)this is a keyword this can be used to refer current class instance variable and it also helps to devide.
this can be passed as argument in the constructor call
this can be used to invoke current class method
this can be used to invoke current class constructor
this can be passed as an argument in the method call

8)String is nothing but sequence of characters.
examples for string are:String Name="srushti"
                        String College="BGMIT"
9)string methods 
   1.charAt():it will Returns the character at the specified index.
   2.codePointAt():it Returns the Unicode of the character at the specified index	.
   3codePointBefore():Returns the Unicode of the character before the specified index.	
   4codePointCount():Returns the number of Unicode values found in a string.
   5compareTo():Compares two strings lexicographically.	
   6concat()Appends a string to the end of another string.
   7contains()Checks whether a string contains a sequence of characters or not.

10)string is immutable why because it will not Change In the String constant pool a String object is likely to have one or many references
If several references point to the same String without even knowing it, it would be bad if one of the references modified that String 
values That is the reason the String objects are immutable

                        Programming questions
						

1)public class Pendrive{
	String nameOfPendrive;
	int price;
	String colour;
	String shape;
	String size;
	int storageCapacity;
	public static void main(String[] args)
	{
	Pendrive obj = new Pendrive(1077,"red");
	}
	public Pendrive(int price, String colour){
		this.price=price;
		this.colour=colour;
		System.out.println(price);
		System.out.println(colour);
	}
	public static void transferImages(){	
	}
	public static void storeFiles(){	
	}
	public static void applicationInstallation(){	
	}
	public static void installationOfOperatingSystem(){
	}
	
2)public class Laptop{
static int ramType;
static String displayType;
static int numberOfKeys;
static String operatingSystem;
static String material;
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

Laptop laptop2 = new Laptop(2,9,"Silver",65000,"HP");
System.out.println(laptop2.warranty);
System.out.println(laptop2.generation);
System.out.println(laptop2.color);
System.out.println(laptop2.price);
System.out.println(laptop2.brand);
System.out.println(laptop2.ramType);
System.out.println(laptop2.displayType);
}
}
3)public class Fish{
    String nameOfFish;
	String color;
	public static void main(String[] args)
	{
	Fish obj= new Fish("starfish","blue");
	}
	public Fish(String name, string color){
	    this.name=name;
		this.colour=colour;
		System.out.println(name);
		System.out.println(colour);
	}
	}	
	

	 
	 
	 
	
	
	
	
	
}

}


       
	