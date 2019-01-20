package kaifazhidao.ch03;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadStudent {
    public static void main(String[] args){
        try{
            File file = new File("E:/javaTest/object.txt");
            FileInputStream in = new FileInputStream(file);
            ObjectInputStream obj = new ObjectInputStream(in);
            Student student = (Student) obj.readObject();
            System.out.println(student.getId());
            System.out.println(student.getName());
            obj.close();
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
