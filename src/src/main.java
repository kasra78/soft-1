public class main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        int ctr = 0;
        for (int i = 99999; i >= 0; i--)
            arr[ctr++] = i;
        int temp = 0;

        // bubble sort
        for (int i = 0; i < 100000; i++){
            for (int j = 0; j < 99999 - i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i= 0; i < 99999; i++)
            System.out.println(arr[i]);


    }
}
