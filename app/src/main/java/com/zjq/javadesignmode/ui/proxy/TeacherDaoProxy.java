package com.zjq.javadesignmode.ui.proxy;

public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target;
    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.target = teacherDao;
    }
    @Override
    public void teach() {
        System.out.println("开始代理......");
        target.teach();
        System.out.println("提交.....");
    }
}
