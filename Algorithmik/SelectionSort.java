public class SelectionSort{
    public static void main(String[] args) {

    	//Get Data
    	int[] array = getData();
    	//Print Data
    	System.out.println(output(array));
    	//Selection Sort the Data
    	selectionsort(array);
    	
    }
    
    //Get the Array Data
    public static int[] getData() {
    	int[] array = {1, 2, 42, 50, 3, 40, 2, 22};
    	return array;
    }
    
    //Print the Array 
    public static String output(int[]parray) {
    	String out = "";
    	for (int i: parray) {
    		out = out + i + " ";
    	}   	
    	return out;
    }
    
    //SelectionSort
    public static void selectionsort(int[]array) {

    	for(int i = 0; i < array.length; i++) {
    		
    		int min = i;
    		
    		for(int j = 0; j < i + 1; j++) {
    			
    			if(array[j] < array[min]) {
    				
    				min = j;
    			}
    				
    		}
    		
			int tmp = array[min];
			array[min] = array[i];
			array[i] = tmp;
    	}
    	
    	
    	System.out.println(output(array));	
    	
    }
     
}