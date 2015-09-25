package school;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Course {
    private String name;
    private Type type;
    private int period;
    private Student theStudent;
    private Teacher theTeacher;
    private static int numClasses;
    public static int numClass=10;
    private static int currentClass=0;
    private static ArrayList<Course>courses= new ArrayList<>();

    public void addStudent(Student _student)
    {
        if(theStudent==null)
        {
            theStudent=_student;
            _student.addCourse(this);
        }
    }
    public void addTeacher(Teacher _teacher)
    {
        if(theTeacher==null)
        {
            theTeacher=_teacher;
            _teacher.addCourse(this);
        }
    }
    public void setStudentDoIt(Course _course) {
        courses.add(this);
    }

    public void setStudentDoIt(Student _student) 
    {
        courses.add(this);
    }
    public boolean setStudentOk(Student _student) 
    {
        return(true);
    }

    
    
    
    enum Type
    {
        Math,Science,History,English,Language,Elective,PE
    }
   
    
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
        numClasses=0;
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
    public Student getStudent() {
        return (theStudent);
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
    public static void printAllClasses()
    {
        for(Course temp : courses)
        {
            if(temp != null)
            {
                System.out.println("Class: "+temp.getName()+" Period: "+temp.getPeriod()+" Type: "+temp.getType());
            }
            numClasses++;
        }   
        System.out.println("Number of Classes: "+numClasses);
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
        return(name+" |Type: "+type+ " |Period: "+period);
    }
    
    
}
