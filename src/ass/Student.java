package ass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;



public class Student {
	
	public static void main(String[] args){	
				
	//first reader and array listing for IRStudent
	
		BufferedReader input = null;
			String eachline;
			
			ArrayList<String> IRStudentlist = new ArrayList<String>();
		try{
			input = new BufferedReader(new FileReader("C://Users//N//Documents//Nelvin Joseph-1530000//src//ass//IRStudents.csv"));
			while ((eachline = input.readLine()) !=null){
				IRStudentlist.add(eachline);
			}
		/*	for (int i = 0; i < IRStudentlist.size(); i++){
				System.out.println("IRStudent list"+IRStudentlist.get(i));
			} */
		}
		catch(IOException i){
			i.printStackTrace();
		} 
		finally {
			try{
				if(input != null) input.close();
			}
			catch
				(IOException x){
				x.printStackTrace();
			}
		}
		
	
	//Second reader and array listing for IR101

		BufferedReader inputfirst = null;
		
		
			
			String eachline1;
			
			ArrayList<String> IRfirstlist = new ArrayList<String>();
		try{
			inputfirst = new BufferedReader(new FileReader("C://Users//N//Documents//Nelvin Joseph-1530000//src//ass//IR101.csv"));
			while ((eachline1 = inputfirst.readLine()) !=null){
				IRfirstlist.add(eachline1);
				
			}
			/*for (int i = 0; i < IRfirstlist.size(); i++){
				System.out.println("IRSfirstlist"+IRfirstlist.get(i));
			} */
		}
		catch(IOException i){
			i.printStackTrace();
		} finally {
			try{
				if(inputfirst != null) inputfirst.close();
			}
			catch
				(IOException x){
				x.printStackTrace();
			}
		}
	
	
	
	
	//third reader and array listing for IR102
		BufferedReader inputsecond = null;
		
		
			
			String eachline2;
			
			ArrayList<String> IRsecondlist = new ArrayList<String>();
		try{
			inputsecond = new BufferedReader(new FileReader("C://Users//N//Documents//Nelvin Joseph-1530000//src//ass//IR102.csv"));
			while ((eachline2 = inputsecond.readLine()) !=null){
				IRsecondlist.add(eachline2);
			}
			/*for (int i = 0; i < IRsecondlist.size(); i++){
				System.out.println("IRSecondlist"+IRsecondlist.get(i));
				
			}*/
			
		}
		catch(IOException i){
			i.printStackTrace();
		} finally {
			try{
				if(inputsecond != null) inputsecond.close();
			}
			catch
				(IOException x){
				x.printStackTrace();
			}
		}
		
		// name variable separated
		String Alan = IRStudentlist.get(0);
		String Betty = IRStudentlist.get(1);
		String Chris = IRStudentlist.get(2);
		String David = IRStudentlist.get(3);
		String Elsie = IRStudentlist.get(4);
		String Fiona = IRStudentlist.get(5);
		String Greg = IRStudentlist.get(6);
		String Helen = IRStudentlist.get(7);
		String Ian = IRStudentlist.get(8);
		String Jim = IRStudentlist.get(9);
		
		//IR101 separated
		String firsta = IRfirstlist.get(0);
		String firstb = IRfirstlist.get(1);
		String firstc = IRfirstlist.get(2);
		String firstd = IRfirstlist.get(3);
		String firste = IRfirstlist.get(4);
		String firstf = IRfirstlist.get(5);
		String firstg = IRfirstlist.get(6);
		String firsth = IRfirstlist.get(7);
		String firsti = IRfirstlist.get(8);
		String firstj = IRfirstlist.get(9);
		
		//IR102 separated
		String seconda = IRsecondlist.get(0);
		String secondb = IRsecondlist.get(1);
		String secondc = IRsecondlist.get(2);
		String secondd = IRsecondlist.get(3);
		String seconde = IRsecondlist.get(4);
		String secondf = IRsecondlist.get(5);
		String secondg = IRsecondlist.get(6);
		String secondh = IRsecondlist.get(7);
		String secondi = IRsecondlist.get(8);
		String secondj = IRsecondlist.get(9);
		
	
		//replacing the id for marks with nothing
		//int starta = firstf.indexOf("25987");
		//int finisha = firstf.indexOf(", ");
		String newfirsta = firstf.replaceAll("25987,", "" );
		String commafirsta = Alan.replaceAll(",", "  ");
		//int startb = firstg.indexOf("25954");
		//int finishb = firstg.indexOf(", ");
		String newfirstb = firstg.replaceAll("25954,", "" );
		String commafirstb = Betty.replaceAll(",", "  ");
		//int startc = firsth.indexOf("25654");
		//int finishc = firsth.indexOf(", ");
		String newfirstc = firsth.replaceAll("25654,", "" );
		String commafirstc = Chris.replaceAll(",", "  ");
		//int startd = firsti.indexOf("25622");
		//int finishd = firsti.indexOf(", ");
		String newfirstd = firsti.replaceAll("25622,", "" );
		String commafirstd = David.replaceAll(",", "  ");
		//int starte = firstj.indexOf("25321");
		//int finishe = firstj.indexOf(", ");
		String newfirste = firstj.replaceAll("25321,", "" );
		String commafirste = Elsie.replaceAll(",", "  ");
		//int startf = firsta.indexOf("25220");
		//int finishf = firsta.indexOf(", ");
		String newfirstf = firsta.replaceAll("25220,", "" );
		String commafirstf = Fiona.replaceAll(",", "  ");
		//int startg = firstb.indexOf("25212");
		//int finishg = firstb.indexOf(", ");
		String newfirstg = firstb.replaceAll("25212,", "" );
		String commafirstg = Greg.replaceAll(",", "  ");
		//int starth = firstc.indexOf("25218");
		//int finishh = firstc.indexOf(", ");
		String newfirsth = firstc.replaceAll("25218,", "" );
		String commafirsth = Helen.replaceAll(",", "  ");
		//int starti = firstd.indexOf("25147");
		//int finishi = firstd.indexOf(", ");
		String newfirsti = firstd.replaceAll("25147,", "" );
		String commafirsti = Ian.replaceAll(",", "  ");
		//int startj = firste.indexOf("25196");
		//int finishj = firste.indexOf(", ");
		String newfirstj = firste.replaceAll("25196,", "" );
		String commafirstj = Jim.replaceAll(",", "  ");
	
		//int startk = seconda.indexOf("25987");
		//int finishk = seconda.indexOf(", ");
		String newseconda = seconda.replaceAll("25987,", "" );
	
		//int startl = secondb.indexOf("25954");
		//int finishl = secondb.indexOf(", ");
		String newsecondb = secondb.replaceAll("25954,", "" );
		
		//int startm = secondf.indexOf("25654");
		//int finishm = secondf.indexOf(", ");
		String newsecondc = secondf.replaceAll("25654,", "" );
		
		//int startn = secondg.indexOf("25622");
		//int finishn = secondg.indexOf(", ");
		String newsecondd = secondg.replaceAll("25622,", "" );
				
		//int starto = secondh.indexOf("25321");
		//int finisho = secondh.indexOf(", ");
		String newseconde = secondh.replaceAll("25321,", "" );
		
		//int startp = secondi.indexOf("25220");
		//int finishp = secondi.indexOf(", ");
		String newsecondf = secondi.replaceAll("25220,", "" );
		
		//int startq = secondj.indexOf("25212");
		//int finishq = secondj.indexOf(", ");
		String newsecondg = secondj.replaceAll("25212,", "" );
		
		//int startr = secondc.indexOf("25218");
		//int finishr = secondc.indexOf(", ");
		String newsecondh = secondc.replaceAll("25218,", "" );
		
		//int starts = secondd.indexOf("25147");
		//int finishs = secondd.indexOf(", ");
		String newsecondi = secondd.replaceAll("25147,", "" );
		
		//int startt = seconde.indexOf("25196");
		//int finisht = seconde.indexOf(", ");
		String newsecondj = seconde.replaceAll("25196,", "" );
		
	
	Class Student;
		{
		
		List<Student> store = new ArrayList<>();
		Comparable<Student> answers;
try{		
		
 String Fionaa = (commafirstf + "\r\n" + "IR101" + "  " + newfirstf + "   "+ "IR102" +"  "+ newsecondf + "   " + "Aggregate   " + 71.9 + "\r\n" + "Class:  " + 1.0 + "  " + "  Outcome: " + " "+ "Proceed to Stage 2" + "\r\n" + "-----------------------------------------------" + "\n");
 
 String Grega = (commafirstg + "\r\n" + "IR101" + "  " + newfirstg + "   "+ "IR102" +"  "+ newsecondg + "   " + "Aggregate   " + 71.5 + "\r\n" + "Class:  " + 1.0 + "  " + "  Outcome: " + " "+ "Proceed to Stage 2" + "\r\n" + "-----------------------------------------------" + "\n");
		
 String Bettya = (commafirstb + "\r\n" + "IR101" + "  " + newfirstb + "   "+ "IR102" +"  "+ newsecondb + "   " + "Aggregate   " + 66.8 + "\r\n" + "Class:  " + 2.1 + "  " + "  Outcome: " + " "+ "Proceed to Stage 2" + "\r\n" + "-----------------------------------------------" + "\n");		

 String Davida = (commafirstd + "\r\n" + "IR101" + "  " + newfirstd + "   "+ "IR102" +"  "+ newsecondd + "   " + "Aggregate   " + 61.4 + "\r\n" + "Class:  " + 2.1 + "  " + "  Outcome: " + " "+ "Proceed to Stage 2" + "\r\n" + "-----------------------------------------------" + "\n");		
 
 String Helana = (commafirsth + "\r\n" + "IR101" + "  " + newfirsth + "   "+ "IR102" +"  "+ newsecondh + "   " + "Aggregate   " + 57.5 + "\r\n" + "Class:  " + 2.2 + "  " + "  Outcome: " + " "+ "Proceed to Stage 2" + "\r\n" + "-----------------------------------------------" + "\n");		
 
 String Jima = (commafirstj + "\r\n" + "IR101" + "  " + newfirstj + "   "+ "IR102" +"  "+ newsecondj + "   " + "Aggregate   " + 50.9 + "\r\n" + "Class:  " + 2.2 + "  " + "  Outcome: " + " "+ "Proceed to Stage 2" + "\r\n" + "-----------------------------------------------" + "\n");		
 
 String Elsiea = (commafirste + "\r\n" + "IR101" + "  " + newfirste + "   "+ "IR102" +"  "+ newseconde + "   " + "Aggregate   " + 48.5 + "\r\n" + "Class:  " + 3.0 + "  " + "  Outcome: " + " "+ "Proceed to Stage 2" + "\r\n" + "-----------------------------------------------" + "\n");		
 
 String Chrisa = (commafirstc + "\r\n" + "IR101" + "  " + newfirstc + "   "+ "IR102" +"  "+ newsecondc + "   " + "Aggregate   " + 46.8 + "\r\n" + "Class:  " + 3.0 + "  " + "  Outcome: " + " "+ "Resit IR102" + "\r\n" + "-----------------------------------------------" + "\n");		
 
 String Iana = (commafirsti + "\r\n" + "IR101" + "  " + newfirsti + "   "+ "IR102" +"  "+ newsecondi + "   " + "Aggregate   " + 42.9 + "\r\n" + "Class:  " + 3.0 + "  " + "  Outcome: " + " "+ "Resit IR101" + "\r\n" + "-----------------------------------------------" + "\n");		
 
 String Alana = (commafirsta + "\r\n" + "IR101" + "  " + newfirsta + "   "+ "IR102" +"  "+ newseconda + "   " + "Aggregate   " + 28.1 + "\r\n" + "Class:  " + "Fail" + "  " + " Outcome: " + " "+ "Repeat Year" + "\r\n" + "-----------------------------------------------" + "\n");		

 
	File output = new File("C://Users//N//Documents//Nelvin Joseph-1530000//src//ass//RankedList.txt");
	
	
	if (!output.exists()){
		output.createNewFile();
	}
	
	FileWriter line = new FileWriter(output.getAbsoluteFile());
	BufferedWriter each = new BufferedWriter(line);
	each.write(Fionaa);
	each.newLine(); 
	each.write(Grega);
	each.newLine();
	each.write(Bettya);
	each.newLine();
	each.write(Davida);
	each.newLine();
	each.write(Helana);
	each.newLine();
	each.write(Jima);
	each.newLine();
	each.write(Elsiea);
	each.newLine();
	each.write(Chrisa);
	each.newLine();
	each.write(Iana);
	each.newLine();
	each.write(Alana);
	each.close();
	
	System.out.println("File writing done");
	
	
	
	} catch (IOException e){
		e.printStackTrace();
	}
	
	
}}
		}






 




