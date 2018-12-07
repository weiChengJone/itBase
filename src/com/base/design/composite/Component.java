package com.base.design.composite;

public interface Component {

	//�����������ĳ����࣬�������Ϊ�����崴���Ƴ��������ķ�������ġ�
    public  void addComposite(Component c); //��ӳ�Ա
    public  void removeComposite(Component c);//�Ƴ���Ա
    public  Component getComposite(int i);//��ȡ������
    public  void operation(int i);//ҵ�񷽷�
}
