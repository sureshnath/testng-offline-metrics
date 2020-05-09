package org.freesoft.testngutil.xmlresult;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github.testng.MetricsListener;
import lombok.SneakyThrows;
import lombok.extern.slf4j.XSlf4j;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.freesoft.testngutil.pojo.TestngResults;
import org.freesoft.testngutil.xmlresult.implobjects.SuiteImpl;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.File;
import java.nio.file.Path;
import java.util.Objects;

@XSlf4j
@Command(description = "Generates TESTNG Metrics from target/surefire-reports/testng-results.xml " +
        "to target/surefire-reports/testng-metrics.html")
public class GenerateMetricsFromTestNGResultsXML {

    @Option(names = {"-id", "--input-files-directory"}, defaultValue = "target/surefire-reports")
    File inputFilesDirectory;

    @Option(names = {"-p", "--input-filename-pattern"}, defaultValue = "testng-results.xml")
    IOFileFilter inputFileNamePattern;

    @Option(names = {"-f", "--output-file-name"}, defaultValue = "target/surefire-reports/testng-metrics.html")
    Path outputFileName;

    @SneakyThrows
    public static void main(String[] args) {
        log.entry();

        GenerateMetricsFromTestNGResultsXML app = new GenerateMetricsFromTestNGResultsXML();
        CommandLine commandLine = new CommandLine(app);
        commandLine.registerConverter(IOFileFilter.class, WildcardFileFilter::new);
        commandLine.parseArgs(args);
        log.info("Arguments inputFilesdirectory: {}, input-file-pattern:{}, output-file:{}"
                , app.inputFilesDirectory, app.inputFileNamePattern, app.outputFileName);
        Objects.requireNonNull(app.inputFilesDirectory, "Input directory must be present");
        log.info("Files are searched in folder - {}", app.inputFilesDirectory.getAbsolutePath());
        SuiteImpl suite = new SuiteImpl();
        XmlMapper mapper = new XmlMapper();
        for (File resultXMLFile : FileUtils.listFiles(app.inputFilesDirectory,app.inputFileNamePattern,null)
        ) {
            log.info("Reading statistics from {}", resultXMLFile);
            TestngResults results = mapper.readValue(resultXMLFile, TestngResults.class);
            suite.addSuites(results.getSuite());
        }
        MetricsListener listener = new MetricsListener();
        listener.generateReport(null, suite.getSingleSuiteList(), app.outputFileName.toAbsolutePath().getParent().toFile().getAbsolutePath());
    }
}
