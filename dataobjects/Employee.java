package dataobjects;
import javax.swing.JOptionPane; 

public class Employee extends AnyClass   //Inherits from AnyClass
{
    public String surname;
    public String idNo;
    public double pay;
    
    public Employee(int iSeqNo, String iSurname, double iPay, String iIdNo){
        super(iSeqNo); //Calling the constructor of the class being inherited i.e. AnyClass
        surname = iSurname;
        pay = iPay;
        idNo = iIdNo;
    }

    public String getData(){                    //Polymorphic Method            
        return super.getData() + " Surname: " + surname + " ID: " + idNo + " Pay: " + pay;
        //super.getData() calls getData() method of AnyClass
    }
    
    public String getKey(){
        return surname; //The key used for operations of searching and editing will be surname. 
    }
    
    public void edit() 
    {
        JOptionPane.showMessageDialog(null, "Current pay is: " + pay);
        String tempPay = JOptionPane.showInputDialog("Enter the new pay: ");
        double pay = Double.parseDouble(tempPay);
    }
    
    public String getID(){
        return idNo; 
    }

}
