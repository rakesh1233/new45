package reuseablePackage.feature;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.json.XML;
public class xmlTojsonConversion {
	public static void main(String[] args) throws Exception {
		int PRETTY_PRINT_INDENT_FACTOR = 10;
		System.out.println("Started converting xml report to Json");
		//String xmlFile = "C:\\Users\\shivakanti\\Desktop\\Java\\viewResultTree.xml";
		String xmlFile = args[0];
		System.out.println(args[0]);
		System.out.println(args[1]);
		String xmlString = new String(Files.readAllBytes(Paths.get(xmlFile)));
		JSONObject xmlJSONObj = XML.toJSONObject(xmlString);
		//System.out.println(xmlJSONObj);
		//String jsonFile ="C:\\Users\\shivakanti\\Desktop\\Java\\viewResultTree.json";
		String jsonFile =args[1];
		try (FileWriter fileWriter = new FileWriter(jsonFile)){
		fileWriter.write(xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR));

		System.out.println("Successfully converted xml report to Json");
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}

	}

}





