package com.zjq.javadesignmode.ui.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        /**
         * @RecentlyNullable ClassLoader loader:指定当前目标对象的类加载器，获取加载器的方法固定
         * @RecentlyNonNull Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方法确认类型
         * @RecentlyNonNull InvocationHandler：事情处理，执行目标对象的方法时，会触发处理器方法，
         * 会把当前执行的目标对象作为参数传递
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("JDK 反射开始 。。。");
                Object resultVal = method.invoke(target, objects);
                return resultVal;
            }
        });
    }
}
