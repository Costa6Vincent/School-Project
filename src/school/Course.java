package school;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Course {
    private String name;
    private Type type;
    private int period;
    
    
    enum Type
    {
        Math,Science,History,English,Language,Elective,PE
    }
    public static int numClass=10;
    private static int currentClass=0;
    private static ArrayList<Course>courses= new ArrayList<>();
    
    public static Course addCourse(String _name,Type _type,int _period)
    {
        Course temp =new Course(_name,_type,_period);
        courses.add(temp);
        return(temp);
    }
    Course()
    {
        name="none";
        type=null;
        period=0;
    }
    Course(String _name, Type _type,int _period)
    {
        name=_name;
        type=_type;
        period=_period;
    }
    public void setname(String _name)
    {
        name=_name;
    }
    public Type getType()
    {
        return(type);
    }
    
    public void setName(String _name)
    {
        name=_name;
    }
    public String getName() {
        return (name);
    }
    
    public void setPeriod(int _period)
    {
        period=_period;
    }
    public int getPeriod()
    {
        return(period);
    }
    
    public static void printNames()
    {
        for(Course temp : courses)
        {
            System.out.println(temp.getName());
        }   
    }
    public static void printClasses(Type _type)
    {
        System.out.println("================\n"+_type+"s");
        for(Course temp : courses)
        {
            if(temp != null)
                System.out.println(temp.getType());
        }   
    }
    
//    public static Type getClassType()
//    {
//        
//        if (name.charAt(0) == 'M')
//        {
//            return(Person.Gender.Male);
//        }
//        else
//            return(Person.Gender.Female);
//    }
    
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
        return(name+" Type: "+type+ "Period: "+period);
    }
    
    
//    public static void printAllInfo(String _name,Person.Gender _gender,int _age,int _weight)
//    {
//        System.out.println("================\n"+_name);
//        for(Person temp : people)
//        {
//                System.out.println(temp.getName());
//                System.out.println(temp.getGender());
//                System.out.println(temp.getAge());
//                System.out.println(temp.getWeight());
//        }   
//    }
}
