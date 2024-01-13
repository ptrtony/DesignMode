package com.zjq.javadesignmode.ui.chain;

public class DepartmentApprove extends Approve {

    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println("请求编号id=" + purchaseRequest.getId() + "被" + this.name + "处理");
        } else {
            nextApprove.processRequest(purchaseRequest);
        }
    }
}
