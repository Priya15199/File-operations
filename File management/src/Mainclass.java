import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Mainclass {

public static void main(String[] args) {
// TODO Auto-generated method stub
int choice = 0;
Scanner a = new Scanner(System.in);
char option;
do {
	
System.out.println("File operations, select one :");
System.out.println("1. Create");
System.out.println("2. Delete");
System.out.println("3. List");
System.out.println("4. Search");
System.out.println("5. Exit");
System.out.println("Enter the file operation you want to perform :");
choice = a.nextInt();
switch(choice) {
case 1:
	Createfiles();
	break;
case 2:
	deletefiles();
	break;
case 3:
	listfiles();
	break;
case 4:
	Searchfile();
	break;
case 5:
	return;
default:
	break;
}
System.out.println("Do you want to continue (Y|N)");
option = a.next().charAt(0);
}while(option == 'Y' |option == 'y');
}
public static void Createfiles() {
 Scanner s = new Scanner(System.in);
 
 System.out.println("Enter the file name");
 String filename = s.nextLine();
 
 //String directory = System.getProperty("user.dir");
 String path = "";
 System.out.println("Enter the path name");
 String a = s.nextLine();
 
 path = a + File.separator + filename;
 File files = new File(path);
 try {
 if(files.createNewFile()) {
 System.out.println("New file created in location :" +a);

 }else {
 System.out.println("File already exists ");
 
 }
 } catch (IOException e) {
 e.printStackTrace();
 }


}
public static void deletefiles() {
Scanner s = new Scanner(System.in);
 
 System.out.println("Enter the file name to be deleted ");
 String filename = s.nextLine();
 
 //String directory = System.getProperty("user.dir");
 String path = "";
 System.out.println("Enter the path name ");
 String a = s.nextLine();
 
 path = a + File.separator + filename;
 File files = new File(path);
 if(files.delete()) {
 System.out.println("File deleted in location :" +a);

 }else {
 System.out.println("File doesn't exists ");
 
 }
 }
public static void listfiles() {
Scanner s = new Scanner(System.in);
String user_i;
System.out.println("Directory :");
user_i = s.next();

File dir = new File(user_i);
System.out.println("Files are :");

for(File f : dir.listFiles()) {
System.out.println(f.getName());
}
}
public static void Searchfile() {
Scanner s = new Scanner(System.in);
 
 System.out.println("Enter the file name to be deleted ");
 String filename = s.nextLine();
 
 //String directory = System.getProperty("user.dir");
 String path = "";
 System.out.println("Enter the path name ");
 String a = s.nextLine();
 
 path = a + File.separator + filename;
 File files = new File(path);
 
 if(files.exists()) {
 System.out.println("File exists at location: " + a );
 }else {
 System.out.println("File not found in the specified location ");
 }
}

}

