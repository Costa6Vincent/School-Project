/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Person {
    enum Gender //creating an enumuration for "Gender" |||| 
    {  
        Male,Female
    }
    public static int numPeople=10;
    private static int currentPeopleIndex=0;
    private static ArrayList<Person>people= new ArrayList<>();
    private Gender gender;
    private String name;
    private static String genderT=(JOptionPane.showInputDialog("Enter Gender: "));
    
    public static Person addPerson(String _name,Gender _gender)
    {
        Person temp =new Person(_name,_gender);
        people.add(temp);
        return(temp);
    }
    Person()
    {
        name="none";
        gender=Gender.Female;
    }
    Person(String _name, Gender _gender)
    {
        name=_name;
        gender=_gender;
    }
    public void setGender(Gender _gender)
    {
        gender=_gender;
    }
    public Gender getGender()
    {
        return(gender);
    }
    
    public void setName(String _name)
    {
        name=_name;
    }
    public String getName() {
        return (name);
    }
    
    public static void printNames()
    {
        for(Person temp : people)
        {
            System.out.println(temp.getName());
        }   
    }
    public static void printGenders(Gender _gender)
    {
        System.out.println("================\n"+_gender+"s");
        for(Person temp : people)
        {
            if(temp.gender == _gender)
                System.out.println(temp.getName());
        }   
    }
    public static Gender getGenderType()
    {
        
        if (genderT.charAt(0) == 'M')
        {
            return(Gender.Male);
        }
        else
            return(Gender.Female);
    }
}
