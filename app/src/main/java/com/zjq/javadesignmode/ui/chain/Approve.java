package com.zjq.javadesignmode.ui.chain;

public abstract class Approve {
    Approve nextApprove;
    String name;

    public Approve(String name) {
        this.name = name;
    }

    public void setNextApprove(Approve nextApprove) {
        this.nextApprove = nextApprove;
    }

    //处理审批请求的方法，得到一个请求，处理一个子类，因此该方法做成抽象
    public abstract void processRequest(PurchaseRequest purchaseRequest);

}
