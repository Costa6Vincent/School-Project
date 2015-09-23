
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
    public static void lineSkip(String _string)
    {
        System.out.println("");
        String s = (char)27 +"[32m"+_string;
        System.out.println(s);
//        System.out.println(_string);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static boolean SimulationWarning()
    {
        String sim= JOptionPane.showInputDialog("Warning Simulation about to start press 'Y' to confirm");
        if (sim.charAt(0) == 'Y')
        {
            return(true);
        }
        else
            return(false);
        
                
    }
}