//Print alle ASCI groß char
public class ASCII_Groß {
    
	public static void main(String[] args) {
        
       //ASCII 65-90
       
       int i;
       char c;

       for(i=65;i<=90;i++) {

          c =(char)i; // int to char
        
          System.out.println(i+"  =  "+c); //Print
       }


	}

}
