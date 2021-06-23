package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String json) {

		File file = new File("D:\\RamCucumberClass\\CucumberReports");

		Configuration configuration = new Configuration(file, "Raam Project");

		configuration.addClassifications("Browser", "ChromeBrowser");
		configuration.addClassifications("Platform", "win-10");
		configuration.addClassifications("Sprint No", "20");
		configuration.addClassifications("Author", "Ram");

		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();

	}

}
