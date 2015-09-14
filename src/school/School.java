package school;

public class School {

    public static void main(String[] args) {
        
        Person Joe = Person.addPerson("Joe",Person.Gender.Male);
        Person Jill = Person.addPerson("Jill",Person.Gender.Female);
        Person Billy = Person.addPerson("Billy",Person.Gender.Male);
        Person.printGenders(Person.getGenderType());
    }
}
