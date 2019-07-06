
package fixedpoint;

public class Divide {
public int dividefp(int[]a){
   int b=-1;
   int r=a.length;
    while(b<r-1){
    int m=(b+r)/2;
    if(a[m]==m)
        return m;
    if(a[m]<m)
        b=m;
    else
        r=m;
    
}    
return -1;
}
}

