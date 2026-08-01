package JavaPractice.src.com.safatech.generics;

public class Client {

    static void main() {

        Print<Integer> p = new Print<>();
        p.setValue(10);
        IO.println(p.getPrintValue());

        // non-generic
        NonGenericExtend colorPrint = new NonGenericExtend();
        colorPrint.setValue("Blue");
        IO.println(colorPrint.getPrintValue());

        // Generic
        GenericExtend<Integer> printPrice = new GenericExtend<>();
        printPrice.setValue(20);
        IO.println(printPrice.getPrintValue());

        // Key and value pair
        KeyValuePair<String, Integer> pair = new KeyValuePair<>();
        pair.put("saddam", 123456);
        IO.println(pair.getKey() + " : " + pair.getValue());


        // Upper bound

        UpperBoundNumber<Integer> print = new UpperBoundNumber<>();
        // UpperBoundNumber<String> print1 = new UpperBoundNumber<>(); // Because string is not subclass type of Number

    }
}
