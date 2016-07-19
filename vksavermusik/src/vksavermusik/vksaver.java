package vksavermusik;
import java.io.File;
public class vksaver {

	public static void main(String[] args) {
		// далее переименование фј…Ћќв и перемещение в созданную папку
		
		//creating a folder
		File dir1 = new File("//storage//sdcard1//VKmusic");
		boolean created = dir1.mkdir();
		//Renaming and moving files to created path
		File destFolder = new File("//storage//sdcard1//VKmusik");
		File[] files = fl.ListFiles();
		file.renameTo(new File(destFolder, file.getName()));
	}

}
