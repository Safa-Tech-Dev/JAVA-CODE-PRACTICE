package JavaPractice.src.com.safatech;

class Generic<T>{

    private T obj;

    public Generic(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }
}
public class Test{

    public static void main(String[] args) {

        Generic<String> a1 = new Generic<>("Saddam");
        System.out.println(a1.getObj());
        Generic<Integer> a2 = new Generic<>(10);
        System.out.println(a2.getObj());
    }
}
