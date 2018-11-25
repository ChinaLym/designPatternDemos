package com.lym.designPartten.demo.creationType.prototypePattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class DeepPrototype implements Serializable,Cloneable {

    public String name ;

    public  DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype(){

    }
    //方式1 ：通过重写clone方法来实现深拷贝  （引用对象多，这种方法比较繁琐）,并修改可见性修饰符
    @Override
	public Object clone() throws CloneNotSupportedException {
        Object deep = null;
        try {
            deep = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        DeepPrototype  deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepPrototype.deepCloneableTarget.clone();
        return deepPrototype;
    }

    //方式2： 通过对象序列化实现深拷贝 （推荐）
    public Object deepClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
             bos = new ByteArrayOutputStream();
             oos = new ObjectOutputStream(bos);
             oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return  ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(oos !=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos !=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //输入流关闭省略
        }
        return null;
    }
}