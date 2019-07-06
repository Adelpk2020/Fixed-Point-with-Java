
package fixedpoint;

public class Linear {
    public int linearfp(int[]a){
        for (int i = 0; i <a.length; i++) {
            if(a[i]==i)
                System.out.println("There is a fixed point "+i);
        }
    
        return 0;
}
}
