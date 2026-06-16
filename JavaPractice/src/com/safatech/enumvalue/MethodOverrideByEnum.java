package JavaPractice.src.com.safatech.enumvalue;

public enum MethodOverrideByEnum {

    MONDAY{
        @Override
        public void dummyMethod() {
            IO.println("Monday method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod(){

        IO.println("default dummy method ");
    }
}
