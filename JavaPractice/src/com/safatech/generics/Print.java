package JavaPractice.src.com.safatech.generics;

public class Print<T> {

    T value;

    public T getPrintValue(){

        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
