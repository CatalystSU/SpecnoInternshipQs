
public class aveArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(ave(arr));
    }

    static int ave(int arr[]) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        temp = count / arr.length;
        return temp;
    }
}
