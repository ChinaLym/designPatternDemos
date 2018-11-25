package com.lym.designPartten.demo.creationType.prototypePattern.prototype;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable,Cloneable {

    private  String cloneName;

    private String cloneClass;


    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //修改可见性修饰符
    @Override
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}