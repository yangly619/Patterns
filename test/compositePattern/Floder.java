package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Floder implements AbstractFile{
	private List<AbstractFile> file_list = new ArrayList<AbstractFile>();
	private String name ;
	public Floder(String name) {
		this.name = name;
	}
	
	public void addItem(AbstractFile f) {
		file_list.add(f);
	}
	public void removeItem(int index) {
		file_list.remove(index);
	}
	
	@Override
	public void killVirus() {
		for(AbstractFile f : file_list) {
			System.out.println("文件jia:"+name+"正在查杀");
			f.killVirus();
		}
	}
}
