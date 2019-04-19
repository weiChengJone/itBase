package com.base.common.bigdecimal;

import java.math.BigDecimal;

public class UserBigDecimal {

	public static void main(String[] args) {
		
		demo();
	}
	
	/**
	 * ������ô���String�Ĺ��췽����
	 */
	static void demo(){
		BigDecimal num1 = new BigDecimal(0.005);
        BigDecimal num2 = new BigDecimal(1000000);
        BigDecimal num3 = new BigDecimal(-1000000);

        //�������ַ�������ʽ��ʼ��(����dubbo�Ȼ�ʹ�����׼ȷ)
        BigDecimal num12 = new BigDecimal("0.005");
        BigDecimal num22 = new BigDecimal("1000000");
        BigDecimal num32 = new BigDecimal("-1000000");
        
        BigDecimal result_1 = num1.setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal result_12 = num12.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("��������1��" + result_1);
        System.out.println("��������12��" + result_12);


        BigDecimal result1 = num1.add(num2);
        BigDecimal result12 = num12.add(num22);
        
        //����(8������ģʽ)
        BigDecimal result2 = num1.subtract(num2);
        BigDecimal result22 = num12.subtract(num22);
        
        //�˷�
        BigDecimal result3 = num1.multiply(num2);
        BigDecimal result32 = num12.multiply(num22);

        //����ֵ
        BigDecimal result4 = num3.abs();
        BigDecimal result42 = num32.abs();
        
        //����
        BigDecimal result5 = num2.divide(num1,20,BigDecimal.ROUND_HALF_UP);
        BigDecimal result52 = num22.divide(num12,20,BigDecimal.ROUND_HALF_UP);

        BigDecimal result53 = num22.divide(num12,2,BigDecimal.ROUND_HALF_UP);

        System.out.println("add value:" + result1);
        System.out.println("add value to String:" + result1.toString());
        System.out.println("add String:" + result12);
        
        System.out.println("subtract value:" + result2);
        System.out.println("subtract String:" + result22);
        
        System.out.println("multiply value:" + result3);
        System.out.println("multiply String:" + result32);

        
        System.out.println("divide value:" + result5);
        System.out.println("divide String:" + result52);
        System.out.println("divide String ��������:" + result53);

        System.out.println("----------------------");
        BigDecimal anum1 = new BigDecimal("102");
        BigDecimal anum2 = new BigDecimal("0.8");
        BigDecimal anum3 = new BigDecimal("100");
        BigDecimal aresult22=  anum1.multiply(anum2).divide(anum3);
        System.out.println(aresult22.setScale(0, BigDecimal.ROUND_DOWN).toString());
	}
}
