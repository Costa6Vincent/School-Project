package school;

public class School {

    public static void main(String[] args) {
        //Parameter (name, gender, age, weight
        Person Joe = Person.addPerson("Joe",Person.Gender.Male,15,150);
        Person Jill = Person.addPerson("Jill",Person.Gender.Female,16,125);
        Person Billy = Person.addPerson("Billy",Person.Gender.Male,14,136);
        Person.printGenders(Person.getGenderType());
        System.out.println(Joe.toString());
        //Person.printAllInfo(null, Person.Gender.Male, _age, _weight);
        Course PE = Course.addCourse("PE", Course.Type.PE, 1);
        Course Elective = Course.addCourse("Elective", Course.Type.Elective, 2);
        System.out.println(Elective.toString());
        
    }
}
