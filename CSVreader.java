package com;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;


public class CSVreader {

	public static void main(String... args) {
		
		String a="D:\\software\\Advanced_java_training_code\\us-500.csv";
		
		List<US500> us500 = readCSVfile(a);
		
		
		
		List<US500> A=Sortedlist(us500);
		
		for(US500 aa:A )
		{
			System.out.println(aa.getFirst_name());
		}
		
		for(US500 b: us500)
		{
			
			
			if(b.getCity().equals("New York"))
					{
						System.out.println(b.getFirst_name()+"     "+b.getLast_name()+"     "+b.getCompany_name());
					}
		}
		
	}
	
	public static List<US500> Sortedlist(List<US500> l)
	{
		for(int i=0;i<l.size()-1;i++)
		{
			for(int j=0;j<l.size()-1;j++)
			{
				if(l.get(i).getFirst_name().compareTo(l.get(j).getFirst_name())<0)
				{
					Collections.swap(l,i,j);
				}
					
			}
		}
		return l;
	}
	
	public CSVreader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static List<US500> readCSVfile(String filename)
	{
		List<US500> us500= new ArrayList<>();
		Path Pathtofile = Paths.get(filename);
		
		try
		//(BufferedReader br = Files.newBufferedReader(Pathtofile, StandardCharsets.US_ASCII))
				{
			
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
					String line = br.readLine();
					
					while(line != null)
					{
						String[] attributes = line.split(",");
						
						US500 us = create_us500(attributes);
						
						us500.add(us);
						
						line=br.readLine();
						
					}
				}
		
		catch (IOException ioe) {
            ioe.printStackTrace();
        }
		
		return us500;
		
	}

public static US500 create_us500(String[] metadata)
	{
		String first_name= metadata[0];
		String last_name= metadata[1];
		String company_name = metadata[2];
		String address = metadata[3];
		String city = metadata[4];
		String country = metadata[5];
		String state = metadata[6];
		String zip= metadata[7];
		String phone_no1= metadata[8];
		String phone_no2= metadata[9];
		String e_mail = metadata[10];
		String web = metadata[11];
		
		return new US500 (first_name.replace("\"", ""),last_name.replace("\"", ""),company_name.replace("\"", ""),address.replace("\"", ""),city.replace("\"", ""),country.replace("\"", ""),state.replace("\"", ""),zip.replace("\"", ""),phone_no1.replace("\"", ""),phone_no2.replace("\"", ""),e_mail.replace("\"", ""),web.replace("\"", ""));
	}
}