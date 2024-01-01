package com.zjq.javadesignmode.ui.birdge;

public class Client {
    public static void main(String[] args) {
        FoldedPhone vivoFoldedPhone = new FoldedPhone(new ViVo());
        vivoFoldedPhone.open();
        vivoFoldedPhone.close();
        vivoFoldedPhone.call();
        FoldedPhone huaWeiFoldedPhone = new FoldedPhone(new HuaWeiMi());
        huaWeiFoldedPhone.open();
        huaWeiFoldedPhone.close();
        huaWeiFoldedPhone.call();

        StraightPhone vivoStraightPhone = new StraightPhone(new ViVo());
        vivoStraightPhone.open();
        vivoFoldedPhone.close();
        vivoFoldedPhone.call();
    }
}
