package dataminingproject;
import java.io.*;
import java.util.*;

public class similarityWeights{
	static HashMap<String, String> i1 = new HashMap<String, String>();
	static HashMap<String, String> i2 = new HashMap<String, String>();
	static HashMap<String, String> i3 = new HashMap<String, String>();
	static HashMap<String, String> i4 = new HashMap<String, String>();
	static HashMap<String, String> i5 = new HashMap<String, String>();
	static HashMap<String, String> i6 = new HashMap<String, String>();
	static HashMap<String, String> i7 = new HashMap<String, String>();
	static HashMap<String, String> i8 = new HashMap<String, String>();
	static HashMap<String, String> i9 = new HashMap<String, String>();
	static HashMap<String, String> i10 = new HashMap<String, String>();
	static HashMap<String, String> i11 = new HashMap<String, String>();
	static HashMap<String, String> i12 = new HashMap<String, String>();
	static HashMap<String, String> i13 = new HashMap<String, String>();
	static HashMap<String, String> i14 = new HashMap<String, String>();
	static HashMap<String, String> i15 = new HashMap<String, String>();
	static HashMap<String, String> i16 = new HashMap<String, String>();
	static HashMap<String, String> i17 = new HashMap<String, String>();
	static HashMap<String, String> i18 = new HashMap<String, String>();
	static HashMap<String, String> i19 = new HashMap<String, String>();
	static HashMap<String, String> i20 = new HashMap<String, String>();
	static HashMap<String, String> i21 = new HashMap<String, String>();
	static HashMap<String, String> i22 = new HashMap<String, String>();
	static HashMap<String, String> i23 = new HashMap<String, String>();
	static HashMap<String, String> i24 = new HashMap<String, String>();
	static HashMap<String, String> i25 = new HashMap<String, String>();
	static HashMap<String, String> i26 = new HashMap<String, String>();
	static HashMap<String, String> i27 = new HashMap<String, String>();
	static HashMap<String, String> i28 = new HashMap<String, String>();
	static HashMap<String, String> i29 = new HashMap<String, String>();
	static HashMap<String, String> i30 = new HashMap<String, String>();
	static HashMap<String, String> i31 = new HashMap<String, String>();
	static HashMap<String, String> i32 = new HashMap<String, String>();
	static HashMap<String, String> i33 = new HashMap<String, String>();
	static HashMap<String, String> i34 = new HashMap<String, String>();
	static HashMap<String, String> i35 = new HashMap<String, String>();
	static HashMap<String, String> i36 = new HashMap<String, String>();
	static HashMap<String, String> i37 = new HashMap<String, String>();
	static HashMap<String, String> i38 = new HashMap<String, String>();
	static HashMap<String, String> i39 = new HashMap<String, String>();
	static HashMap<String, String> i40 = new HashMap<String, String>();
	static HashMap<String, String> i41 = new HashMap<String, String>();
	static HashMap<String, String> i42 = new HashMap<String, String>();
	static HashMap<String, String> i43 = new HashMap<String, String>();
	static HashMap<String, String> i44 = new HashMap<String, String>();
	static HashMap<String, String> i45 = new HashMap<String, String>();
	static HashMap<String, String> i46 = new HashMap<String, String>();
	static HashMap<String, String> i47 = new HashMap<String, String>();
	static HashMap<String, String> i48 = new HashMap<String, String>();
	static HashMap<String, String> i49 = new HashMap<String, String>();
	
	
	public void readFile() throws IOException{
		RandomAccessFile raf1 = new RandomAccessFile("features.txt","r");
		RandomAccessFile raf2 = new RandomAccessFile("featurelist.txt","r");
		String s= "";
		String s1 ="";
		String s2 ="";
		String temp="";
		int i=1;
		while((s=raf1.readLine())!=null){
			i=1;
			String index = s.split(" ")[0];
			//System.out.println("Getting features for user:" + index);
			while((s2=raf2.readLine())!=null){
				if(s.indexOf(s2) > 0){
					
					temp = s2.concat(";");
					//System.out.println(temp);
					s1=s.split(temp)[1];
					s1=s1.split(" ")[0];
					System.out.println(" Index = " + index + " value = " + s1 + " i= " + i);
					//System.out.println(s1 + " i = " + i);
				switch (i) {
				
				case 1:
					i1.put(index, s1);
					continue;

				case 2:
					i2.put(index, s1);
					continue;
					
				case 3:
					i3.put(index, s1);
					continue;
					
				case 4:
					i4.put(index, s1);
					continue;
					
				case 5:
					i5.put(index, s1);
					continue;
					
				case 6:
					i6.put(index, s1);
					continue;
					
				case 7:
					i7.put(index, s1);
					continue;
					
				case 8:
					i8.put(index, s1);
					continue;
					
				case 9:
					i9.put(index, s1);
					continue;
					
				case 10:
					i10.put(index, s1);
					continue;
					
				case 11:
					i11.put(index, s1);
					continue;
					
				case 12:
					i12.put(index, s1);
					continue;
					
				case 13:
					i13.put(index, s1);
					continue;
					
				case 14:
					i14.put(index, s1);
					continue;
					
				case 15:
					i15.put(index, s1);
					continue;
					
				case 16:
					i16.put(index, s1);
					continue;
					
				case 17:
					i17.put(index, s1);
					continue;
					
				case 18:
					i18.put(index, s1);
					continue;
					
				case 19:
					i19.put(index, s1);
					continue;
					
				case 20:
					i20.put(index, s1);
					continue;
					
				case 21:
					i21.put(index, s1);
					continue;
					
				case 22:
					i22.put(index, s1);
					continue;
					
				case 23:
					i23.put(index, s1);
					continue;
					
				case 24:
					i24.put(index, s1);
					continue;
					
				case 25:
					i25.put(index, s1);
					continue;
				case 26:
					i26.put(index, s1);
					continue;
					
				case 27:
					i27.put(index, s1);
					continue;
					
				case 28:
					i28.put(index, s1);
					continue;
					
				case 29:
					i29.put(index, s1);
					continue;
					
				case 30:
					i30.put(index, s1);
					continue;
					
				case 31:
					i31.put(index, s1);
					continue;
					
				case 32:
					i32.put(index, s1);
					continue;
					
				case 33:
					i33.put(index, s1);
					continue;
					
				case 34:
					i34.put(index, s1);
					continue;
					
				case 35:
					i35.put(index, s1);
					continue;
					
				case 36:
					i36.put(index, s1);
					continue;
					
				case 37:
					i37.put(index, s1);
					continue;
					
				case 38:
					i38.put(index, s1);
					continue;
					
				case 39:
					i39.put(index, s1);
					continue;
					
				case 40:
					i40.put(index, s1);
					continue;
					
				case 41:
					i41.put(index, s1);
					continue;
					
				case 42:
					i42.put(index, s1);
					continue;
					
				case 43:
					i43.put(index, s1);
					continue;
					
				case 44:
					i44.put(index, s1);
					continue;
					
				case 45:
					i45.put(index, s1);
					continue;
					
				case 46:
					i46.put(index, s1);
					continue;
					
				case 47:
					i47.put(index, s1);
					continue;
					
				case 48:
					i48.put(index, s1);
					continue;
					
				case 49:
					i49.put(index, s1);
					continue;
					
				default:
					continue;
	
				}
									
				}
				i=i+1;
			}
			i=1;
			//raf2.close();	
		}
		
		
	}
	
	
	public static void main(String args[]) throws IOException{
		similarityWeights sw = new similarityWeights();
		sw.readFile();
		System.out.println(i26.entrySet());
	}
}