package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.snippets.Snippet;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\LoginPage.feature" }, glue = {
		"org.stepdef" }, dryRun = false, monochrome = true, plugin = { "pretty", "html:D:\\RamCucumberClass\\target",
				"json:D:\\RamCucumberClass\\target\\sample.json", "junit:D:\\RamCucumberClass\\target\\sample.xml",
				"json:D:\\\\RamCucumberClass\\\\CucumberReports\\\\ram.json" }, snippets = SnippetType.CAMELCASE, tags = {
						"@reg", "@smoke" })
// ANd operator
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		JVMReport.generateJVMReport("D:\\RamCucumberClass\\CucumberReports\\ram.json");
		System.out.println("Json Report");
		System.out.println("Html Report");
		System.out.println("XML Report");
		System.out.println("Cucumber JVM Repot");
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");
		System.out.println("F");

	}

}
