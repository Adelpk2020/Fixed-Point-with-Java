
package fixedpoint;

public class Recursion {
    public int recursionfp(int[]a){
        return search(a,-1,a.length);
    }
    private static int search(int[]a,int x,int y){
    if(x>=y-1)
        return -1;
    int m=(x+y)/2;
    if(a[m]==m)
        return m;
    if(a[m]>m)
        return search(a,x,m);
    else
        return search(a,m,y);
    }
}
