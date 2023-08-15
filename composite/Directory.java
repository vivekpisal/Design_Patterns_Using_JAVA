package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

	private String directoryName;
	private List<FileSystem> files;
	
	public Directory(String name,List<FileSystem> files) {
		this.directoryName = name;
		this.files = files;
	}
	
	public Directory(String name) {
		this.directoryName = name;
		this.files = new ArrayList<>();
	}
	
	
	
	public void addFile(FileSystem file) {
		this.files.add(file);
	}

	@Override
	public void ls() {
		System.out.println("*"+directoryName);
		for(FileSystem f:files) {
			f.ls();
		}
	}

}
