public class RemoveDuplicateEle {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2,3,3, 5};
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++)        	//1,1,2,4,4,5 {
        {
            if (arr[i] != arr[i + 1]) {//3!=5
                temp[j] = arr[i];//1,2,3
                j++;
            }
        }

        // Add the last element to the temporary array
        temp[j++] = arr[arr.length - 1];

        // Print the result
        for (int i = 0; i < j; i++) {
            System.out.println(temp[i]);
        }
    }
}

