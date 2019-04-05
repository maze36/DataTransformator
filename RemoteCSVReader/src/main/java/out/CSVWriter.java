package out;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CSVWriter {

	public static void writeCSV(ArrayList<String> entries, int iteration) {
		try {
			PrintWriter pw = new PrintWriter(new File("result/OFFIS_" + iteration + ".csv"));
			StringBuilder sb = new StringBuilder();
			
			for(String string : entries) {
				sb.append(string);
				sb.append('\n');
			}
			
			pw.write(sb.toString());
			pw.close();
			System.out.println("Finished writing ");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}
	
}
