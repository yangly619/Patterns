package compositePattern;

public class imagFile implements AbstractFile{
	private String name;
	public imagFile(String name) {
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("imag文件:"+name+"正在查杀");
	}
	
}
