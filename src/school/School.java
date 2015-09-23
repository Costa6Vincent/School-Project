package school;
public class School {
    public static void main(String[] args) {
        //Parameter (name, gender, weight, birthday, birthmonth, birthyear)
        Person Joe = Person.addPerson("Joe",Person.Gender.Male,150,4,8,2001);
        Person Jill = Person.addPerson("Jill",Person.Gender.Female,125,16,4,1999);
        Person Billy = Person.addPerson("Billy",Person.Gender.Male,136,30,12,1998);
        Person Vincent = Person.addPerson("Vincent",Person.Gender.Male,150,4,8,1999);
        Person Anna = Person.addPerson("Anna Marie",Person.Gender.Female,125,5,14,2000);
        Person Ray = Person.addPerson("Ray",Person.Gender.Male,125,6,14,1999);
        Person Kayleen = Person.addPerson("Kayleen",Person.Gender.Female,125,8,5,1997);
        Person Taliah = Person.addPerson("Taliah",Person.Gender.Female,125,9,26,2000);
        Person Daphne = Person.addPerson("Daphne",Person.Gender.Female,125,6,14,2001);
        Person Ashley = Person.addPerson("Ashley",Person.Gender.Female,125,8,12,2000);
        //Parameter (name, type, period, \capacity\, \teacher\)
        Course Weights1 = Course.addCourse("Weights 1", Course.Type.PE, 1);
        Course Weights2 = Course.addCourse("Weights 2", Course.Type.PE, 1);
        Course ComputerScience1 = Course.addCourse("CS1", Course.Type.Elective, 2);
        Course ComputerScience2 = Course.addCourse("CS2", Course.Type.Elective, 2);
        Course ComputerScience3 = Course.addCourse("CS3", Course.Type.Elective, 2);
        Course English1 = Course.addCourse("English 9H", Course.Type.English, 3);
        Course English2 = Course.addCourse("English 10H", Course.Type.English, 3);
        Course English3 = Course.addCourse("English 11H", Course.Type.English, 3);
        Course PLTWIED = Course.addCourse("Engineering1", Course.Type.Elective, 4);
        Course PLTWPRTCL = Course.addCourse("Engineering2", Course.Type.Elective, 4);
        Course PLTWAS = Course.addCourse("Engineering3", Course.Type.Elective, 4);
        Course History1 = Course.addCourse("History9H", Course.Type.History, 5);
        Course History2 = Course.addCourse("History10H", Course.Type.History, 5);
        Course History3 = Course.addCourse("History11H", Course.Type.History, 5);
        Course History4 = Course.addCourse("History12H", Course.Type.History, 5);
        Course Integrate1 = Course.addCourse("Integrated1", Course.Type.Math, 6);
        Course Integrate2 = Course.addCourse("Integrated2", Course.Type.Math, 6);
        Course Integrate3 = Course.addCourse("Integrated3", Course.Type.Math, 6);
        
        
        //Parameter (name, gender, weight,grade level, birthday, birthmonth, birthyear)
        Student Bobby=Student.addStudent("Bobby",Person.Gender.Male,150,10,4,8,1999);
        Student Mike=Student.addStudent("Mike",Person.Gender.Male,200,10,9,12,1998);
        Student Kid=Student.addStudent("Kid",Person.Gender.Male,175,9,16,4,2000);
        
        //Prints all General Info of Students and Classes
        Start.lineSkip("Printing All Student Info...");
        Person.printAllInfo();
        Start.lineSkip("Printing All Class Info...");
        Course.printAllClasses();
        Start.lineSkip("Printing All Student Ages...");
        Person.printAllAges();
        

        
        //Simulation
        boolean Simulation = Start.SimulationWarning();
        if(Simulation)
        {
            while(true)
            {
                Person.ChangeAllWeights();
                Person.printAllInfo();
                Person.PrintAllAges();
                
            }
        }
    }
}
