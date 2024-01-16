public class ArrayOps {
    public static void main(String[] args) {
    }
    
    public static int findMissingInt (int [] array) {
        boolean missing = false;
       
            for (int j = 0; j <= (array.length + 1); j++) {
                missing = false;
                for (int i = 0; i < array.length; i++) {
                if (j == array [i]) {
                missing = true;
                }
                }
                if (missing == false) {
                    return j;
                   }
            }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int max = array [0];
        int j = 0;
        for (int i = 0; i < array.length; i++ ) {
            if (array[i] > max) {
                max = array [i];
                j=i;
            }
        }
        if (max != array [array.length - 1] ) {
            int temp = array [array.length - 1];
            array [array.length - 1] = array [j];
            array [j] = temp;
        }
        max = array [0];
        for (int x = 0; x < (array.length - 1); x++) {
            if (array[x] > max) {
                max = array [x];
            }
        }
        return max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean same;
        boolean ar1 = false;
        boolean ar2 = false;
        int sum1 = 0;
        int sum2 = 0;
        boolean valueSum1 = false;
        boolean valueSum2 = false;
        for (int i = 0; i < array1.length; i++) {
            valueSum1 = false;
            for (int j = 0; j < array2.length; j++) {
                    if (array1 [i] == array2 [j]) {
                        valueSum1 = true;
                    }
            }
            if (valueSum1 == true) {
                sum1++;
            }
        }

        for (int x = 0; x < array2.length; x++) {
            for (int y = 0; y < array1.length; y++) {
                    if (array2 [x] == array1 [y]) {
                        valueSum2 = true;
                    }
            }
            if (valueSum2 == true) {
                sum2++;
            }
        }

        if (sum1 == array1.length) {
            ar1 = true;
        } if (sum2 == array2.length) {
            ar2 = true;
        }
        if ((ar1) && (ar2)) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSorted(int [] array) {
        boolean sorted = false;
        boolean increase = true;
        boolean decrease = true;
        for (int i = 0; i < (array.length - 1); i++ ) {
            if (array [i] < array [i+1]) {
                increase = false;
            }
        }
        for (int x = 0; x < (array.length - 1); x++ ) {
            if (array [x] > array [x+1]) {
                decrease = false;
            }
        }
        if ((increase) || (decrease)) {
            sorted = true;
        }

        return sorted;
    }

}
