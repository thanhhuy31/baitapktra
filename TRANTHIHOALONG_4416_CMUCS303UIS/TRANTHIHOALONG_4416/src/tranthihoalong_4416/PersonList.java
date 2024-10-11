package tranthihoalong_4416;

import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> personList;

    public PersonList() {
        personList = new ArrayList<>();
    }

    public PersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void updatePerson(String id) {
        for (Person person : personList) {
            if (person instanceof Student && person.getId().equals(id)) {
                Student personToUpdate = (Student) person;
                personToUpdate.updatePerson(id);
                return;
            } else if (person instanceof Teacher && person.getId().equals(id)) {
                Teacher personToUpdate = (Teacher) person;
                personToUpdate.updatePerson(id);
                return;
            }
        }
    }

    public void deletePersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                personList.remove(person);
                System.out.println("Delete successfully");
                return;
            }
            System.out.println("No information");
        }
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }

    public void disPlayEveryOne() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }

            }
        }
        return topStudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }

    public void checkBookBorrowinf(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                if (person.isBookOverdue()) {
                    System.out.println("Overdue");
                } else {
                    System.out.println("No overdue");
                }
                return;
            }
        }
        System.out.println("Person ID not found");
    }
}
