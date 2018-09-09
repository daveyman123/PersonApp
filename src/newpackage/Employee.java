/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author dgraff8
 */
public class Employee extends Person{
    
    private String EmployeeSSN;
    
    public Employee(){
        super();
        EmployeeSSN = "";
    }
    
    
    
    @Override
    public String getDisplayText() {
        return super.toString() + " " + "employee ssn = " + this.EmployeeSSN;
    }

    /**
     * @return the EmployeeSSN
     */
    public String getEmployeeSSN() {
        return EmployeeSSN;
    }

    /**
     * @param EmployeeSSN the EmployeeSSN to set
     */
    public void setEmployeeSSN(String EmployeeSSN) {
        this.EmployeeSSN = EmployeeSSN;
    }
    
    
    
}
