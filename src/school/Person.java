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
    private int age;
    private int weight;
    private static String genderT=(JOptionPane.showInputDialog("Enter Gender: "));
    
    public static Person addPerson(String _name,Gender _gender,int _age, int _weight)
    {
        Person temp =new Person(_name,_gender,_weight,_age);
        people.add(temp);
        return(temp);
    }
    Person()
    {
        name="none";
        gender=Gender.Female;
        age=0;
        weight=0;
    }
    Person(String _name, Gender _gender,int _age,int _weight)
    {
        name=_name;
        gender=_gender;
        age=_age;
        weight=_weight;
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
    
    public void setWeight(int _weight)
    {
        weight=_weight;
    }
    public int getWeight()
    {
        return(weight);
    }
    
    public void setAge(int _age)
    {
        age=_age;
    }
    public int getAge()
    {
        return(age);
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
    
    public static void getInfo()
    {
        String info = (JOptionPane.showInputDialog("Enter Command: "));
        if (info.charAt(0) == 'W'&&info.charAt(1) == 'e'&&info.charAt(2) == 'i')
        {
//            (JOptionPane.showInputDialog());
        }
        if (info.charAt(0) == 'A'&&info.charAt(1)== 'g'&&info.charAt(2)== 'e')
        {
            
        }
    }
    
    
    public String toString()
    {
        return(name+" Gender: "+gender+" Weight: "+weight+" Age: "+age);
    }
    
    
    public static void printAllInfo(String _name,Gender _gender,int _age,int _weight)
    {
        System.out.println("================\n"+_name);
        for(Person temp : people)
        {
                System.out.println(temp.getName());
                System.out.println(temp.getGender());
                System.out.println(temp.getAge());
                System.out.println(temp.getWeight());
        }   
    }
}
