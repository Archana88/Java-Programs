import java.io.*;
class filereadnwrite
{
	public static void main(String args[]) throws Exception
	{
		int i;
		File fin=new File("C:/java prog/aaa.txt");
		File fout=new File("C:/java prog/b.txt");
		FileInputStream fsin=new FileInputStream(fin);
		FileOutputStream fsout=new FileOutputStream(fout);
		do{
			i=fsin.read();
			if(i!=-1)
			System.out.print((char)i);
			fsout.write((char)i);
		}while(i!=-1);
		fsin.close();
		fsout.close();
	}
}


