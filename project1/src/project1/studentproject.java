package project1;              //print the 4 years student 2 subjects marks and percentage 
import java.util.Scanner;
public class studentproject {
public static void main(String[] args) {
int Eng=98;
int M_1=89;
double Year1_Result=(Eng+M_1)/200d*100;
int python=80;
int c_lang=70;
double Year2_Result=(python+c_lang)/200d*100;
int Emt=66;
int ps=99;
double Year3_Result=(Emt+ps)/200d*100;
int facts=55;
int DBMS=48;
double Year4_Result=(facts+DBMS)/200d*100;
System.out.println("enter the year number to get result");
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
switch(i) {
case 1:
System.out.println("year 1 marks");
int s=sc.nextInt();
if(s==1){
System.out.println("Eng:"+Eng);
System.out.println("M_1:"+M_1);
System.out.println("Year1t_Resul:"+Year1_Result);
}
break;
case 2:
System.out.println("year 2 marks");
int b=sc.nextInt();
if(b==1) {
System.out.println("python:"+python);
System.out.println("c_lang:"+c_lang);
System.out.println("Year2_Result:"+Year2_Result);
}
break;
case 3:
System.out.println("year 3 marks");
int R=sc.nextInt();
if(R==1) {
System.out.println("Emt:"+Emt);
System.out.println("ps:"+ps);
System.out.println("Year3_Result:"+Year3_Result);
}
break;
case 4:
System.out.println("year 4 marks");
int v=sc.nextInt();
if(v==1) {
System.out.println("facts:"+facts);
System.out.println("DBMS:"+DBMS);
System.out.println("Year4_Result:"+Year4_Result);
}
break;
case 5:
System.out.println("overall grade");
int o=sc.nextInt();
if(o==1) {
double
Overall_Grade=(Year1_Result+Year2_Result+Year3_Result+Year4_Result)/4;
System.out.println("Overall_Grade:"+Overall_Grade);
}
break;
default:
System.out.println("details not found");
}
sc.close();
}
}



















