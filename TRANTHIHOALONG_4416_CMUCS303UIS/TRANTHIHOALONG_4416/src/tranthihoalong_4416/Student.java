package tranthihoalong_4416;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Enter ID Student: ");
            String id = sc.nextLine();
            setId(id);
            System.out.print("Enter Full Name Student: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.print("Enter Date Of Birth(dd/MM/yyyy): ");
            String dateOfBirth = sc.nextLine();
            setDateOfBirth(sdf.parse(dateOfBirth));
            System.out.print("Enter Book Borrow Date(dd/MM/yyyy): ");
            String bookBorrowDate = sc.nextLine();
            setBookBorrowDate(sdf.parse(bookBorrowDate));
            System.out.print("Enter Book Borrow Return(dd/MM/yyyy): ");
            String bookReturnDate = sc.nextLine();
            setBookReturnDate(sdf.parse(bookReturnDate));
            System.out.print("Enter GPA: ");
            float gpa = sc.nextFloat();
            setGpa(gpa);
            sc.nextLine();
            System.out.print("Enter Major: ");
            String major = sc.nextLine();
            setMajor(major);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void updatePerson(String id) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("ID Student: " + id);
            System.out.println("Enter New Full Name Student: ");
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
            System.out.print("Enter New GPA: ");
            float gpa = sc.nextFloat();
            setGpa(gpa);
            sc.nextLine();
            System.out.print("Enter New Major: ");
            String major = sc.nextLine();
            setMajor(major);

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nID Student: " + getId()
                + "\nFull Name Student: " + getFullName()
                + "\nDate Of Birth: " + sdf.format(getDateOfBirth())
                + "\nDate Book Borrow: " + sdf.format(getBookBorrowDate())
                + "\nDate book Return: " + sdf.format(getBookReturnDate())
                + "\nGPA: " + getGpa()
                + "\nMajor: " + getMajor()
                + "\n");
    }

}
