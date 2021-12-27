package Exercises.Task4;

public class Main {
    public static void main(String[] args) {
        Day monday = new Monday("Computer Architecture","Java");
        Day tuesday = new Tuesday("Computer Architecture","Java","C++");
        Day wednesday = new Wednesday();

        monday.getDay(); // returns Mondays schedule
        tuesday.getDay(); // returns Tuesdays schedule
        wednesday.getDay(); // returns Wednesdays schedule
        System.out.println("****************************");
        wednesday.addSubject("Art Time");
        wednesday.getDay();

        /*
        No class on Wednesday :))) Rest buddy
        [Computer Architecture, Java]
        [Computer Architecture, Java, C++]
        []
        ****************************
        Added Successfully
        [Art Time]
        */
    }
}
