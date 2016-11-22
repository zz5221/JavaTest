package ThreadTest;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;

import org.omg.CORBA.PUBLIC_MEMBER;

public class FileTest {
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println(file.getName());
        //获取相对路径可能出错，下文将返回NULL
        System.out.println(file.getParent());
        //获取绝对路径
        System.out.println(file.getAbsolutePath());
        //获取上一级路径
        System.out.println(file.getAbsolutePath());
        //在当前路径下创建一个临时文件
        try {
            File tepFile = File.createTempFile("aaa",".txt",file);
            //JVM退出时删除文件
         //   tepFile.deleteOnExit();
            System.out.println(tepFile.getAbsolutePath());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        File newFile = new File(System.currentTimeMillis()+"time");
        System.out.println(newFile.getAbsolutePath());
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String fileList[] = file.list();
        System.out.println("当前路径下所有文件和路径如下");
        for(String fileName :fileList){
            System.out.println("当前路径下文件"+fileName);
        }
        //listRoot静态方法列出所有磁盘根路径
        File[] roots  = File.listRoots();
        System.out.println("系统所有根路径如下");
        for(File root:roots){
            System.out.println(root);
        }
    }
    public static void test1(){
        File file = new File(".");
      // String [] numList = file.list((dir,name) ->name.endsWith(".java")) || new File(name).isDirectory();
    }
    
}
