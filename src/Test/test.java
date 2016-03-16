package Test;

import java.util.Date;

public class test {
	public static void main(String[] args) {
		String pic = "屏幕快照 2016-03-15 16.59.47.png";
		pic = pic.substring(pic.lastIndexOf(".")+1);
		System.out.println(pic);
		Date date = new Date();
		System.out.println(date.getTime());
	}
}