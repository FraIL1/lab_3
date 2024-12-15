package lab3.sort;

public class LabSorter {

    /**
     * Метод для сортировки массива целых чисел.
     *
     * @param source исходный массив для сортировки.
     * @return отсортированный массив
     */
    public int[] sort(int[] source) {
        if (source == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }


        int[] sortedArray = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            sortedArray[i] = source[i];
        }


        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {

                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        return sortedArray;
    }
}