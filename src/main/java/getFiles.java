import java.io.File;
import java.util.ArrayList;
import java.util.List;
//多文件读取
public class getFiles {
    public static List<File> getFiles(String path){
        File root = new File(path);
        List<File> files = new ArrayList<File>();
        if(!root.isDirectory()){
            files.add(root);
        }else{
            File[] subFiles = root.listFiles();
            for(File f : subFiles){
                files.addAll(getFiles(f.getAbsolutePath()));
            }
        }
        return files;
    }
}
