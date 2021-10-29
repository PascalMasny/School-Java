public class BubbleSort {
    public static void main(String[] args) {

    	//Get Data
    	int[] array = getData();
    	//Print Data
    	System.out.println(output(array));
    	//Bubble Sort the Data
    	bubblesort(array);
    	
    }
    
    //Get the Array Dat
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
    
    //Bubble Sort
    public static void bubblesort(int[]array) {
    	for (int i = array.length; i >= 0; i--) {
    		
    		boolean swap = false;
    		
    		for (int j = 0; j < i -1 ; j++) {
    			if (array[j] > array[j + 1]) {
    				int tmp = array[j];
    				array[j] = array[j + 1];
    				array[j + 1] = tmp;
    				
    				swap = true;
    			}
    			
    			
    		}
    		if (swap == false) {
				break;
			}
    		
    	}
    	System.out.println(output(array));	
    	
    }
     
}