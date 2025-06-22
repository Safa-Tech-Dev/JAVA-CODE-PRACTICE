package JavaPractice.src.com.safatech.comparator;

public class Address implements Comparable<Address>{

    private String streetName;
    private int pinCode;

    public Address(String streetName, int pinCode) {
        this.streetName = streetName;
        this.pinCode = pinCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    @Override
    public int compareTo(Address o) {
        return this.getPinCode() - o.getPinCode();
    }
}
