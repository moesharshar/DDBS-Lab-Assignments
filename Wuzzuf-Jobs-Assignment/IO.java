import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
    public static List<JobDetails> ReadCsvFile(String fileName) {
        List<JobDetails> Jobs=new ArrayList<JobDetails>();
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(fileName));
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				String[] attributes = line.split(",");
				if (attributes[0].toLowerCase().equals("title")) {
                    continue;
                } else {
                    JobDetails JDObject = createJob(attributes);
                    Jobs.add(JDObject);
                }
			}
		}
		catch (IOException e) {
            e.printStackTrace();
        }
        return Jobs;
    }
	
	private static JobDetails createJob(String[] metadata) {
        String jobTitle = metadata[0];
        String company = metadata[1];
        String location = metadata[2];
        String type = metadata[3];
        String level = metadata[4];
        String yrsExp = metadata[5];
        String country = metadata[6];
        String skills = metadata[7];
       
        return new JobDetails(jobTitle, company, location, type, level, yrsExp, country, skills);
    }
}