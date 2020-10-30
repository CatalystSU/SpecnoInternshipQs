
public class FizzBuzz {
    public static void main(String[] args) {
        String arr[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index: "+i+" Value: "+ arr[i]);
        }
    }

    static String[] compute(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            //count += arr[i];
            int val = Integer.parseInt(arr[i]);
            if (val % 3 == 0) {
                arr[i] = "Fizz";
            } else if (val % 5 == 0) {
                arr[i] = "Buzz";
            }

            if (val % 5 == 0 && val % 3 == 0) {
                arr[i] = "FizzBuzz";
            }
        }
        return arr;
    }
}
