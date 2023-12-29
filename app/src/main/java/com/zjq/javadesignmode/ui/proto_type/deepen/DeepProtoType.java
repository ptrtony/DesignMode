package com.zjq.javadesignmode.ui.proto_type.deepen;

import androidx.annotation.NonNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    //深拷贝方式1
    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();
        //对引用类型进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deep;
    }

    //深拷贝方式二
    public Object deepClone() {
        Object obj = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            obj = ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return obj;
    }
}
