package JavaPractice.src.com.safatech.enumvalue;

public enum EnumCustomValues {


    MONDAY(101, "1st day of week"),
    TUESDAY(102, "2nd day of week"),
    WEDNESDAY(103, "3rd day of week"),
    THURSDAY(104, "4th day of week"),
    FRIDAY(105, "5th day of week"),
    SATURDAY(106, "6th day of week"),
    SUNDAY(107, "7th day of week");


    private int value;
    private String comment;


    EnumCustomValues(int value, String comment) {

        this.value = value;
        this.comment = comment;
    }

    public int getValue() {
        return value;
    }

    public String getComment() {
        return comment;
    }

    public static EnumCustomValues getEnumFromValue(int value){

        for(EnumCustomValues sample : EnumCustomValues.values()){

            if(sample.value == value){
                return sample;
            }
        }
        return null;
    }
}
