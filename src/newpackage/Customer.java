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
public class Customer extends Person {
    private String CustID;
    
    public Customer(){
        super();
        this.CustID="";
    }
    
    @Override
    public String getDisplayText() {
        return super.toString() + "Customer ID: " +this.CustID+"\n";
    }
    
    //private

    /**
     * @return the CustID
     */
    public String getCustID() {
        return CustID;
    }

    /**
     * @param CustID the CustID to set
     */
    public void setCustID(String CustID) {
        this.CustID = CustID;
    }
    
  
    
}
