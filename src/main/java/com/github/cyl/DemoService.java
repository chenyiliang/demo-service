package com.github.cyl;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class DemoService {

	public static void main(String[] args) throws Exception {
		File dir = new File("/data");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File("/data/demo.txt");
		while (true) {
			Thread.sleep(1000);
			Date date = new Date();
			String dateStr = date.toString();
			FileUtils.writeStringToFile(file, dateStr);
		}
	}

}
