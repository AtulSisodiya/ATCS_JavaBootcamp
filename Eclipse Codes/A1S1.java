import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class A1S1 {
//	public static void main(String[] args) {
//		 
//		Scanner sc = new Scanner(System.in);
//		 System.out.print("Input 1st number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Input 2nd number: ");
//         int num2 = sc.nextInt();
//		 System.out.print("Input 3rd number: ");
//         int num3 = sc.nextInt();
//         System.out.print("Input 4th number: ");
//         int num4 = sc.nextInt();		
//		
//		if (num1 == num2 && num2 == num3 && num3 == num4) 
//		  {
//			System.out.println("All Numbers are equal.");
//                               }
//		else
//			{
//			System.out.println("Numbers are not equal.");

	
	
//		public static void main(String[] args) {
//			 Scanner sc = new Scanner(System.in);
//			 System.out.print("Input first number(double): ");
//	         double n1 = sc.nextDouble();
//	         System.out.print("Input second number(double): ");
//	         double n2 = sc.nextDouble();
//			 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	
//	public static void main(String[] args) 
//    {
//        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
//        int k = 3;
//		System.out.println("Original Array: ");
//		System.out.println(Arrays.toString(arr));
//		System.out.println(k +" largest elements of the array are:");
//        Arrays.sort(arr, Collections.reverseOrder());        
//       for (int i = 0; i < k; i++) 
//          System.out.print(arr[i] + " ");
	
//	public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Input an integer between 0 and 1000: ");
//        int num = sc.nextInt();
//
//        int first = num % 10;
//        int reNum = num / 10;
//        int Second = reNum % 10;
//        reNum = reNum / 10;
//        int third = reNum % 10;
//        reNum = reNum / 10;
//        int fourth = reNum % 10;
//        int sum = third + Second + first + fourth;
//        System.out.println("The sum of all digits in " + num + " is " + sum);
	
//	public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input 1st integer: ");
//        int first = sc.nextInt();
//        System.out.print("Input 2nd integer: ");
//        int second = sc.nextInt();
//
//        System.out.printf("Sum of two integers: %d%n", first + second);
//        System.out.printf("Difference of two integers: %d%n", first - second);
//        System.out.printf("Product of two integers: %d%n", first * second);
//        System.out.printf("Average of two integers: %.2f%n", (double) (first + second) / 2);
//        System.out.printf("Distance of two integers: %d%n", Math.abs(first - second));
//        System.out.printf("Max integer: %d%n", Math.max(first, second));
//        System.out.printf("Min integer: %d%n", Math.min(first, second));
	
//	public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input number: ");
//        int input = sc.nextInt();
//
//        if (input > 0)
//        {
//            System.out.println("Number is +ve");
//        }
//        else if (input < 0)
//        {
//            System.out.println("Number is -ve");
//        }
//        else
//        {
//            System.out.println("Number is zero");
//        }
	
//	public static void main(String[] args)   
//	{  
//	int a, b, c, largest, temp;  
//	
//	Scanner sc = new Scanner(System.in);  
//	 
//	System.out.println("Enter the first number:");  
//	a = sc.nextInt();  
//	System.out.println("Enter the second number:");  
//	b = sc.nextInt();  
//	System.out.println("Enter the third number:");  
//	c = sc.nextInt();  
//	
//	temp=a>b?a:b;  
//	largest=c>temp?c:temp;   
//	System.out.println("The largest number is: "+largest);  
//	  
//
//	public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input an alphabet: ");
//        String input = in.next().toLowerCase();
//
//        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
//        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
//        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
//                || input.equals("o") || input.equals("u");
//
//        if (input.length() > 1)
//        {
//            System.out.println("Error it is not a single character.");
//        }
//        else if (!(uppercase || lowercase))
//        {
//            System.out.println("Error it is not a letter");
//        }
//        else if (vowels)
//        {
//            System.out.println("Input letter is Vowel");
//        }
//        else
//        {
//            System.out.println("Input letter is Consonant");
//        }

	  public static void main(String[] args)

	  {
	     int i,n,sum=0;

	     System.out.print("Input number of terms is: ");
	  {
	     Scanner in = new Scanner(System.in);
	  		    n = in.nextInt();
	    System.out.println ("\nThe odd numbers are :");
	     for(i=1;i<=n;i++)

	     {
	       System.out.println (2*i-1);
	       sum+=2*i-1;
	     }
	     System.out.println ("The Sum of odd Natural Number upto " +n+" terms is: " +sum);

	  }
	  }
	
}
