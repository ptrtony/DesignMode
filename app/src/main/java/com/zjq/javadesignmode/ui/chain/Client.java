package com.zjq.javadesignmode.ui.chain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        //创建相关的审批人
        DepartmentApprove departmentApprove = new DepartmentApprove("张主任");
        CollegeApprove collegeApprove = new CollegeApprove("李院长");
        ViceSchoolMasterApprove viceSchoolMasterApprove = new ViceSchoolMasterApprove("李副校长");
        SchoolMasterApprove schoolMasterApprove = new SchoolMasterApprove("甘校长");

        departmentApprove.setNextApprove(collegeApprove);
        collegeApprove.setNextApprove(viceSchoolMasterApprove);
        viceSchoolMasterApprove.setNextApprove(schoolMasterApprove);
        departmentApprove.processRequest(purchaseRequest);
    }
}
