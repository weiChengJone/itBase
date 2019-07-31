package com.jvm.outmemory;

import java.lang.reflect.Method;

/**
 * Created by CC on 2019/7/18.
 * 虚拟机参数 -XX:PermSize=10M -XX:MaxPerSize=10M
 * 方法去内存溢出异常 模拟使用CGlib字节码技术
 */
public class JavaMenthodAreaOOM {

    /**
     * 运行结果不如意 --》ignoring option PermSize=10M; support was removed in 8.0
     * 由于我使用的是1.8
     * @param args
     */
    public static void main(String[] args) {
        /*Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OOMObject.class);
        enhancer.setUseCache(false);
        enhancer.setCallback(new MethodInterceptor(){
            @Override
            public Object intercept(Object o, Method method, Object[] objects,
                                    MethodProxy methodProxy) throws Throwable {
                return methodProxy.invokeSuper(o,objects);
            }
        });

        enhancer.create();*/
    }

    static class OOMObject{

    }
}
