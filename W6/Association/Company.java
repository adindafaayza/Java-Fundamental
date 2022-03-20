import java.util.*;

public class Company {
    private String companyName;
    List <Artist> artists;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public List <Artist> getArtists(){
        return artists;
    }
    
    public void setCompany(List <Artist> artists){
        this.artists = artists;
    }
    
}
