package demo1;
import java.util.*;
import java.io.*;
import java.lang.*;
class people
{
	int age;
	people(int i)
	{
		this.age = i;
	}
	void query_age()
	{
		System.out.println(age);
	}
}
interface fun
{
	public void set_grade(int k); //������public����
}
class student extends people implements fun
{
	student(int i) {
		super(i);  //����Ĺ��췽��
	}
	public void set_grade(int k)
	{
	//	fun.grade = k;
	}
}
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("hello world");
	}
}
public class yz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);//util��
		//int i = in.nextInt();
		//System.out.println(i);
//		student yz = new student(20);
//		yz.set_grade(100);
		int i = 1, j = 2;
		Integer k = 100;   //int��Ӧ�İ�����/��װ��
		Character c = 's'; //char ��Ӧ������
		String s = "safddsaf";
//		System.out.println(s);
//		System.out.println(i + " " + j);
		MyThread t1 = new MyThread("�߳�1");
		MyThread t2 = new MyThread("�߳�2");
		t1.start();
		t2.start();
	}
}
