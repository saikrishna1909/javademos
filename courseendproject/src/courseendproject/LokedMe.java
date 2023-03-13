package courseendproject;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class LokedMe {
	public static void main(String args[]) {
		welcomeScreen();
	}
	public static void welcomeScreen() {
		Application app=new Application();
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");
		System.out.println("````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````");		
		System.out.println("                                         		LOCKED ME.COM");
		System.out.println("``````````````````````````````````````````````````````````````````````````````````````````````Developed by:N Sai Krishna Reddy``````````````");
		System.out.println("``````````````````````````````````````````````````````````````````````````````````````````````EmployeeId:10829``````````````````````````````");
		System.out.println("        THE MENU          ");
		System.out.println("1.Current File Names");
		System.out.println("2.File Operations(Add/Delete/Search Files)");
		System.out.println("3.Close application");
		System.out.println("Enter Your Choice:");
		int ch = 0;
		if(sc.hasNextInt()) {
			ch =sc.nextInt();
		}
		else {
			System.out.println("Enter numeric value mentioned above");
		}

		switch(ch) {
		case 1:displaySortedFiles();
		break;
		case 2:app.menu();
			break;
		case 3:System.exit(0);
		break;
		default:System.out.println("Invalid option! Enter any option from above only");
		break;
		}
		}
		
		
	}
	public static void displaySortedFiles(){
		Application app1=new Application();
		File fs[]=app1.getFileList();
		TreeSet<String> ts=new TreeSet<String>();
	
		if(fs.length!=0) {
		for(File i:fs) {
				ts.add(i.getName());
				//System.out.println(i.getName());
			
		}}
		else {
			System.out.println("Directory is Empty");
		}
		for(String i:ts) {
			System.out.println(i);
		}
	}
}
class Application {

	Scanner sc =new Scanner(System.in);
	public void menu() {
		while(true) {
		System.out.println("FILE OPERATIONS");
		System.out.println("1.Add a file");
		System.out.println("2.Delete a file");
		System.out.println("3.Search a file");
		System.out.println("4.Previous menu");
		System.out.println("Choose the option:");
		int ch = 0;
		if(sc.hasNextInt()) {
			ch =sc.nextInt();
		}
		else {
			System.out.println("Enter numeric value mentioned above");
		}
		switch(ch) {
		case 1:addFile();
		break;
		case 2:deleteFile();
		break;
		case 3:searchFile();
		break;
		case 4:LokedMe.welcomeScreen();
		break;
		default:System.out.println("Invalid option! Choose from above options only");
		}
		}
		

	}
	
	public void addFile() {
		System.out.println("Please Enter the File name:");
		String loc=sc.next();
		File myFile=new File("myDirectory\\"+loc);
		
		try {
		if(myFile.createNewFile()) {
			System.out.println("File Created SuccessFully");
		}
		else {
			System.out.println("File already exists");
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	public void deleteFile() {
		System.out.println("Enter the file name to be deleted(case sensitive):");
		String fileName=sc.next();
		String deletionItem=null;
		File fL[]=getFileList();
		if(fL!=null) {
		for(File i: fL) {
			if((i.getName()).equals(fileName)) {
				deletionItem=i.getName();
			}

		}
		}
		else {
			System.out.println("Directory s Empty");
		}
		File myFile=new File("myDirectory\\"+deletionItem);

		try {
			myFile.delete();
			System.out.println("The file deletion of :"+deletionItem+" was successfull");
		}
		catch(Exception ne) {
			System.out.println("File Deletion Unsuccessfull because"+ne.getMessage());
		}
		
	}
	public File[] getFileList() {
		String loc="myDirectory\\";
		File files=new File(loc);
		File filesList[]=files.listFiles();	
		return filesList;
		
	}
	public void searchFile() {
		File fs[]=getFileList();
		System.out.println("Enter the name of file or folder");
		String searchInput=sc.next();
		for(File i:fs) {
			
			if(i.getName().equals(searchInput)) {
				if(i.isFile()) {
					System.out.println("The file"+i.getName()+"is found");
					
				}
				if(i.isDirectory()) {
					System.out.println("The folder"+i.getName()+" is found");
				}
			}
			else {
				System.out.println("The requested file or folder is not found");
			}
		}
	}
	
}
