public class MethodClass{
	public static void main(String[] args){
		multiply();
		count();
		add();
		insert();
		number();
	}
	public static void multiply()
	{
	   int[] studentMarks = {35 , 45 , 25 , 15, 55};
       System.out.println("studentMarks");
       for(int i=0; i<studentMarks.length; i++)
       {
        System.out.println(studentMarks[i]);
       }
    }
	
    public static void count()
	{
       float[] Heights = {5.2f , 3.7f , 4.2f , 4.8f , 5.3f};
       System.out.println("Heights");
       for(int i=0; i<Heights.length; i++)
       {
	    System.out.println(Heights[i]);
       }
    }
	
	public static void add()
	{
		int[] numberOfWins = {2 , 3 , 5, 6 , 1 , 8 , 3 , 7};
        System.out.println("numberOfWins");
        for(int i=0;i<numberOfWins.length;i++)
        {
	       System.out.println(numberOfWins[i]);
        }
	}
	
    public static void insert()
	{
       float[] weightInKilograms = {1.5f , 2.5f , 3.0f , 4.57f, 7.0f , 2.5f};
       System.out.println("weightInKilograms");
       for(int i=0; i<weightInKilograms.length; i++)
       {
	    System.out.println(weightInKilograms[i]);
       }
    }
	
    public static void number()
	{
        byte[] numberOfStudentsPresent = {45 , 35, 0 , 10 , 45};
        System.out.println("numberOfStudentsPresent");
        for(int i=0; i<numberOfStudentsPresent.length; i++)
        {
	     System.out.println(numberOfStudentsPresent[i]);
        }
    }
}
