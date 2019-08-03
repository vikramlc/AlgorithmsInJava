public class Main {

    public static void main(String[] args) {
        int[] a = {
                5, 2, 4, 6, 1, 3
        };

        sort(a);

        for (int index : a) {
            System.out.print(index + " ");
        }
    }


    public static void sort(int[] a) {

        int temp = 0;
        int index = 0;

        for (int i = 1; i < a.length; i++) {

            int key = a[i];
            index = i;

            for (int j = i - 1; j >= 0; j--) {

                if (a[j] > a[index]) {

                    // Swap elements whem the below condition satisfies
                    temp = a[index];
                    a[index] = a[j];
                    a[j] = temp;

                    //Decrement the index once the elements have been swapped
                    index--;
                }

            }
        }
    }
}
