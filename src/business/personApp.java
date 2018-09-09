/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import newpackage.Customer;
import java.util.Scanner;
import java.util.Set;
import newpackage.Employee;
import validation.Validator;
        
        /**
 *
 * @author dgraff8
 */
public class personApp {
    public static void main(String[] args) {
        
        System.out.println("Welcome to Person application");
        Scanner input = new Scanner(System.in);
        
        //instantiate some variables used throughout
        String choice;
        String continueChoice = "y";
        String message;
        String pattern;
        String firstName;
        String lastName;
        String email;
        String customerID;
        String SSN;
        
        //constantly prompt the user to continue or not and if answer is y then do the things in the loop
        while (continueChoice.equalsIgnoreCase("y")) {
            message = "make a customer or employee? (c/e) ";
            
            //regex pattern to limit the choice
            pattern = "c|e";
            choice = Validator.getChoice(message, pattern , input);
            
            System.out.println("you chose " + choice);
            
            //get the generic first name and last name and email
            message = "first name: ";
            firstName = Validator.getName(message, input);
            message = "last name: ";
            lastName = Validator.getName(message, input);
            message = "email: ";
            email = Validator.getEMail(message, input);
            
            //get the information relevant to the specific choice made between customer or employee
            if (choice.equals("c")){
                
                //get customer ID with scanner
                System.out.println("Customer ID: ");
                customerID = input.next();
                
                // instantiate a new customer from the customer class
                Customer C = new Customer();
                
                //set the name, email, and customerID of the newly created C object
                C.setFirstName(firstName);
                C.setLastName(lastName);
                C.setEmailaddr(email);
                C.setCustID(customerID);
                
                //Finally print out the information gathered to end the program
                System.out.println("You entered:" + "\n" + C + "Customer ID number: " + customerID);
            }
            else if (choice.equals("e")){
                
                message = "Social Security Number: ";
                System.out.println(message);
                
                SSN = input. next();
                
                
                Employee E = new Employee();
                
                E.setFirstName(firstName);
                E.setLastName(lastName);
                E.setEmailaddr(email);
                E.setEmployeeSSN(SSN);
                
                
                
               
                System.out.println("You entered:" + "\n" + E + "Social Security Number: " + SSN);
            }
            
            //prompt to continue the loop or not
            message = "contine or not? (y/n) ";
            pattern = "y|n";
            continueChoice = Validator.getChoice(message, pattern, input);
            
        
        
    }
}
}