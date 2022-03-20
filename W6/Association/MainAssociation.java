import java.util.*;

public class MainAssociation {
    public static void main(String[] args) {
        Company company = new Company();
        company.setCompanyName("SM Entertainment");
        
        Artist artist = new Artist();
        artist.setArtistName("AESPA");
        Artist artist2 = new Artist();
        artist2.setArtistName("EXO");
        Artist artist3 = new Artist();
        artist3.setArtistName("BoA");
        
        List <Artist> empList = new ArrayList <Artist>();
        empList.add(artist);
        empList.add(artist2);
        empList.add(artist3);
        
        company.setCompany(empList);
        
        System.out.println(company.getArtists() + " are artists under " + company.getCompanyName());
    }
    
}
