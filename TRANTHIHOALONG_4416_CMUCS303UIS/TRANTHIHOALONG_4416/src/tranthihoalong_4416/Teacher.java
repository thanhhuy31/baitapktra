package tranthihoalong_4416;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter ID Teacher: ");
            String id = sc.nextLine();
            setId(id);
            System.out.print("Enter Full Name Teacher: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.print("Enter Date Of Birth(dd/MM/yyyy): ");
            String dateOfBirth = sc.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirth));
            System.out.print("Enter Date Book Borrow(dd/MM/yyyy): ");
            String bookBorrowDate = sc.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDate));
            System.out.print("Enter Date Book Return(dd/MM/yyyy): ");
            String bookReturnDate = sc.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDate));
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            setDepartment(department);
            System.out.print("Enter Teaching Subject: ");
            String teachingSubject = sc.nextLine();
            setTeachingSubject(teachingSubject);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    @Override
    public void updatePerson(String id) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("ID: " + id);
            System.out.print("Enter NEw Full Name Teacher: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.print("Enter New Date Of Birth(dd/MM/yyyy): ");
            String dateOfBirth = sc.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirth));
            System.out.print("Enter New Date Book Borrow(dd/MM/yyyy): ");
            String bookBorrowDate = sc.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDate));
            System.out.print("Enter New Date Book Return(dd/MM/yyyy): ");
            String bookReturnDate = sc.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDate));
            System.out.print("Enter New Department: ");
            String department = sc.nextLine();
            setDepartment(department);
            System.out.print("Enter New Teaching Subject: ");
            String teachingSubject = sc.nextLine();
            setTeachingSubject(teachingSubject);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nID Teacher: " + getId()
                + "\nFull Name Teacher: " + getFullName()
                + "\nDate Of Birth: " + sdf.format(getDateOfBirth())
                + "\nDate Book Borrow: " + sdf.format(getBookBorrowDate())
                + "\nDate Book Return: " + sdf.format(getBookReturnDate())
                + "\nDepartment: " + getDepartment()
                + "\nTeaching Subject: " + getTeachingSubject()
                + "\n");
    }

}
