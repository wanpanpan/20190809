
public class Qwe {
	public String name;
	public int age;
	int x;
	int y;
	public void text() {
		System.out.println(age);
	}
	public Qwe() {
		System.out.println("这是一个构造器");
	}
	public Qwe(String name,int age) {
		this.name = name;
	}
	
	public Qwe(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public Qwe(int c) {
		this(c,c);
	}
    public static  void main(String[] args) {
		// Qwe text = new Qwe();
		 //Qwe text1 = new Qwe();
		 //Qwe text2 = new Qwe();
		 //Qwe text3 = new Qwe();
		// System.out.println(text.name);
		//Qwe student = new Qwe("张三",18);
		//System.out.println(student.name);
		Qwe text4 = new Qwe(1);
		System.out.println(text4.x );
		System.out.println(text4.y );
	}
}
