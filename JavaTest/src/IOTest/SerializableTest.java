package IOTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
    public static void main(String[] args) {
        ObjectSerializableWriteTest();
//        ObjectSerializableReadTest();
    }
    public static void ObjectSerializableWriteTest() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/home/hanshizhe/workspace/JavaTest/src/ThreadTest/person.txt"));
            Person person = new Person("猪八戒",5);
            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    public static void ObjectSerializableReadTest(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/home/hanshizhe/workspace/JavaTest/src/ThreadTest/person.txt"));
            Person person = (Person)objectInputStream.readObject();
            System.out.println(person.getName());
            System.out.println(person.getAge());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
