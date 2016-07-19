package vksavermusik;

import java.io.File;

public static String[] getFilesList (File fl) {

		File destFolder = new File("C://users//a.onischenko.DGGRU//desktop//VKmusic");
		File[] files = File.ListFiles("C://users//a.onischenko.DGGRU//desktop//Music");
		File.renameTo(new File(destFolder, File.getName()));
	}
}
