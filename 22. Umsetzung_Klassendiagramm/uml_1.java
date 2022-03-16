public class uml_1 {
    
	public static void main(String[] args) {

		String [][] data = {
            {"Hans", "Maier"},
            {"Peter", "Adler"},
            {"Maria", "Kranich"},
            {"Edith", "Spatz"},
            {"Karl", "Taube"}
        };

        //definiere einen Lehre 
        Lehrer michael = new Lehrer("Michael", "Müller", 1.78, data);

        //Test Cases
        michael.schreiben("Hallo, ich bin " + michael.sage_Name());
        michael.schreiben("Hallo, das ist ein Satz! :)");

        
        for (int i = 0; i < data.length; i++) {
            Schueler schueler = new Schueler(data[i][0], data[i][1], 1.80);
        }

        


	}
}