import java.util.Stack;
public class collections {
	
	  public static void main(String[] args) {

	    Stack<String> animals= new Stack<>();

	    animals.push("Dog");
	    animals.push("Horse");
	    animals.push("Cat");
	    animals.push("Lion");
	    animals.peek();
	    System.out.println(animals);

	    animals.pop();
	    System.out.println(animals);
	    }
	}

