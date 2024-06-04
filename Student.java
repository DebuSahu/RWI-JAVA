package com.spring;

public class Student {
    private String name;
    private int id;
    private int m1;
    private int m2;
    private int m3;




    public Student(){
        super();
    }
    public Student(String name,int id, int m1,int m2,int m3){
        super();
        this.name=name;
        this.id=id;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }
    public int getM3() {
        return m3;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public void print(){
        System.out.println("Student name = "+ name +"\n"+"Student ID = "+ id+"\n"+"English = "+ m1 + "\n"+"Maths = "+m2+"\n"+"Science = "+m3);
        int sum= m1+m2+m3;
        System.out.println("Total Marks Obtained out of 300 = " + sum);
        double average = sum/3;
        if(average>=80){
            System.out.println("Grade A");
        }else if(average<80&&average>=60){
            System.out.println("Grade B");
        }else if(average<60&&average>=50){
            System.out.println("Grade C");
        }else if (average<50&&average>=40){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }

    }
}
