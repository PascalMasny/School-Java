public class client {
        public static void main(String[] args) {
            
            //neues Kundenobjekt
            Kunde meinKundnobjekt0 = new Kunde();

            //Print out the adress
            System.out.println(meinKundnobjekt0);

            //Set Name & Print Name
            meinKundnobjekt0.setName("Maier", "Michi");
            System.out.println(meinKundnobjekt0.getKundenName());

            //Set KontoNr
            Konto myKonto  = new Konto("0815");

            System.out.println(myKonto.getKontostand());
            myKonto.buchen(1000);
            System.out.println(myKonto.getKontostand());
    
        }
    
}