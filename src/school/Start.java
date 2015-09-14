
package school;
import javax.swing.JOptionPane;
public class Start {
    
    private boolean gender=(Boolean.parseBoolean(JOptionPane.showInputDialog("")));
    
    
    enum Gender //creating an enumuration for "Gender" |||| 
    {  
        Male,Female
    }
    public Gender getGenderType()
    {
        
        if(gender)
            return(Gender.Male);
        else
            return(Gender.Female);
    }
        
    
}
