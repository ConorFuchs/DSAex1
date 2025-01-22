/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1addressbook;

/**
 *
 * @author serpl
 */
public class BusinessContact extends Contact {
    private String companyName;

    public BusinessContact() {
    }

    public BusinessContact(String firstName, String lastName, String email, String address, String phoneNum,String companyName) {
        super(firstName, lastName, email, address, phoneNum);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    @Override
    public String printDetails(){
        return super.printDetails() + "\n Company Name: " + companyName;
    }
}
