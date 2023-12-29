package com.zjq.javadesignmode.ui.proto_type.deepen;

import androidx.annotation.NonNull;

public class DeepCloneableTarget implements Cloneable{

    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneableTarget target;
        target = (DeepCloneableTarget) super.clone();
        return target;
    }
}
