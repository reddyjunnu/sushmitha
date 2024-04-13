package chitti;

public class Lambda {
	interface Draw{
		public void Draw();
		public class programsExample{
			public static void main(String[] args) {
				int length=13;
			}
				Draw d = new Draw() {
				public void draw();
				System.out.println("Drawable"+length);
				}
		}
	}