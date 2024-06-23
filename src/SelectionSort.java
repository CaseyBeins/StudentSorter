import java.util.List;
import java.util.Comparator;
// selection sort method
public class SelectionSort {
    public static <T> void selectionSort(List<T> list, Comparator<? super T> comparator) {
        //iterate through list
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i; // assume current index is smallest*****
            // Check the rest of the list for a smaller element
            for (int j = i + 1; j < list.size(); j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;// Found a smaller element, update minIndex
                }
            }
            // Swap the smallest element found with the current element
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}