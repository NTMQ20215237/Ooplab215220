package hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;
public class GarbageCreator {

	public static void main(String[] args)throws Exception {
		String filename = "C:\\Users\\84975\\eclipse-workspace\\OtherProjects\\src\\hust\\soict\\globalict\\garbage\\test"; //test.exe is a path or a name to an executable file
		byte[] inputBytes = {0};
		long startTime, endTime;
		
		inputBytes=Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		String outputString ="";
		for(byte b :inputBytes) {
			outputString+=(char)b;
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
				

	}

}