package test;

public class Lettercount {
	public static void main(String[] args) {
		String str="aaabbccde";
		int count=1;
		for(int i=0;i < str.length();i=i+count){
			count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count=count+1;
				}
					else {
						System.out.println(str.charAt(i)+""+count);
						break;
					}
			}
		}
	}
}