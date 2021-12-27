package Exercises.Task3;

import java.util.*;

public class LibraryUser {
    private String surname;
    private String nameInitial;
    private String department;
    private int numberOfBooks;
    public static List<LibraryUser> users = new ArrayList<>();

    public LibraryUser(String surname, String nameInitial, String department, int numberOfBooks) {
        this.surname = surname;
        this.nameInitial = nameInitial;
        this.department = department;
        this.numberOfBooks = numberOfBooks;
    }

   public static void getLargestBookAcquiredUser(){
        int maxNumber= 0;
        LibraryUser maxnumberUser = users.get(0);
        for(LibraryUser user : users){
            if(user.numberOfBooks > maxNumber){
                maxnumberUser = user;
            }
        }
       System.out.println("User has largets book number : \n " +maxnumberUser.toString());
   }
   public static void getUsersByDepartmentAsc(String department){
       TreeMap<String,LibraryUser> usersByDepartment = new TreeMap<>();
        for (LibraryUser user : users ) {
           if(user.department.equals(department)) {
               usersByDepartment.put(user.surname,user);
           }
       }

       System.out.println("Users Listed Alphabetically : \n " + usersByDepartment.values().toString());
   }
    public static void addUser(LibraryUser user){
        if(users.contains(user)) {
            System.out.println("User has already exist");
        }else{
            users.add(user);
        }
    }
    public void removeUser(LibraryUser user){
        if(!users.contains(user)) {
            System.out.println("User not exist");
        }else{
            users.remove(user);
        }
    }
    public static void listUsers(){
        System.out.println("Users : \n" + users.toString());
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNameInitial() {
        return nameInitial;
    }

    public void setNameInitial(String nameInitial) {
        this.nameInitial = nameInitial;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "surname='" + surname + '\'' +
                ", nameInitial='" + nameInitial + '\'' +
                ", department='" + department + '\'' +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        LibraryUser samet = new LibraryUser("YAZAR","S","Computer Science",4);
        LibraryUser salih = new LibraryUser("YAZAR","S","ART",17);
        LibraryUser serra = new LibraryUser("SARACOGLU","S","Computer Science",37);

        LibraryUser.addUser(samet);
        LibraryUser.addUser(salih);
        LibraryUser.addUser(serra);
        LibraryUser.listUsers();
        LibraryUser.getLargestBookAcquiredUser();
        LibraryUser.getUsersByDepartmentAsc("Computer Science");

        /*
         Users :
         [
            LibraryUser{surname='YAZAR', nameInitial='S', department='Computer Science', numberOfBooks=4},
            LibraryUser{surname='YAZAR', nameInitial='S', department='ART', numberOfBooks=17},
            LibraryUser{surname='SARACOGLU', nameInitial='S', department='Computer Science', numberOfBooks=37}
         ]

         User has largets book number :
         LibraryUser{surname='SARACOGLU', nameInitial='S', department='Computer Science', numberOfBooks=37}

         Users Listed Alphabetically :
         [
            LibraryUser{surname='SARACOGLU', nameInitial='S', department='Computer Science', numberOfBooks=37},
            LibraryUser{surname='YAZAR', nameInitial='S', department='Computer Science', numberOfBooks=4}
         ]

        * */
    }
}
