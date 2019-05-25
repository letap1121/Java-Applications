package spatel;
import java.util.Scanner;

public class MetarAbbreviations {

	public static void main(String[] args){
	Scanner s = new Scanner(System.in);		// Scanner S takes in user input
	System.out.print("Enter Meter Abbreviation: ");
	String code = s.nextLine();

	String translation = " ";				// The interpretations of the codes will be stored here.

	if (code.equals("+")) {					// If any of the 8 abbreviations are given in upper or lower case print associated meanings, else unknown
		translation = "Heavy Intensity";
	}
	else if (code.equals("-")) {
		translation = "Light Intensity";
	}
	else if (code.equals("B")||code.equals("b")) {
		translation = "Began At Time";
	}
	else if (code.equals("DZ")||code.contentEquals("dz")) {
		translation = "Drizzle";
	}
	else if (code.equals("E")||code.contentEquals("e")) {
		translation = "East";
	}
	else if (code.equals("HZ")||code.contentEquals("hz")) {
		translation = "Haze";
	}
	else if (code.equals("RA")||code.contentEquals("ra")) {
		translation = "Rain";
	}
	else if (code.equals("SN")||code.contentEquals("sn")) {
		translation = "Snow";
	}
	else {
		translation = "Unknown Abreviation";
	}
	System.out.println(translation);		// Prints the interpretations stored in translation.
s.close();									// Closes Scanner S
}
}
