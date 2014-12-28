package dataminingproject;
import java.io.*;
import java.util.*;

public class readFeatures2 {
	static HashMap<String, String> education_classes_description = new HashMap<String, String>();
	static HashMap<String, String> education_classes_from_id = new HashMap<String, String>();
	static HashMap<String, String> education_classes_from_name = new HashMap<String, String>();
	static HashMap<String, String> education_classes_id = new HashMap<String, String>();
	static HashMap<String, String> education_classes_name = new HashMap<String, String>();
	static HashMap<String, String> education_classes_with_id = new HashMap<String, String>();
	static HashMap<String, String> education_classes_with_name = new HashMap<String, String>();
	static HashMap<String, String> education_concentration_id = new HashMap<String, String>();
	static HashMap<String, String> education_concentration_name = new HashMap<String, String>();
	static HashMap<String, String> education_degree_id = new HashMap<String, String>();
	static HashMap<String, String> education_degree_name = new HashMap<String, String>();
	static HashMap<String, String> education_school_id = new HashMap<String, String>();
	static HashMap<String, String> education_school_name = new HashMap<String, String>();
	static HashMap<String, String> education_type = new HashMap<String, String>();
	static HashMap<String, String> education_with_id = new HashMap<String, String>();
	static HashMap<String, String> education_with_name = new HashMap<String, String>();
	static HashMap<String, String> education_year_id = new HashMap<String, String>();
	static HashMap<String, String> education_year_name = new HashMap<String, String>();
	static HashMap<String, String> hometown_id = new HashMap<String, String>();
	static HashMap<String, String> hometown_name = new HashMap<String, String>();
	static HashMap<String, String> languages_id = new HashMap<String, String>();
	static HashMap<String, String> languages_name = new HashMap<String, String>();
	static HashMap<String, String> locale = new HashMap<String, String>();
	static HashMap<String, String> location = new HashMap<String, String>();
	static HashMap<String, String> location_id = new HashMap<String, String>();
	static HashMap<String, String> location_name = new HashMap<String, String>();
	static HashMap<String, String> political = new HashMap<String, String>();
	static HashMap<String, String> religion = new HashMap<String, String>();
	static HashMap<String, String> work_description = new HashMap<String, String>();
	static HashMap<String, String> work_employer_id = new HashMap<String, String>();
	static HashMap<String, String> work_employer_name = new HashMap<String, String>();
	static HashMap<String, String> work_end_date = new HashMap<String, String>();
	static HashMap<String, String> work_from_id = new HashMap<String, String>();
	static HashMap<String, String> work_from_name = new HashMap<String, String>();
	static HashMap<String, String> work_location_id = new HashMap<String, String>();
	static HashMap<String, String> work_location_name = new HashMap<String, String>();
	static HashMap<String, String> work_position_id = new HashMap<String, String>();
	static HashMap<String, String> work_position_name = new HashMap<String, String>();
	static HashMap<String, String> work_projects_description = new HashMap<String, String>();
	static HashMap<String, String> work_projects_end_date = new HashMap<String, String>();
	static HashMap<String, String> work_projects_from_id = new HashMap<String, String>();
	static HashMap<String, String> work_projects_from_name = new HashMap<String, String>();
	static HashMap<String, String> work_projects_id = new HashMap<String, String>();
	static HashMap<String, String> work_projects_name = new HashMap<String, String>();
	static HashMap<String, String> work_projects_start_date = new HashMap<String, String>();
	static HashMap<String, String> work_projects_with_id = new HashMap<String, String>();
	static HashMap<String, String> work_projects_with_name = new HashMap<String, String>();
	static HashMap<String, String> work_start_date = new HashMap<String, String>();
	static HashMap<String, String> work_with_id = new HashMap<String, String>();
	static HashMap<String, String> work_with_name = new HashMap<String, String>();

	
	public void readFeatureFile1() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("features.txt","r");
		String s = "";
		String s1="";
		while((s=raf.readLine())!=null){
		String index = s.split(" ")[0];
		System.out.println("Getting features for user:" + index);

		if(s.indexOf("education;classes;description") > 0){
			s1=s.split("education;classes;description;")[1];
			s1=s1.split(" ")[0];
			education_classes_description.put(index, s1);
			//System.out.println("Index : "+index + " Gender: " + indexGender.get(index));
		}
		if(s.indexOf("education;classes;from;id") > 0){
			s1=s.split("education;classes;from;id;")[1];
			s1=s1.split(" ")[0];
			education_classes_from_id.put(index, s1);
			//System.out.println("Index : "+index + " School: " + indexSchool.get(index));
		}
		if(s.indexOf("education;classes;from;name") > 0){
			s1=s.split("education;classes;from;name;")[1];
			s1=s1.split(" ")[0];
			education_classes_from_name.put(index, s1);
			//System.out.println("Index : "+index + " Locale: " + indexLocale.get(index));
		}
		if(s.indexOf("education;classes;id") > 0){
			s1=s.split("education;classes;id;")[1];
			s1=s1.split(" ")[0];
			education_classes_id.put(index, s1);
			//System.out.println("Index : "+index + " Hometown id: " + indexHometown.get(index));
		}
		if(s.indexOf("education;classes;name") > 0){
			s1=s.split("education;classes;name;")[1];
			s1=s1.split(" ")[0];
			education_classes_name.put(index, s1);
			//System.out.println("Index : "+index + " Gender: " + indexLocation.get(index));
		}
		if(s.indexOf("education_classes_with_id") > 0){
			s1=s.split("education;classes;with;id;")[1];
			s1=s1.split(" ")[0];
			education_classes_with_id.put(index, s1);
			//System.out.println("Index : "+index + " Language: " + indexLanguage.get(index));
		}
		if(s.indexOf("education_classes_with;name") > 0){
			s1=s.split("education_classes_with;name;")[1];
			s1=s1.split(" ")[0];
			education_classes_with_name.put(index, s1);
			//System.out.println("Index : "+index + " Education Type: " + indexEducationType.get(index));
		}
		if(s.indexOf("education;concentration;id") > 0){
			s1=s.split("education;concentration;id;")[1];
			s1=s1.split(" ")[0];
			education_concentration_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Location: " + indexWorkLocation.get(index));
		}
		if(s.indexOf("education;concentration;name") > 0){
			s1=s.split("education;concentration;name;")[1];
			s1=s1.split(" ")[0];
			education_concentration_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		
		
		if(s.indexOf("education;degree;id") > 0){
			s1=s.split("education;degree;id;")[1];
			s1=s1.split(" ")[0];
			education_degree_id.put(index, s1);
			//System.out.println("Index : "+index + " Gender: " + indexGender.get(index));
		}
		if(s.indexOf("education;degree;name") > 0){
			s1=s.split("education;degree;name;")[1];
			s1=s1.split(" ")[0];
			education_degree_name.put(index, s1);
			//System.out.println("Index : "+index + " School: " + indexSchool.get(index));
		}
		if(s.indexOf("education;school;id") > 0){
			s1=s.split("education;school;id;")[1];
			s1=s1.split(" ")[0];
			education_school_id.put(index, s1);
			//System.out.println("Index : "+index + " Locale: " + indexLocale.get(index));
		}
		if(s.indexOf("education;school;name") > 0){
			s1=s.split("education;school;name;")[1];
			s1=s1.split(" ")[0];
			education_school_name.put(index, s1);
			//System.out.println("Index : "+index + " Hometown id: " + indexHometown.get(index));
		}
		if(s.indexOf("education;type") > 0){
			s1=s.split("education;type;")[1];
			s1=s1.split(" ")[0];
			education_type.put(index, s1);
			//System.out.println("Index : "+index + " Gender: " + indexLocation.get(index));
		}
		if(s.indexOf("education;with;id") > 0){
			s1=s.split("education;with;id;")[1];
			s1=s1.split(" ")[0];
			education_with_id.put(index, s1);
			//System.out.println("Index : "+index + " Language: " + indexLanguage.get(index));
		}
		if(s.indexOf("education;with;name") > 0){
			s1=s.split("education;with;name;")[1];
			s1=s1.split(" ")[0];
			education_with_name.put(index, s1);
			//System.out.println("Index : "+index + " Education Type: " + indexEducationType.get(index));
		}
		if(s.indexOf("education;year;id") > 0){
			s1=s.split("education;year;id;")[1];
			s1=s1.split(" ")[0];
			education_year_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Location: " + indexWorkLocation.get(index));
		}
		if(s.indexOf("education;year;name") > 0){
			s1=s.split("education;year;name;")[1];
			s1=s1.split(" ")[0];
			education_year_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		
		
		
		if(s.indexOf("hometown;id") > 0){
			s1=s.split("hometown;id;")[1];
			s1=s1.split(" ")[0];
			hometown_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}

		if(s.indexOf("hometown;name") > 0){
			s1=s.split("hometown;name;")[1];
			s1=s1.split(" ")[0];
			hometown_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		
		if(s.indexOf("languages;id") > 0){
			s1=s.split("languages;id;")[1];
			s1=s1.split(" ")[0];
			languages_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		
		if(s.indexOf("languages;name") > 0){
			s1=s.split("languages;name;")[1];
			s1=s1.split(" ")[0];
			languages_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		
		if(s.indexOf("locale") > 0){
			s1=s.split("locale;")[1];
			s1=s1.split(" ")[0];
			locale.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		
		if(s.indexOf("location;id") > 0){
			s1=s.split("location;id;")[1];
			s1=s1.split(" ")[0];
			location_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("location") > 0){
			s1=s.split("location;")[1];
			s1=s1.split(" ")[0];
			location.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("location;name") > 0){
			s1=s.split("location;name;")[1];
			s1=s1.split(" ")[0];
			location_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("political") > 0){
			s1=s.split("political;")[1];
			s1=s1.split(" ")[0];
			political.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("religion") > 0){
			s1=s.split("religion;")[1];
			s1=s1.split(" ")[0];
			religion.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;description") > 0){
			s1=s.split("work;description;")[1];
			s1=s1.split(" ")[0];
			work_description.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;employer;id") > 0){
			s1=s.split("work;employer;id;")[1];
			s1=s1.split(" ")[0];
			work_employer_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;employer;name") > 0){
			s1=s.split("work;employer;name;")[1];
			s1=s1.split(" ")[0];
			work_employer_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;end_date") > 0){
			s1=s.split("work;end_date;")[1];
			s1=s1.split(" ")[0];
			work_end_date.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;from;id") > 0){
			s1=s.split("work;from;id;")[1];
			s1=s1.split(" ")[0];
			work_from_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;from;name") > 0){
			s1=s.split("work;from;name;")[1];
			s1=s1.split(" ")[0];
			work_from_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;location;id") > 0){
			s1=s.split("work;location;id;")[1];
			s1=s1.split(" ")[0];
			work_location_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;location;name") > 0){
			s1=s.split("work;location;name;")[1];
			s1=s1.split(" ")[0];
			work_location_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;position;id") > 0){
			s1=s.split("work;position;id;")[1];
			s1=s1.split(" ")[0];
			work_position_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;position;name") > 0){
			s1=s.split("work;position;name;")[1];
			s1=s1.split(" ")[0];
			work_position_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;projects;description") > 0){
			s1=s.split("work;projects;description;")[1];
			s1=s1.split(" ")[0];
			work_projects_description.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;projects;end_date") > 0){
			s1=s.split("work;projects;end_date;")[1];
			s1=s1.split(" ")[0];
			work_projects_end_date.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;projects;from;id") > 0){
			s1=s.split("work;projects;from;id;")[1];
			s1=s1.split(" ")[0];
			work_projects_from_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;projects;from;name") > 0){
			s1=s.split("work;projects;from;name;")[1];
			s1=s1.split(" ")[0];
			work_projects_from_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;projects;id") > 0){
			s1=s.split("work;projects;id;")[1];
			s1=s1.split(" ")[0];
			work_projects_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;projects;name") > 0){
			s1=s.split("work;projects;name;")[1];
			s1=s1.split(" ")[0];
			work_projects_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;projects;start_date") > 0){
			s1=s.split("work;projects;start_date;")[1];
			s1=s1.split(" ")[0];
			work_projects_start_date.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;projects;with;id") > 0){
			s1=s.split("work;projects;with;id;")[1];
			s1=s1.split(" ")[0];
			work_projects_with_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;projects;with;name") > 0){
			s1=s.split("work;projects;with;name;")[1];
			s1=s1.split(" ")[0];
			work_projects_with_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;start_date") > 0){
			s1=s.split("work;start_date;")[1];
			s1=s1.split(" ")[0];
			work_start_date.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;with;id") > 0){
			s1=s.split("work;with;id;")[1];
			s1=s1.split(" ")[0];
			work_with_id.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		if(s.indexOf("work;with;name") > 0){
			s1=s.split("work;with;name;")[1];
			s1=s1.split(" ")[0];
			work_with_name.put(index, s1);
			//System.out.println("Index : "+index + " Work Employer: " + indexWorkEmployer.get(index));
		}
		
			}
		
		raf.close();
	}
	
	public void readEgoNets1(String filename) throws IOException{
		
		RandomAccessFile raf = new RandomAccessFile("egonets/"+filename,"r");
		RandomAccessFile raf1 = new RandomAccessFile("euclidean2/"+filename,"rw");
		String ss="",temp="";
		String user_id="";
		double weight=0,weight1=0;
		while((ss=raf.readLine())!=null)
		{
		weight = 0;
		user_id = ss.split(": ")[0];
		try{
			temp =ss.split(": ")[1];}
		catch(Exception e){
			continue;
		}
		String[] friends = temp.split(" ");
		raf1.writeBytes(user_id + ": ");
		System.out.println("Calculating weights for: "+user_id);
		for(int i=0;i<friends.length;i++){
			weight=0;
			weight1=0;
			try{
				if((education_classes_description.get(user_id).compareTo((education_classes_description.get(friends[i])))==0) ){
					weight = weight + 0.02;
				}
			}
			catch(Exception e){}
			try{
			if(education_classes_from_id.get(user_id).compareTo(education_classes_from_id.get(friends[i]))==0){
				weight = weight + 0.02;
			}}
			catch(Exception e){}
			try{
			if(education_classes_from_name.get(user_id).compareTo(education_classes_from_name.get(friends[i]))==0){
				weight = weight + 0.02;
			}}
			catch(Exception e){}
			try{
			if(education_classes_id.get(user_id).compareTo(education_classes_id.get(friends[i]))==0){
				weight = weight + 0.02;
			}}
			catch(Exception e){}
			try{
			if(education_classes_name.get(user_id).compareTo(education_classes_name.get(friends[i]))==0){
				weight = weight + 0.02;
			}}
			catch(Exception e){}
			try{
			if(education_classes_with_id.get(user_id).compareTo(education_classes_with_id.get(friends[i]))==0){
				weight = weight + 0.02;
			}}
			catch(Exception e){}
			try{
			if(education_classes_with_name.get(user_id).compareTo(education_classes_with_name.get(friends[i]))==0){
				weight = weight + 0.02;
			}}
			catch(Exception e){}
			try{
			if(education_concentration_id.get(user_id).compareTo(education_concentration_id.get(friends[i]))==0){
				weight = weight + 0.02;
			}}
			catch(Exception e){}
			try{
			if(education_concentration_name.get(user_id).compareTo(education_concentration_name.get(friends[i]))==0){
				weight = weight + 0.02;
			}}
			catch(Exception e){}
			
			try{
				if(education_degree_id.get(user_id).compareTo(education_degree_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			
			try{
				if(education_degree_name.get(user_id).compareTo(education_degree_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			try{
				if(education_school_id.get(user_id).compareTo(education_school_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(education_school_name.get(user_id).compareTo(education_school_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(education_type.get(user_id).compareTo(education_type.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(education_with_id.get(user_id).compareTo(education_with_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(education_with_name.get(user_id).compareTo(education_with_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(education_year_id.get(user_id).compareTo(education_year_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(education_year_name.get(user_id).compareTo(education_year_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(hometown_id.get(user_id).compareTo(hometown_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(hometown_name.get(user_id).compareTo(hometown_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(languages_id.get(user_id).compareTo(languages_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(languages_name.get(user_id).compareTo(languages_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(locale.get(user_id).compareTo(locale.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(location.get(user_id).compareTo(location.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(location_id.get(user_id).compareTo(location_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(location_name.get(user_id).compareTo(location_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(political.get(user_id).compareTo(political.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(religion.get(user_id).compareTo(religion.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_description.get(user_id).compareTo(work_description.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_employer_id.get(user_id).compareTo(work_employer_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_employer_name.get(user_id).compareTo(work_employer_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_end_date.get(user_id).compareTo(work_end_date.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_from_id.get(user_id).compareTo(work_from_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_from_name.get(user_id).compareTo(work_from_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_location_id.get(user_id).compareTo(work_location_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_location_name.get(user_id).compareTo(work_location_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_position_id.get(user_id).compareTo(work_position_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			try{
				if(work_position_name.get(user_id).compareTo(work_position_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			try{
				if(work_projects_description.get(user_id).compareTo(work_projects_description.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			try{
				if(work_projects_end_date.get(user_id).compareTo(work_projects_end_date.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			try{
				if(work_projects_from_id.get(user_id).compareTo(work_projects_from_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			try{
				if(work_projects_from_name.get(user_id).compareTo(work_projects_from_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			try{
				if(work_projects_id.get(user_id).compareTo(work_projects_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			try{
				if(work_projects_name.get(user_id).compareTo(work_projects_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
			try{
				if(work_projects_start_date.get(user_id).compareTo(work_projects_start_date.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_projects_with_id.get(user_id).compareTo(work_projects_with_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_projects_with_name.get(user_id).compareTo(work_projects_with_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_start_date.get(user_id).compareTo(work_start_date.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_with_id.get(user_id).compareTo(work_with_id.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			try{
				if(work_with_name.get(user_id).compareTo(work_with_name.get(friends[i]))==0){
					weight = weight + 0.02;
				}}
				catch(Exception e){}
			
		if(weight == 0){
			raf1.writeBytes("Inf ");
		}
		else	
		{
			weight1 = 1 / weight; 
			raf1.writeBytes(weight1 + " ");
		}
		}
		raf1.writeBytes("\n");
			
		}
		raf.close();
		raf1.close();
	}
	
	public static void main(String args[]) throws IOException{
		readFeatures2 rF = new readFeatures2();
		rF.readFeatureFile1();
		File newfile = new File("egonets/");
		File[] lists = newfile.listFiles();
		Arrays.sort(lists);
		for(int i=0;i<lists.length;i++){
			rF.readEgoNets1(lists[i].getName());
		}
		
	}
}