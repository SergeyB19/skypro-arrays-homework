public class Main {
    public static void main(String[] args) {
        // Задание №1.1
        int [] arr = new int [3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // Задание №1.2
        double [] arr2 = {1.57, 7.654, 9.986};
        // Задание №1.3

        // Задание №2
        int [] ar = new int [3];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        for (int i = 0; i < ar.length; i++) {
                System.out.println(ar[i]);
            }
        // Задание №3
        for (int i = 0; i < ar.length ; i++) {
            System.out.println(ar[i] + ", ");
        }
        // Задание №4
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] %2 != 0) {
                System.out.print(ar[i] + 1);
                if (i < ar.length - 1) {
                    System.out.println(", ");
                }
            }
            
        }
        }
    }
