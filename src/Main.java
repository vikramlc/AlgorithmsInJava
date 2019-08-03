public class Main {

    public static void main(String[] args) {
        int[] a = {
                5, 2, 4, 6, 1, 3
        };

        int[] b = {
                7, 10, 8, 9, 1, 4
        };

        addBinary(a, b);

    }


    public static void addBinary(int[] a, int[] b) {

        Integer[] c = new Integer[a.length];

        for(int i=0; i<a.length; i++) {
            c[i] = Integer.valueOf(a[i]+b[i]);
        }

        for(Integer value: c) {
            System.out.print(Integer.toBinaryString(value) + " ");
        }

    }
}

