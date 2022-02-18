public class Linear_Search {
    public static void main(String[] args) {
        
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int to_search = 7;

        int array_pos = linear_Search(array, to_search);
        System.out.println("The position of the element is: " + array_pos);

    }

    public static int linear_Search(int[] array, int search){

        boolean found = false;
        int i = 0;

        while(i < array.length && found == false){
            if(array[i] == search){
                found = true;
            }

            else{
                i++;
            }
        }

        return i;
    }

}