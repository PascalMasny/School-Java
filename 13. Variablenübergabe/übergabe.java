import java.security.PublicKey;

public class übergabe {
    
    public static void main (String[] args){
        
        int i = 10;
        System.out.println("int variable vorher:" + i);
        summVar(i);
        System.out.println("int variable nachher:" + i);
    }

    static void summVar(int i){
        i = i + 10;
    }
}
