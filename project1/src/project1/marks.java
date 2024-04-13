package project1;
public class marks {
	public static void main(String[] args) {
	int ti,hi,eng,mt,si,so,totl,per;
	ti=25;
	hi=69;
	eng=77;
	mt=90;
	si=99;
	so=88;
	double marks=ti+hi+eng+mt+si+so;
    double tot=600;
	double perc=(marks/tot)*100;
	System.out.println("percentage of student is:"+perc);
	}
}

