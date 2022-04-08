public class MeinStack extends Palindromtester{
    
    public char[] stapel;
    public ibt tos = 0; //tos = top of stack

    public  cahr pop(){
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