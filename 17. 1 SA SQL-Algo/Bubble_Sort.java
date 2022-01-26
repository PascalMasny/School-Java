public class Bubble_Sort {
    
    public static void main(String[] args) {
        
        int array_unsorted[] = {1,2,43,1,5,26,7,328,29,10};
        
        int array_sorted[] = bubble_Sort(array_unsorted);


    }

    public static int[] bubble_Sort(int[] array){

        for(int i = 0; i < array.length; i++){
            for(int n = 0; n < array.length -1; n++){
                if(array[n] > array[n+1]){
                    int temp = array[n];
                    array[n] = array[n+1];
                    array[n+1] = temp;
                }
            
            }
        }

        return array;
    }
}
