import java.io.*;
import java.util.*;

public class MainComposition {
    public static void main(String[] args) {
        Organ o1 = new Organ("Heart");
        Organ o2 = new Organ("Lungs");
        Organ o3 = new Organ("Brain");
        Organ o4 = new Organ("Kidneys");
        Organ o5 = new Organ("Liver");
        
        List <Organ> organs = new ArrayList<Organ>();
        organs.add(o1);
        organs.add(o2);
        organs.add(o3);
        organs.add(o4);
        organs.add(o5);
        
        Human human = new Human(organs);
        
        List <Organ> orgs = human.getTotalOrgansInHumanBody();
        for (Organ org : orgs ){
            System.out.print(org.organ + ", ");
        }
        System.out.println("\b\b are the vital organs in the human body.");
    }
}
