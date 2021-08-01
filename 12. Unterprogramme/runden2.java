public class runden2 {
    
    public static void main (String[] args){
    
        //generate random int
        float i = Math.random();

        //main
        runden(i);
        komma(i);

    }

    //runden
    static runden(float i){
        i = Math.round(i);
        return i;
    }

    //kommastellen
    static komma(float i){

        for (int n = 5; n > 0; n++){
            i = i * n;
            runden(i);

            i = i / 10;

            System.out.println(i);
        }
    }
    

}
