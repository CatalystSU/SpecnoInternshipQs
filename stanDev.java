import java.lang.Math;

public class stanDev {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(stanDev(arr));
    }

    static double ave(int arr[]) {
        double temp = 0;
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        temp = count / arr.length;
        return temp;
    }

    static double diffMean(Double mean, int value) {
        if (mean == value) {
            return 0;
        } else if (mean > value) {
            return -(mean-value);
        } else if (mean < value ) {
            return mean - value;
        }
        return 0;
    }

    static double stanDev(int arr[]) {
        double mean = ave(arr);
        double count = 0;
        double temp = 0;
        for (int i = 0; i < arr.length; i++) {
            count += (diffMean(mean, arr[i])) * (diffMean(mean, arr[i]));
        }
        temp = count / arr.length;
        double stan = Math.sqrt(temp);
        return stan;
    }
}
