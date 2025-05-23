package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> ListaPersonas = new ArrayList<>();
        ListaPersonas.add(new Person("John", "Smith"));
        ListaPersonas.add(new Teacher("María ", "Montessori", "Educación"));
        ListaPersonas.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        ListaPersonas.add(new Doctor("Pedro", "Lopez", "Cardiologia"));
        return ListaPersonas;

    }

    public static void showPeopleDetails(List<Person> lista) {
        for (Person item : lista) {
            if (item instanceof Doctor) {
                ((Doctor)item).getDetails();
            } else if (item instanceof PoliceOfficer) {
                ((PoliceOfficer)item).getDetails();
            } else if (item instanceof Teacher) {
                ((Teacher)item).getDetails();
            } else {
                ((Person)item).getDetails();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }
}
