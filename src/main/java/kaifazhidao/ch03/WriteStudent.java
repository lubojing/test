package kaifazhidao.ch03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteStudent {
    public static void main(String[] args){
        try{
            Student student = new Student();
            student.setId(1);
            student.setName("小强");
            File file = new File("E:/javaTest/object.txt");
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(student);
            System.out.println("对象保存成功！！！");
            obj.close();
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
