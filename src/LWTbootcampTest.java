import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LWTbootcampTest {
    @Test
    public void helloTest(){
        assertEquals("Hello world", LWTbootcamp.Hello());
    }

    @Test
    public void helloNameTest(){
        String name = "Radu";
        assertEquals("Hi, Radu. How are you?", LWTbootcamp.helloName(name));
    }

    @Test
    public void sumTest(){
        assertEquals(15, LWTbootcamp.sumN(5));
    }

    @Test
    public void multTest(){
        assertEquals(120, LWTbootcamp.mult(5));
    }

    @Test
    public void multorsumTest(){
        boolean isSum = true;
        assertEquals(15, LWTbootcamp.sumOrMult(isSum, 5));
        isSum = false;
        assertEquals(120, LWTbootcamp.sumOrMult(isSum, 5));
    }

    @Test
    public void forloopTest(){
        int[] a = {1,2,3,4,5};
        assertEquals(15, LWTbootcamp.forloop(a));
    }

    @Test
    public void whileTest(){
        int[] a = {1,2,3,4,5};
        assertEquals(15, LWTbootcamp.whileloop(a));
    }

    @Test
    public void recurTest(){
        int[] a = {1,2,3,4,5};
        int end = a.length-1;
        assertEquals(15, LWTbootcamp.recur(a,end));
    }

    @Test
    public void rotateTest(){
        int[] a = {1,2,3,4,5,6};
        int[] res = {3,4,5,6,1,2};
        assertEquals(Arrays.toString(res), Arrays.toString(LWTbootcamp.rotate(a, 2)));
    }

    @Test
    public void rotateTest2(){
        int[] a = {1,2,3,4,5,6};
        int[] res = {2,3,4,5,6,1};
        assertEquals(Arrays.toString(res), Arrays.toString(LWTbootcamp.rotate(a, 7)));
    }

    @Test
    public void rotateTest3(){
        int[] a = {1,2,3,4,5,6};
        int[] res = {3,4,5,6,1,2};
        assertEquals(Arrays.toString(res), Arrays.toString(LWTbootcamp.rotate(a, -4)));
    }

    @Test
    public void mergeTest(){
        int[] a = {1,4,6};
        int[] b = {2,3,5};
        int[] res = {1,2,3,4,5,6};
        assertEquals(Arrays.toString(res), Arrays.toString(LWTbootcamp.merge(a, b)));
    }

    @Test
    public void mergeTest2(){
        int[] a = {1,4,6,7};
        int[] b = {2,3,5};
        int[] res = {1,2,3,4,5,6,7};
        assertEquals(Arrays.toString(res), Arrays.toString(LWTbootcamp.merge(a, b)));
    }

    @Test
    public void mergeTest3(){
        int[] a = {1,4,6};
        int[] b = {2,3,5,7,8};
        int[] res = {1,2,3,4,5,6,7,8};
        assertEquals(Arrays.toString(res), Arrays.toString(LWTbootcamp.merge(a, b)));
    }
}
