package programs;

public class TrainingClass {
	private int i;
	TrainingClass(){}
	TrainingClass(int i){
		this.i=i;
	}
	public int getValue() {
		return i;
	}
	public void setValue(int i) {
		this.i=i;
	}
	@Override
	public String toString() {
		return Integer.toString(i);
	}
}
class Test{
	public static void main(String[] args) {
		TrainingClass j=new TrainingClass(20);
		System.out.println(j.toString());
	}}



