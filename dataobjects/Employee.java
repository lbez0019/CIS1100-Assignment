package dataobjects;

public class Employee extends AnyClass   //Inherits from AnyClass
{
    public String surname;
    public double pay;
    
    public Employee(int iSeqNo, String iSurname, double iPay){
        super(iSeqNo); //Calling the constructor of the class being inherited i.e. AnyClass
        surname = iSurname;
        pay = iPay;
    }

    public String getData(){                    //Polymorphic Method            
        return super.getData() + ", Surname: " + surname + ", Pay: " + pay;
        //super.getData() calls getData() method of AnyClass
    }
    
    public String getKey(){
        return surname; //The key used for operations of searching and editing will be surname. 
    }

}
