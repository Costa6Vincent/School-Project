/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Calendar;
public class Person {

   
    enum Gender //creating an enumuration for "Gender" |||| 
    {  
        Male,Female
    }
    protected static ArrayList<Person>people= new ArrayList<>();
    private Gender gender;
    private String name;
    private int age;
    private int weight;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double rudeFactor;
    private static String genderT=(JOptionPane.showInputDialog("Enter Gender: "));
    
    
    public static Person addPerson(String _name,Gender _gender, int _weight,int _bDay,int _bMonth,int _bYear)
    {
        Person temp =new Person(_name,_gender,_weight,_bDay,_bMonth,_bYear);
        people.add(temp);
        return(temp);
    }
    public static Person addTeacher(String _name,Gender _gender, int _weight,double _rudeFactor,int _bDay,int _bMonth,int _bYear)
    {
        Person temp =new Person(_name,_gender,_weight,_rudeFactor,_bDay,_bMonth,_bYear);
        people.add(temp);
        return(temp);
    }
    public static void addPerson(Person _person)
    {
        people.add(_person);
    }
    
    Person()
    {
        name="none";
        gender=Gender.Female;
        age=0;
        weight=0;
    }
    Person(String _name, Gender _gender,int _weight,int _bDay,int _bMonth,int _bYear)
    {
        name=_name;
        gender=_gender;
        weight=_weight;
        birthDay=_bDay;
        birthMonth=_bMonth;
        birthYear=_bYear;
    }
    Person(String _name, Gender _gender,int _weight,double _rudeFactor,int _bDay,int _bMonth,int _bYear)
    {
        name=_name;
        gender=_gender;
        weight=_weight;
        birthDay=_bDay;
        birthMonth=_bMonth;
        birthYear=_bYear;
        rudeFactor=_rudeFactor;
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
    public double getRudeFactor()
    {
        return(rudeFactor);
    }
    
    public void setBirthdate(int _day,int _month,int _year)
    {
        birthDay=_day;
        birthMonth=_month;
        birthYear=_year;
    }
    public int getBDAY()
    {
        return(birthDay);
    }
    public int getBMONTH()
    {
        return(birthMonth);
    }
    public int getBYEAR()
    {
        return(birthYear);
    }
    
    public int getAge()
    {
        Calendar cal = Calendar.getInstance();
        int currentDay=cal.get(Calendar.DAY_OF_MONTH);
        int currentMonth=cal.get(Calendar.MONTH)+1;
        int currentYear=cal.get(Calendar.YEAR);
        
        int ageDay=currentDay-birthDay;
        int ageMonth=currentMonth-birthMonth;
        age=currentYear-birthYear;
        System.out.println((char)27 +"[36m"+name+ " " + age);
        
        return (age);
    }
    public void setAge(int _age)
    {
        age=_age;
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
        return(name+" | Gender: "+gender+" Weight: "+weight+" Birthdate: "+birthDay+"-"+birthMonth+"-"+birthYear);
    }
    
    
    public static void printAllInfo()
    {
        for(Person temp : people)
        {
            String s = (char)27+"[36m"+temp.getName();
            System.out.println(s);
            s = null;
            System.out.println(" | Gender: "+temp.getGender()+" Weight: "+temp.getWeight()+" Birthdate: "+temp.getBDAY()+"-"+temp.getBMONTH()+"-"+temp.getBYEAR());
        }   
    }
    public static void printAllStudentAges()
    {
        for(Person temp : people)
        {
            if(temp instanceof Student)
                temp.getAge();
        }
    }
    public static void printAllTeacherAges()
    {
        for(Person temp : people)
        {
            if(temp instanceof Teacher)
                temp.getAge();
        }
    }
    public static void ChangeAllWeights()
    {
        for(Person temp : people)
        {
            if(temp.getWeight()>=100)
                temp.setWeight(temp.getWeight()+((int)((Math.random()*25)-6)));
        }
    }
    public static void ChangeAllAges()
    {
        for(Person temp : people)
        {
                temp.setAge(temp.getAge()+1);
        }
    }
    public static void PrintAllWeights()
    {
        for(Person temp : people)
        {
            System.out.println(temp.getWeight());
        }
    }
    public static void PrintAllAges()
    {
        for(Person temp : people)
        {
            System.out.println(temp.getAge());
        }
    }
}
