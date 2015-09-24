package school;

public class Student extends Person{
    private int gradeLevel;
    private Course theCourse;
    
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
    public void addCourse(Course _course)
    {
        if(theCourse==null)
        {
            theCourse= _course;
            _course.addStudent(this);
        }
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
            }
        }
    }
    
    
}
