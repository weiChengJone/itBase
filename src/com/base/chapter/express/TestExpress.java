package com.base.chapter.express;

/**
 * Created by CC on 2019/7/24.
 */
public class TestExpress {

    /**
     * ���н��
     * name��С��
     if��
     10
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student("1","С��");

        Student s;
        if ((s = student) == null){
            System.out.println("if��");
        }
        if(null != s){
            System.out.println("name��" + s.getName());
        }

        int i = 10;
        int j = 0;
        if ( (j = i) == 10){
            System.out.println("if��");
        }
        System.out.println(j);


    }

    static class Student{
        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
