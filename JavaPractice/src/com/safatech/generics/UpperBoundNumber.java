package JavaPractice.src.com.safatech.generics;

//  T can be anything , integer, double but should be subclassed of Number(super class)
public class UpperBoundNumber <T extends Number> {


    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
