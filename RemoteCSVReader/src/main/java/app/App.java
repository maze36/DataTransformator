package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;

import out.CSVWriter;

public class App {

	public static void main(String[] args) throws IOException {
		URL url = new URL("");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		// You can read lines like this
		String line = br.readLine();
		
		int iteration = 0;
		
		String header = line;
		
		System.out.println("Start " + new Timestamp(System.currentTimeMillis()));
		
		ArrayList<String> entries = new ArrayList<String>();
		
		while(line != null) {
			String[] lineArray = line.split(",");
			if(lineArray[12].contains("AIS")) {
				if(lineArray[15].contains("2017") || lineArray[15].contains("2018")) {
					if(entries.size() == 0) {
						entries.add(header);
						System.out.println("ADDING " + line);
						entries.add(line);
					} else {
						System.out.println("ADDING " + line);
						entries.add(line);
						
						if (entries.size() == 1000000) {
							CSVWriter.writeCSV(entries, iteration);
							iteration++;
							entries.clear();
						}
					}
				}
			}		
			line = br.readLine();
		}
	}

}
