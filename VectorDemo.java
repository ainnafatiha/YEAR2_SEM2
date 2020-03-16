// Java code to illustrate isEmpty() 
import java.util.*; 
  
public class VectorDemo { 
    public static void main(String args[]) 
    { 
        // Creating an empty Vector 
        Vector<String> vec_tor = new Vector<String>(); 
  
        // Use add() method to add elements into the Vector 
        vec_tor.add("Welcome"); 
        vec_tor.add("To"); 
        vec_tor.add("Geeks"); 
        vec_tor.add("4"); 
        vec_tor.add("Geeks"); 
  
        // Displaying the Vector 
        System.out.println("Vector:  " + vec_tor); 
  
        // Verifying if the Vector is empty or not 
        System.out.println("Is the Vector empty? "
                           + vec_tor.isEmpty()); 
  
        // Clearing the Vector 
        vec_tor.clear(); 
  
        // Displaying the Vector 
        System.out.println("Vector after clear(): "
                           + vec_tor); 
  
        // Verifying if the Vector is empty or not 
        System.out.println("Is the Vector empty? "
                           + vec_tor.isEmpty()); 
    } 
} 