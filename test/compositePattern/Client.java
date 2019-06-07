package compositePattern;

public class Client {
	public static void main(String[] args) {
		AbstractFile f1 = new textFile("名单");
		AbstractFile f2 = new textFile("工资单");
		AbstractFile f3 = new imagFile("图片1");
		AbstractFile f4 = new imagFile("图片2");
		AbstractFile f5 = new videoFile("电影1");
		AbstractFile f6 = new videoFile("电影2");
		
		Floder f7 = new Floder("floder1");
		Floder f8 = new Floder("floder2");
		f7.addItem(f1);
		f7.addItem(f2);
		f7.addItem(f3);
		f8.addItem(f4);
		f8.addItem(f5);
		f8.addItem(f6);

		f8.addItem(f7);
		f8.killVirus();
	}
	
	
	
}
