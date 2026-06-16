package JavaPractice.src.com.safatech.enumvalue;

public class Client {

    static void main() {

        // Usage of values() and ordinal()
        /**
         * values() → Returns an array of all enum constants in declaration order.
         *
         * ordinal() → Returns the zero-based position of an enum constant.
         */
        for(EnumSample sample : EnumSample.values()){

            IO.println(sample.ordinal());
        }

        // usage of valueOf() and name()

        /**
         * valueOf(String name) → Converts a string to the corresponding enum constant (exact match required)
         *
         * name() → Returns the exact name of the enum constant as declared.
         */

        EnumSample enumSample = EnumSample.valueOf("FRIDAY");
        IO.println(enumSample.name());

        // custom value - test

        EnumCustomValues customValues = EnumCustomValues.getEnumFromValue(107);
        IO.println(customValues.getComment());

        // Method Override enum
        MethodOverrideByEnum overrideByEnumFriday = MethodOverrideByEnum.FRIDAY;
        overrideByEnumFriday.dummyMethod();

        MethodOverrideByEnum methodOverrideByEnumMonday = MethodOverrideByEnum.MONDAY;
        methodOverrideByEnumMonday.dummyMethod();

        // enum with abstract method
        EnumWithAbstractMethod withAbstractMethod = EnumWithAbstractMethod.MONDAY;
        withAbstractMethod.dummyMethod();

        // enum implements interface
        EnumSampleInterface mondayEnum = EnumSampleInterface.MONDAY;

        IO.println(mondayEnum.toLowerCase());
    }
}
