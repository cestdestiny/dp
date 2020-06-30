package strategy;

public class Sort {
    public static <T> T[] sort(T[] list, Comparator<T> comparator){
        for (int i = 0; i < list.length; i++) {
            T start = list[i];
            for (int j = i+1; j < list.length; j++) {
                start = comparator.compare(start,list[j]) == 1 ? list[j] : start;
            }
            swap(list[i], start);
        }
        return list;
    }

    public static <T> void swap(T o1,T o2){
        T temp = o1;
        o1 = o2;
        o2 = temp;
    }
}
