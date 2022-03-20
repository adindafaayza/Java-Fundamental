import java.io.*;
import java.util.*;

public class Human {
    private final List <Organ> organs;
    
    Human (List <Organ> organs){
        this.organs = organs;
    }
    
    public List <Organ> getTotalOrgansInHumanBody(){
        return organs;
    }
}
