import java.util.Scanner;
public class int_operation{

	public static void main(String[] args) {
		int max=0;
		int count=0;
		int input=1;
	    Scanner sc=new Scanner(System.in);
	    while (input!=0){
	    	System.out.println("Enter a number");
	    	input=sc.nextInt();
	    	if (input>max){
	    		max=input;
	    		count=1;
	    	}
	    	else if(input==max) {
	    		count=count+1;
	    	}
	    	
	    }
	    System.out.println("The highest number was: "+max);
	    System.out.println("The number of occurences was: "+count);
	}
	}
