package project1;
import java.util.*;
public class student {
	public static void main(String[] args) {
		int ti,hi,eng,mt,si,so,totl,per;
		Scanner sc = new Scanner(System.in);
		System.out.println("input marks obtained in telugu");
		ti=sc.nextInt();
		System.out.println("input marks obtained in hindi");
		hi=sc.nextInt();
		System.out.println("input marks obtained in english");
		eng=sc.nextInt();
		System.out.println("input marks obtained in maths");
		mt=sc.nextInt();
		System.out.println("input marks obtained in science");
		si=sc.nextInt();
		System.out.println("input marks obtained in social");
		so=sc.nextInt();
		totl=ti+hi+eng+mt+si+so;
		per=totl/6;
		System.out.println("percentage of student is:"+per);
		if(per>=90) {
		System.out.println("o grade");
		}
		else if(per>=90 && per>70) {
		System.out.println("a grade");
		}
		else if(per<=70 && per>60) {
		System.out.println("b grade");
		}
		else if(per<=60 && per>=35){
		System.out.println("c grade");
		}
		else {
			System.out.println("fails");
		}
	}
}