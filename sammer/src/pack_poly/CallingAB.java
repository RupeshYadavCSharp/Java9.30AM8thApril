package pack_poly;

public class CallingAB {
    public static void main(String[] args) {
        B objb=new B();
        objb.show();

        A objA = objb;// memory allocation in calling parent overriding
        objA.show();

    }
}
