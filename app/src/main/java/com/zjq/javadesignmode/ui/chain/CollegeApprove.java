package com.zjq.javadesignmode.ui.chain;

public class CollegeApprove extends Approve {

    public CollegeApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println("请求编号id=" + purchaseRequest.getId() + "被" + this.name + "处理");
        } else {
            nextApprove.processRequest(purchaseRequest);
        }
    }
}
