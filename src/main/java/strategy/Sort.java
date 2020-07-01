package strategy;

public class Sort {
    public static <T> T[] sort(T[] list, Comparator<T> comparator){
        for (int i = 0; i < list.length; i++) {
            int start = i;
            for (int j = i+1; j < list.length; j++) {
                start = comparator.compare(list[start],list[j]) == 1 ? j : start;
            }
            swap(i, start, list);
        }
        return list;
    }

    public static <T> void swap(int i,int j,T[] list){
        if (i == j){
            return;
        }
        T temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
