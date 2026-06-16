package JavaPractice.src.com.safatech.enumvalue;

public enum EnumSampleInterface implements MyInterface{

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
