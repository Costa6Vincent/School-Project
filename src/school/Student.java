package school;

import java.util.ArrayList;

public class Student extends Person{
    private static int numStudents;
    private int gradeLevel;
    private Course theCourse;
    private static final int numCourses=4;
    protected static Course courses[]=new Course[numCourses];
    
    public static Student addStudent(String _name,Gender _gender, int _weight,int _gradeLevel,int _bDay,int _bMonth,int _bYear)
    {
        Student temp =new Student(_name,_gender,_weight,_gradeLevel,_bDay,_bMonth,_bYear);
        addPerson(temp);
        return(temp);
    }
    Student(String _name, Gender _gender,int _weight,int _gradeLevel,int _bDay,int _bMonth,int _bYear)
    {
        super(_name,_gender,_weight,_bDay,_bMonth,_bYear);
        gradeLevel = _gradeLevel;
    }
    public void setgradeLevel(int _gradeLevel)
    {
        gradeLevel=_gradeLevel;
    }
    public int getgradeLevel()
    {
        return(gradeLevel);
    }
    public boolean addCourse(Course _course)
    {
        if(!setCourseOK(_course))
            return(false);
        if(!theCourse.setStudentOk(this))
            return(false);
        _course.setStudentDoIt(this);
        setCourseDoIt(_course);
        return(false);
    }
    public void setCourseDoIt(Course _course)
    {
        courses[_course.getPeriod()-1]=_course;
    }
    public boolean setCourseOK(Course _course) {
        if(_course==null)
            return(false);
        if(courses[_course.getPeriod()-1]!=null)
            return(false);
        return(true);
    }
    

    public static void printAllInfo()
    {
        for(Person temp : people)
        {
            if(temp instanceof Student)
            {
                String s = (char)27+"[36m"+temp.getName();
                System.out.println(s);
                s = null;
                System.out.println(" | Gender: "+temp.getGender()+" Weight: "+temp.getWeight()+" Birthdate: "+temp.getBDAY()+"-"+temp.getBMONTH()+"-"+temp.getBYEAR());
                numStudents++;
            }
        }
        System.out.println("Number of Students: "+numStudents);
    }

    
    
    
}
