package school;
public class Teacher extends Person{
    
    private double rudeFactor;
    private Course theCourse;
    
    public static Teacher addTeacher(String _name,Gender _gender, int _weight,double _rudeFactor,int _bDay,int _bMonth,int _bYear)
    {
        Teacher temp =new Teacher(_name,_gender,_weight,_rudeFactor,_bDay,_bMonth,_bYear);
        addPerson(temp);
        return(temp);
    }
    Teacher(String _name, Gender _gender,int _weight,double _rudeFactor,int _bDay,int _bMonth,int _bYear)
    {
        super(_name,_gender,_weight,_bDay,_bMonth,_bYear);
        rudeFactor = _rudeFactor;
    }
    public void setrudeFactor(int _rudeFactor)
    {
        rudeFactor=_rudeFactor;
    }
    public double getRudeFactor()
    {
        return(rudeFactor);
    }
    public void addCourse(Course _course)
    {
        if(theCourse==null)
        {
            theCourse= _course;
            _course.addTeacher(this);
        }
    }
    public void printStudentTeacherTeaches()
    {
        if(theCourse!=null)
        {
            if(theCourse.getStudent()!=null)
            {
                System.out.println(getName()+"teaches "+theCourse.getStudent().getName());
                return;
            }
        }
        System.out.println(getName()+" techaes no one");
        
    }
    public static void printAllInfo()
    {
        for(Person temp : people)
        {
            if(temp instanceof Teacher)
            {
                String s = (char)27+"[36m"+temp.getName();
                System.out.println(s);
                s = null;
                System.out.println(" | Gender: "+temp.getGender()+" Weight: "+temp.getWeight()+" Rude Factor: "+temp.getRudeFactor()+" Birthdate: "+temp.getBDAY()+"-"+temp.getBMONTH()+"-"+temp.getBYEAR());
            }
        }
    }
    
}
