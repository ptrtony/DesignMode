package com.zjq.javadesignmode.ui.dependence_inversion_principle;

public class DependencyInversion1 {
    public static void main(String[] args) {

    }
}

//interface IOpenAndClose {
//    void open(ITV tv);
//}
//
//class OpenAndClose implements IOpenAndClose {
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}
//
interface ITV {
    void play();
}

//interface IOpenAndClose {
//    void setTv(ITV tv);
//    void open(ITV tv);
//}
//
//class OpenAndClose implements IOpenAndClose {
//
//    private ITV tv;
//    @Override
//    public void setTv(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}