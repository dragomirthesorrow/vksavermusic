package vksavermusik;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
public class vksaver {

	public static void main(String[] args) {
		// ����� �������������� ������ � ����������� � ��������� �����
		
		//creating a folder
		//File dir1 = new File("C://users//a.onischenko.DGGRU//desktop//VKmusic");
		//boolean created = dir1.mkdir();
		
		//Renaming and moving files to created path
		String file[] = new File("C://users//a.onischenko.DGGRU//desktop//Music").list();
		for(int i=0; i<file.length;i++) System.out.println(file[i]);
		
}
}