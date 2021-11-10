package package1;

public class CountOfObjects
{
	static int count = 0;
	
	public CountOfObjects()
	{
		count++;
	}
	
	public int count()
	{
		return count;
	}
	public static void main(String[] args) 
	{
		CountOfObjects ob1 = new CountOfObjects();
		System.out.println("First Object : "+ob1.count());
		CountOfObjects ob2 = new CountOfObjects();
		System.out.println("Second Object :"+ob2.count());
		CountOfObjects ob3 = new CountOfObjects();
		System.out.println("Third Object :"+ob3.count());
		
		System.out.println("The total count of abjects created is : "+count);
	}

}
