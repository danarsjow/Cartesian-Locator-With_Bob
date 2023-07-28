import java.util.Scanner;

public class PlaneLocator {
    
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        boolean play = true;
        
            Scanner scan = new Scanner(System.in);

            System.out.println("[1] Location");
            System.out.println("[2] Move");
            System.out.println("[3] Reset");
            System.out.println("[Any number not 1..3] Quit");
            System.out.println("Enter Choice [1...n] >>");
            
            while(play) {
            int choice = scan.nextInt();

        switch(choice){
            case 1: System.out.println("Bob is currently at "+ x +","+ y);
            break;
            case 2:
            System.out.println("Enter Direction [N,E,S,W] >> ");
                String direction = scan.next();
                System.out.println("Enter Distance [1...1000] >> ");
                int distance = scan.nextInt();
                System.out.println("Bob moved " + direction + " " + distance + " units");
                if(direction.startsWith("N")){
                    y -= distance;
                }
                if(direction.startsWith("E")){
                    x += distance;
                }
                if(direction.startsWith("S")){
                    y -= distance;
                }
                if(direction.startsWith("W")){
                    x -= distance;
                }
                break;

            case 3: x = 0;
                    y = 0;
                    System.out.println("Bob reset at the origin");
                    break;
            default: System.out.println("Goodbye Bob");   
                play = false;
                break;
                  }
            }
            scan.close();
        }
}
