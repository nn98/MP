package pj00;
import java.net.URISyntaxException;
import java.util.Scanner;
public class Project_00 {
	public static void main(String[] args) throws URISyntaxException {
		Scanner inp=new Scanner(System.in);						//Def Scanner
		Progress pro[]=new Progress[4];							//Def ProgArr
		System.out.println("ProJect_00 : 201732009\n-----");	//Intro
		System.out.print("1.Search\n2.Browse\n3.Execution\nSelect : ");	//Tool
		int confirm=inp.nextInt();								//Sel
		if (confirm==1) pro[confirm]=new Serch();				//Create
		else if (confirm==2) pro[confirm]=new Browser();
		else if (confirm==3) pro[confirm]=new Execution();
		
		pro[confirm].con();										//Confirm, Intro
		
		int scon=inp.nextInt();									//LocVal
		pro[confirm].setI(scon);
		
		System.out.print("-----\nIn_Put:");						//Set Progress Text
		String link=inp.nextLine();								
		link=inp.nextLine();
		link=link.replaceAll(" ", "+");							//Delet Blank
		System.out.println("Inputted_word:"+link);		//Confirm Text
		
		pro[confirm].ex();										//Advanced Exe
		pro[confirm].exe(link);									//Execution
	}
}