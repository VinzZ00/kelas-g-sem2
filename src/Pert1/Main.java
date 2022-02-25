package Pert1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	File f = new File("C:\\Binus Courses\\Semester 4\\Workspace LNT\\Kelas-G-Semester2-lnt\\foldertesting");
	Scanner sc = new Scanner(System.in);
	Vector<String> content;
	public Main() {
		// TODO Auto-generated constructor stub
		System.out.println(f.canWrite());
		
		//File.createnewfile()
//			try {
//				if (f.createNewFile()) {
//					System.out.println("File berhasil dibuat");
//				}  else {
//					System.out.println("file gagal dibuat");
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		//FileOutputStream
			
//			try {
//				FileOutputStream fstream = new FileOutputStream(f);
//				fstream.write("Elvin Sestomi".getBytes());
//				fstream.write("\nVincent".getBytes());
//				fstream.close();
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
		//exist()
			if (f.exists()) {
				System.out.println("file ini ada");
			} else {
				System.out.println("file ini absence");
			}
			
		//Scanner
//			while(true) {
//				Scanner fsc = null;
//				ArrayList<String> isif = new ArrayList<>();
//				try {
//					fsc = new Scanner(f);
//				} catch (FileNotFoundException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//					while (fsc.hasNextLine()) {
//						isif.add(fsc.nextLine());
//					}
//					fsc.close();
//					for (String string : isif) {
//						System.out.println("ini isi content" + string);
//					}
//					System.out.println("\n\n");
//					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//					System.out.println(sdf.format(f.lastModified()));
//					System.out.println(f.getAbsolutePath());
//					System.out.println(f.length());
//				int i = sc.nextInt(); sc.nextLine();
//				if (i == 5) {
//					break;
//				}
//				
//			}
			
			//write
//			while(true) {
//				
//				try {
//					reader();
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				for (String string : content) {
//					System.out.println(string);
//				}
//				System.out.print("Masukan append");
//				String inputan = sc.nextLine();
//				content.add(inputan.concat("\n"));
//				
//				FileWriter fw;
//				try {
//					fw = new FileWriter(f);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//					fw = null;
//				}
//				BufferedWriter bw = new BufferedWriter(fw);
//				PrintWriter pw = new PrintWriter(bw);
//				
//				for (String string : content) {
//					pw.write(string);
//				}
//				pw.close();
//				int i = sc.nextInt(); sc.nextLine();
//				if (i == 6) {
////					break;
//				}
//			}
			
//			try {
//				FileWriter fw = new FileWriter(f, true);
//				fw.write("BODI");
//				fw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			//Delete file
//			if (f.delete()) {
//				System.out.println("Berhasil");
//			} else System.out.println("Tidak berhasil");
			
//			if (f.mkdir()) {
//				System.out.println("Berhasil");
//			} else {
//				System.out.println("Tidak berhasil");
//			}
			
			String[] listfile = f.list();
			File[] listFile = new File[listfile.length];
			for (int i = 0; i < listFile.length; i++) {
				
				listFile[i] = new File(f.getAbsoluteFile().toString().concat("\\" + listfile[i]));
			}
			
			for (File file : listFile) {
				if (file.exists()) {
					System.out.println("ADA");
				} else {
					System.out.println("gaad");
				}
			}
				

			
			
			
			
	}

	private void reader() throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner	fsc = new Scanner(f);
		content = new Vector<String>();
		while (fsc.hasNextLine()) {
			String temp = fsc.nextLine();
			temp = temp.concat("\n");
			content.add(temp);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
