import org.junit.Assert;
import static org.junit.Assert.*;
public class mainTest {

    @org.junit.Test
    public void origAndOrig() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig.txt");
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(1.0,sum,0);
    }
    @org.junit.Test
    public void completeDiff(){
        String s1="乘风破浪会有时";
        String s2="直挂云帆济沧海";
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(0,sum,0);
    }
    @org.junit.Test
    public void origAndAdd() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_add.txt");
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(0.8,sum,0.2);
    }
    @org.junit.Test
    public void origAndDel() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_del.txt");
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(0.8,sum,0.2);
    }
    @org.junit.Test
    public void origAndMix() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_mix.txt");
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(0.8,sum,0.2);
    }
    @org.junit.Test
    public void origAndRep() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_rep.txt");
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(0.8,sum,0.2);
    }
    @org.junit.Test
    public void origAndDis1() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_dis_1.txt");
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(0.8,sum,0.2);
    }
    @org.junit.Test
    public void origAndDis3() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_dis_3.txt");
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(0.8,sum,0.2);
    }
    @org.junit.Test
    public void origAndDis7() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_dis_7.txt");
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(0.8,sum,0.2);
    }
    @org.junit.Test
    public void origAndDis10() {
        String s1=readToString.readToString("testfile/orig.txt");
        String s2=readToString.readToString("testfile/orig_0.8_dis_10.txt");
        double sum=getCos.getCos(s1,s2);
        Assert.assertEquals(0.8,sum,0.2);
    }
}