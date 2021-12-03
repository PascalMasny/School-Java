public class InsertionSort{
    public static void main(String[] args) {

    	//Get Data
    	int[] array = getData();
    	//Print Data
    	System.out.println(output(array));
    	//Selection Sort the Data
    	insertionsort(array);
    	
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
    
    //InsertionSort
    public static void insertionsort(int[]array) {

    	for(int i = 2; i < array.length; i++) {
    		
    		int sort_in = array[i];
    		int j = i;
    		
    		while((j > 1) && (array[j - 1] > sort_in)) {
    			
    			array[j] = array[j - 1];
    			j = j - 1;
    			
    		}
    		
    		array[j] = sort_in;
    	}
    	
    	System.out.println(output(array));	
    	
    }
     
}