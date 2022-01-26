public class Selection_Sort {
    //hello World
    public static void main(String[] args) {
        
        int array_unsorted[] = {1,2,43,1,5,26,7,328,29,10};
        
        int array_sorted[] = selection_Sort(array_unsorted);
        
        
    }
    
    public static int[] selection_Sort(int[] array){

        for(int index = 0; index < array.length; index++){
            int min = array[index];

            for(int i = 0; i < index + 1; i++){
                
                if(array[i] < min){
                    min = array[i];
                    array[i] = array[index];
                    array[index] = min;
                }
            }
        
        }

        return array;
    }
    
}
