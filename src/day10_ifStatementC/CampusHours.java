package day10_ifStatementC;

public class CampusHours {
    public static void main(String[] args) {
        int time = 7;
        String result = "";
        if (time  >= 8 && time <= 23){
           // System.out.println("Open");
            result = "open";
        }else{
           // System.out.println("Closed");
            result = "Closed";
            System.out.println("result" + result);
        }

    }
}
