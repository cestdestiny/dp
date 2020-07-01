package strategy;

public class Cat {
    private Integer age;

    public Cat(Integer age){
        this.age = age;
    }

    public Integer getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
