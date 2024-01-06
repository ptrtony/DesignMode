package com.zjq.javadesignmode.ui.template;


//make\select\add\soak\beat
//配料不同 可以把add作为抽象方法实现
//抽象类、表示豆浆
public abstract class SoyaMilk {
    //模版方法，make，模版方法可以作为final，不让子类去覆盖
    final void make() {
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }
    final void select() {
        System.out.println("第一步：选择好的新鲜黄豆 ");
    }
    abstract void addCondiments();
    final void soak() {
        System.out.println("第三步：黄豆和配料开始浸泡，需要3个小时 ");
    }
    final void beat() {
        System.out.println("第四步： 黄豆和配料放入到豆浆机打碎");
    }

    public boolean customerWantCondiments() {
        return true;
    }
}
