package sorter;

public class QuickSorter implements Sorter {
    public int[] sort(int[] values) {
        // quicksort implementation
        return values;
    }

    public int partition(int[] values, int low, int high) {
            int pivo = values[low];
            int i = low + 1;
    
            for (int j = low + 1; j < high; j++) {
                if (values[j] <= pivo) {
                    i +=1;
                    troca(values, i, j);
                }     
            }
            troca(values, low, i);
            return i;
        }
    
        private void troca(int[] values, int i, int j) {
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
        }
        return 0;
    }
    

