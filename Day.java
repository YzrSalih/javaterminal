package Exercises.Task4;

import java.util.ArrayList;
import java.util.List;

public class Day {
   private List<String> subjects = new ArrayList<>();

   //Constructor Overloading
    public Day(String subject1) {
        subjects.add(subject1);
    }
    public Day(String subject1,String subject2) {
        subjects.add(subject1);
        subjects.add(subject2);
    }
    public Day(String subject1,String subject2,String subject3) {
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
    }
    public Day(String subject1, String subject2, String subject3, String subject4) {
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);
    }
    public Day() {

    }

    public void getDay(){
        System.out.println(subjects.toString());
    }

    public void addSubject(String subject){
        if(!subjects.contains(subject)){
            subjects.add(subject);
            System.out.println("Added Successfully");
        }else{
            System.out.println("this subject already exist");
        }
    }

    public void removeSubject(String subject){
        if(subjects.contains(subject)){
            subjects.remove(subject);
            System.out.println("Removed Successfully");
        }else{
            System.out.println("No such subject exist to be removed.");
        }
    }
}
