import java.util.Arrays;

public class LWTbootcamp {

    public static void main(String[] args){

    }

    public static String Hello(){
        return "Hello world";
    }

    public static String helloName(String name){
        return "Hi, "+ name + ". How are you?";
    }

    public static int sumN(int n){
        if(n == 0) return 0;
        else return n+sumN(n-1);
    }

    public static int mult(int n){
        if(n==0) return 1;
        else return n*mult(n-1);
    }

    public static int sumOrMult(boolean x, int n){
        if(x==true) return sumN(n);
        else return mult(n);
    }

    public static int forloop(int[] a){
        int sum =0;
        for(int i = 0; i<a.length; i++) sum += a[i];
        return sum;
    }

    public static int whileloop(int[] a){
        int sum = 0;
        int i = 0;
        while(i < a.length){ sum+= a[i]; i++;}
        return sum;
    }

    public static int recur(int[] a, int n){
        if(n < 0) return 0;
        else return a[n]+recur(a,n-1);
    }

    public static int[] rotate(int[] a, int i){
        if(i==0)
            return a;
        if(i<0) {
            int rem = Math.abs(i)%a.length;
            i = a.length - rem;
        }
        if(i>a.length){
            i=i%a.length;
        }
        int[] temp = new int[i];
        for(int z = 0; z< i; z++){
            temp[z]=a[z];
        }
        int index = 0;
        for(int z = i; z<a.length; z++){
            a[index]=a[z];
            index++;
        }
        int tempi = 0;
        for(int z = a.length-i; z<a.length; z++){
            a[z]= temp[tempi];
            tempi++;
        }
        return a;
    }

    public static int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int aindx = 0, bindx = 0, resindx = 0;
        while (aindx < a.length && bindx < b.length) {
            result[resindx++] = a[aindx] < b[bindx] ? a[aindx++] : b[bindx++];
        }
        while (bindx < b.length) {
            result[resindx++] = b[bindx++];
        }
        while (aindx < a.length) {
            result[resindx++] = a[aindx++];
        }
        return result;
    }

}

