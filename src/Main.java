public class Main {

    private static void bubbleSort(int[] listToSort) {
        for(int i=0; i<listToSort.length - 1; i++) {
            boolean swapped = false;
            for(int j=0; j<listToSort.length - i - 1; j++) {
                if(listToSort[j] > listToSort[j+1]) {
                    swap(listToSort, j, j+1);
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }

        for (int num: listToSort) {
            System.out.print(num + " ");
        }
    }

    private static void swap(int[] listToSort, int i, int j) {
        int temp = listToSort[i];
        listToSort[i] = listToSort[j];
        listToSort[j] = temp;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 2, 1, 3, 10, 8, 7, 9};
        bubbleSort(nums);
    }
}
