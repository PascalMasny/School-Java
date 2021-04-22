//Abschlussprüfung Teil 1 2020 Schreibtischtest
public class Schreibtischtest_Loopfun {
   
    public static void main(String[] args) {
        for(int i=1;i<=15;i++){

            if(i%3 == 0 & i%5 == 0){
                System.out.println("foobar");
            }   

            else{

                if(i%3 == 0){
                System.out.println("foo");
                }

                else if(i%5 == 0){
                System.out.println("bar");
                }

                else {
                System.out.println(i);
                }

            }
        }
    }
    
}
