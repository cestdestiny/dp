package strategy;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(11), new Cat(23), new Cat(20)};
        Sort.sort(cats,(o1,o2)->{
            if (o1.getAge() > o2.getAge()){
                return 1;
            }else if (o1.getAge() < o2.getAge()){
                return -1;
            }else{
                return 0;
            }
        });
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
    }
}
