package com.base.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class CloneUtils {

	/***
	 * ����һ�Լ��Ͻ������ ע����Ҫ�Է�����������л�(ʵ��Serializable)
	 * 
	 * @param srcList
	 * @param <T> implements serializable
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> depCopy(List<T> srcList) {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		try {
			ObjectOutputStream out = new ObjectOutputStream(byteOut);
			out.writeObject(srcList);
 
			ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
			ObjectInputStream inStream = new ObjectInputStream(byteIn);
			List<T> destList = (List<T>) inStream.readObject();
			return destList;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/***
	 * 
	 * 
	 * @param 
	 * @param 
	 * @return
	 */
	public static Object depCopy(Object object) {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		try {
			ObjectOutputStream out = new ObjectOutputStream(byteOut);
			out.writeObject(object);
 
			ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
			ObjectInputStream inStream = new ObjectInputStream(byteIn);
			
			return inStream.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
