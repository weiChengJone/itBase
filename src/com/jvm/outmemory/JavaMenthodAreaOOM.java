package com.jvm.outmemory;

import java.lang.reflect.Method;

/**
 * Created by CC on 2019/7/18.
 * ��������� -XX:PermSize=10M -XX:MaxPerSize=10M
 * ����ȥ�ڴ�����쳣 ģ��ʹ��CGlib�ֽ��뼼��
 */
public class JavaMenthodAreaOOM {

    /**
     * ���н�������� --��ignoring option PermSize=10M; support was removed in 8.0
     * ������ʹ�õ���1.8
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
