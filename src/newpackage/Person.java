/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dgraff8
 */

//created purely for inheritance
public abstract class Person {
    
    private String firstName;
    private String lastName;
    private String emailaddr;
    
    //no-arg constructor
    
    public Person(){
        firstName ="";
        lastName = "";
        emailaddr = "";
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the emailaddr
     */
    public String getEmailaddr() {
        return emailaddr;
    }

    /**
     * @param emailaddr the emailaddr to set
     */
    public void setEmailaddr(String emailaddr) {
        this.emailaddr = emailaddr;
    }
    
    public abstract String getDisplayText();
    
    @Override
    public String toString(){
        return "Name: "+firstName+ " " + lastName
                +"\nEmail " + this.emailaddr +"\n";
    }
    public String getFullName(){
        return firstName + " " + lastName;
    
    }
    
}
