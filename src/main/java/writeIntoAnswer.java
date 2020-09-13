import java.io.*;
//写入ans文件
public class writeIntoAnswer {
    public static void writeIntoAnswer(double sum,String anstext){//
        String ans=String.format("%.2f",sum);
        File f=new File(anstext);
        try{
            if(!f.exists()){
                f.createNewFile();
            }
            FileWriter fw=new FileWriter(f);
            fw.write("");
            fw.flush();
            fw.write(String.valueOf(ans));
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
