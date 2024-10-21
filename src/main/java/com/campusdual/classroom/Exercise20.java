package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {

        List<Person> peopleList = new ArrayList<>();

        Person person1 = new Person("John", "Smith");
        Teacher teacher1 = new Teacher("Maria", "Montessori", "Education");
        PoliceOfficer police1 = new PoliceOfficer("Jack", "Peralta", "B-99");
        Doctor doctor1 = new Doctor ("Gregory", "House", "Nephrology and Infectology");

        peopleList.add(person1);
        peopleList.add(teacher1);
        peopleList.add(police1);
        peopleList.add(doctor1);

        return peopleList;
    }

    public static void showPeopleDetails(List<Person> stringList) {

        for(Person p: stringList) {
            System.out.println(p.getDetails());
        }

    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
