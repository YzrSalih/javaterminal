import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
class MyCurrentDate implements Runnable{
    
    public static int myCount = 0;
    public MyCurrentDate(){
         System.out.println("Started");
    }
    public void run() {
        while(MyCurrentDate.myCount < 10){
            try{
                MyCurrentDate.myCount++;
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                LocalDateTime now = LocalDateTime.now();  
                System.out.println("Current Date and Time: "+dtf.format(now));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
            
        }
        System.out.println("Ended.");
    } 
}