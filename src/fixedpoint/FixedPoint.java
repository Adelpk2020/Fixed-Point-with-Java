
package fixedpoint;

public class FixedPoint {

    public static void main(String[] args) {
        int[]arr={4,5,6,2,4,6,9};
        Linear l = new Linear();
        l.linearfp(arr);
        System.out.println("//////////////////////");
        Divide dv = new Divide();
        int f=dv.dividefp(arr);
        System.out.println("There is a fixed point"+f);
        System.out.println("//////////////////////");
        Recursion rc=new Recursion();
       int f2= rc.recursionfp(arr);
        System.out.println("There is a fixed point"+f2);
    }
    
}
