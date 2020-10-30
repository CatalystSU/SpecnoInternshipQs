
//xbonacci {1,1,1,1} 10 = {1,1,1,1,4,7,13,25,49,94}
//xbonacci {0,0,0,0,1} 10 = {0,0,0,0,1,1,2,4,8,16}
//xbonacci {1,0,0,0,0,0,1} 10 = {1,0,0,0,0,0,1,2,3,6}
//xbonacci {1,1} produces the Fibonacci sequence
public class XFib {
    public static void main(String[] args) {
        int arr1[] = {1,1,1,1}; // 4
        int arr2[] = {0,0,0,0,1}; // 5
        int arr3[] = {1,0,0,0,0,0,1};
        int arr4[] = {1,1};

        int n = Integer.parseInt(args[0]);


        int temp1[] = xFibbo(arr1, n);
        for (int i = 0; i < temp1.length; i++) {
            System.out.println("Index: "+i+" Value: "+ temp1[i]);
        }

        int temp2[] = xFibbo(arr2, n);
        for (int i = 0; i < temp2.length; i++) {
            System.out.println("Index: "+i+" Value: "+ temp2[i]);
        }

        int temp3[] = xFibbo(arr3, n);
        for (int i = 0; i < temp3.length; i++) {
            System.out.println("Index: "+i+" Value: "+ temp3[i]);
        }

        int temp4[] = xFibbo(arr4, n);
        for (int i = 0; i < temp4.length; i++) {
            System.out.println("Index: "+i+" Value: "+ temp4[i]);
        }
    }

    static int[] xFibbo(int arr[], int n) {
        int seq[] = new int[n];
        int size = arr.length;
        System.out.println(size);

        // fill seq
        for (int i = 0; i < size; i++) {
            seq[i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (i+size < n) {
                int count = 0;
                //seq[i+size] = 1;
                for (int j = i; j < i+size; j++) {
                    count += seq[j];
                }
                seq[i+size] = count;
            }
        }

        return seq;
    }
}
