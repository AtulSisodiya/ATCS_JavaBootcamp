
public class conditional {
	public static void main(String[] args) {  
	    int marks=65;  
	      
	    if(marks<50){  
	        System.out.println("fail");  
	    }  
	    else if(marks>=50 && marks<60){  
	        System.out.println("D");  
	    }  
	    else if(marks>=60 && marks<70){  
	        System.out.println("C");  
	    }  
	    else if(marks>=70 && marks<80){  
	        System.out.println("B");  
	    }  
	    else if(marks>=80 && marks<90){  
	        System.out.println("A");  
	    }else if(marks>=90 && marks<100){  
	        System.out.println("A+");  
	    }else{  
	        System.out.println("Invalid marks");  
	    }  
	
	    
	    String country="India";    
	    int age=45;      
	      
	    if(country=="India"){      
	        if(age>=28){    
	            System.out.println("You are eligible to vote in India");    
	        } else{  
	            System.out.println("You are not eligible to vote in INdia");    
	        }  
	    } else{  
	      System.out.println("Not an Indian");  
	    }  
	
	}  
	
	
	
}
