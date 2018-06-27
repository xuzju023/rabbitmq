package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

//输入.*\.java
public class DirList {
	public static void main(String[] args) {
		File path = new File("D:\\test");
		String [] list;
		if (args.length == 0) {
			list = path.list();
		}else {
			list=path.list(new DirFilter(args[0]));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for (String dirItm : list) {
			System.out.println(dirItm);
		}
	}
}
class DirFilter implements FilenameFilter{
	private Pattern pattern;
	
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	@Override
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
	
}

