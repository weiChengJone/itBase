package com.base.design.composite;

public interface Component {

	//这个是容器类的抽象类，定义好行为，定义创建移除子容器的方法抽象的。
    public  void addComposite(Component c); //添加成员
    public  void removeComposite(Component c);//移除成员
    public  Component getComposite(int i);//获取子容器
    public  void operation(int i);//业务方法
}
