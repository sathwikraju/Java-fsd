package innerclasses;

public class InnerClassAssisted1 {



    public class Inner {
        public void hello() {
            System.out.println("Hello from Inner class");
        }
    }

    public static void main(String[] args) {
        InnerClassAssisted1 obj = new InnerClassAssisted1();
        InnerClassAssisted1.Inner in = obj.new Inner();
        in.hello();
    }
}
