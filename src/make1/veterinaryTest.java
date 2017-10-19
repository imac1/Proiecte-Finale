package make1;

public class veterinaryTest {
	
	    public static void main(String[] args) {
	        
	    	VeterinaryReport vr = new VeterinaryReport(); // se creează un obiect de tipul VeterinaryReport
	        vr.cats = 99; // se setează valori pentru variabilele membre ale obiectului vr (obiectul este specificat exlpicit!)
	        vr.dogs = 199;
	        vr.displayStatistics(); // se apelează funcția membra a obiectului creat
	        System.out.println("The class method sais there are " +
	vr.getAnimalsNo() + " animals");
	    }
	}


