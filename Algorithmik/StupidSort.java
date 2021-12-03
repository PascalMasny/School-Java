public class StupidSort{

    
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
    
	public static void RandomSort(int[] i) {
		int counter = 0;
		System.out.println("I'll sort " + i.length + " elements...");
		while(!isSorted(i)) {
			shuffle(i);
			counter++;
		}
		System.out.println("Solution found! (shuffled " + counter + " times)");
		System.out.print(i);
	}
    
    //is Sorted Check
	private boolean isSorted(int[] i) {
		for(int x = 0; x < i.length - 1; ++x) {
			if(i[x] > i[x+1]) {
				return false;
			}
		}
		return true;
	}
    
	//Shuffle the array for new sort
	private void shuffle(int[] i) {
		for(int x = 0; x < i.length; ++x) {
			int index1 = (int) (Math.random() * i.length),
				index2 = (int) (Math.random() * i.length);
			int a = i[index1];
			i[index1] = i[index2];
			i[index2] = a;
		}
	}
	
    public static void main(String[] args) {
		int[] i = {1, 5, 2, 8, 5, 2, 4, 2, 6, 7, 66};
		new RandomSort(i);
    	
    }
    
     
}