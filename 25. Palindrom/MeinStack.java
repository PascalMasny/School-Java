public class MeinStack extends Palindromtester{
    
    private char[] stapel = new char[100];
    private int tos = 0; //tos = top of stack

    public char pop(){
        char ch = stapel[tos - 1];
        stapel[tos - 1] = '\0';
        tos--;
        return ch;
    }

    public  void push(char c){
        stapel[tos] = c;
        tos++;
    }
    
}