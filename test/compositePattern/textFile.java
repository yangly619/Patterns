package compositePattern;

public class textFile implements AbstractFile{
	private String name;
	public textFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("text文件:"+name+"正在查杀");
	}
	
}
