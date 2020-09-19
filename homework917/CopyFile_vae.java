package ibm.homework917;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CopyFile_vae {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File folder = new File("D:\\ChenJunqiu");
		folder.mkdirs();
		//File folder2 = new File("")
		File folder2 = new File("D:\\ChenJunqiu\\Copy");
		folder2.mkdirs();
		File file = new File(folder, "myfile.text");
		file.createNewFile();
		String fileTexSours = "D:\\ChenJunqiu\\myfile.text";
		String fileTexDes = "D:\\ChenJunqiu\\Copy\\myfilecopy.text";
		copy();
	}
	
	public static void copy(String fileTexSours,String fileTexDes) throws IOException {
		FileInputStream finput = new FileInputStream(fileTexSours);
		FileInputStream file = new File(fileTexDes);
		if(!file.exists())
				file.createNewFile();
			FileOutputStream out=new FileOutputStream(file);
			int n;
			byte buffer[]=new byte[1024];
			while(( n=in.read(buffer))!=-1){
			for(int i=0;i<n;i++) {
				out.write(buffer[i]); 
				}
			}
			in.close();
			out.close();
			}
	}
}
