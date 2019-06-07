package compositePattern;

public class videoFile implements AbstractFile {
	private String name;
	public videoFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("text文件:"+name+"正在查杀");
	}
}
