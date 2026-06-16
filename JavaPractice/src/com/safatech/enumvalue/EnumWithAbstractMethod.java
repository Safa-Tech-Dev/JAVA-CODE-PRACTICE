package JavaPractice.src.com.safatech.enumvalue;

public enum EnumWithAbstractMethod {

    MONDAY {
        @Override
        public void dummyMethod() {
            IO.println("In Monday");
        }
    },
    TUESDAY {
        @Override
        public void dummyMethod() {
            IO.println("In Tuesday");
        }
    },
    SUNDAY {
        @Override
        public void dummyMethod() {
            IO.println("In Sunday");
        }
    };

    public abstract void dummyMethod();

}
