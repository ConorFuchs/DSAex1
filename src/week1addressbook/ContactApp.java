/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week1addressbook;

/**
 *
 * @author serpl
 */
public class ContactApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContactGUI gui = new ContactGUI();
        gui.setVisible(true);
        gui.companyTF.setVisible(false);
        gui.companyLBL.setVisible(false);
    }
    
}
