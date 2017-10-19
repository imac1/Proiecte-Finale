package make1;

public class VeterinaryReport {
	

	    int dogs;
	    int cats;
	    public int getAnimalsNo() {
	        return dogs + cats; // utilizare câmp din același obiect pentru care s-a făcut apelul funcției
	    }
	    public void displayStatistics() {
	        System.out.println("Total number of animals is " + getAnimalsNo());
	// apel metodă din aceeași clasă
	    }
	}


