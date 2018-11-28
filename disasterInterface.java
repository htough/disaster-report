import java.util.Scanner;
import java.util.*;

public class disasterInterface{

  public static ArrayList<disaster> Dis = new ArrayList<disaster>();

  public static void main(String[] args) {
    char i = '1';
    Scanner scan = new Scanner(System.in);

    while (i != '0'){
      System.out.println("What would you like do? Input number associated with request.");
      System.out.println("(1) Add disaster");
      System.out.println("(2) Find disaster");
      System.out.println("(3) Close");
      try {
      String s = scan.nextLine();
      if (s.equals("1")){
        System.out.print("Enter description: ");
        String description = scan.nextLine();
        System.out.print("Enter state: ");
        String state = scan.nextLine();

        System.out.print("Enter town: ");
        String town = scan.nextLine();
        System.out.print("Enter people affected: ");
        String people = scan.nextLine();
        System.out.println();
        disaster event = new disaster(description, state, town, people);
        Dis.add(event);
      }
      else if (s.equals("2")){
        System.out.print("Enter your state: ");

        String state = scan.nextLine();
        System.out.println();
        ArrayList<disaster> events = new ArrayList<disaster>();

        for (int t = 0; t < Dis.size(); t ++){
          disaster event = Dis.get(t);
          String[] loc = event.getLocation();
          if (loc[1].toUpperCase().equals(state.toUpperCase())){
            events.add(event);
          }
        }
        if (events.size() == 0){
          System.out.println("No disasters reported in your area");
          System.out.println();
        }
        else{
        for (int j = 0; j < events.size(); j ++){
          System.out.print("Description: ");
          System.out.println(events.get(j).getDescription());
          System.out.print("Location: ");
          System.out.println(events.get(j).getLocation()[0] + ", " + events.get(j).getLocation()[1]);
          System.out.print("People affected: ");
          System.out.println(events.get(j).getPeople());
          System.out.println();

        }
      }


      }

      else if (s.equals("3")){
        i = '0';
      }

      else{
        System.out.println("Please enter one of the values");
      }

    }

    catch (Exception e) {

      System.out.println("Please Enter String");
    }
  }
  }

}
