package com.neuedu.school;
//有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩
public class Student {
    private String sname;
    private String num;
    private double score1;
    private double score2;
    private double score3;

    public String getSname() {
        return sname;
    }

    public String getNum() {
        return num;
    }

    public double getScore1() {
        return score1;
    }

    public double getScore2() {
        return score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }

    @Override
    public String toString() {
        return "姓名为："+getSname()+"学号为"+getNum()+"成绩1为"+getScore1()+"成绩2为"+getScore2()+"成绩3为"+getScore3()+"平均成绩为："+(getScore1()+getScore2()+getScore3()/3);

    }
}
