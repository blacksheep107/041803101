import java.util.*;
import java.io.*;
public class read {
    public static String readToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }
    }
    public static double getCos(String s1,String s2){
        //计算两个句子字向量的余弦值
        Map<Character,int[]> ChMap=new HashMap<Character,int[]>();//按键排序
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(String.valueOf(c).matches("[\u4e00-\u9fa5]")){//是汉字
                int[] d=ChMap.get(c);//这个字在两个字符串中出现次数
                if(d!=null){
                    d[0]++;//第一个文本中字出现次数
                }else{//字第一次出现
                    d=new int[2];
                    d[0]=1;
                    d[1]=0;
                    ChMap.put(c,d);
                }
            }
        }//相同方式处理第二个字符串
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            if(String.valueOf(c).matches("[\u4e00-\u9fa5]")){
                int[] d=ChMap.get(c);
                if(d!=null){
                    d[1]++;//第二个文本中字出现次数
                }else{//字第一次出现
                    d=new int[2];
                    d[1]=1;
                    d[0]=0;
                    ChMap.put(c,d);
                }
            }
        }
        //算余弦
        double up=0,down1=0,down2=0;
        for(Map.Entry<Character,int[]>entry:ChMap.entrySet()){
            int[] d=entry.getValue();
            up+=d[0]*d[1];
            down1+=d[0]*d[0];
            down2+=d[1]*d[1];
        }
        down1=Math.sqrt(down1);
        down2=Math.sqrt(down2);
        double down=down1*down2;
        if(down==0||up==0)  return 0;
        return up/down;
    }
    public static void main(String[] args){
        String orig=readToString("orig.txt");
        String paper=readToString("orig_0.8_mix.txt");
        System.out.println(String.format("%.2f",getCos(orig,paper)));
    }
}