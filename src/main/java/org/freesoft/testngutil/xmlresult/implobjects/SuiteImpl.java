package org.freesoft.testngutil.xmlresult.implobjects;

import com.google.common.collect.ImmutableMap;
import org.freesoft.testngutil.interfacedefaults.ISuiteAndISuiteResultExtended;
import org.freesoft.testngutil.pojo.TestngResults;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.collections.Lists;

import java.util.*;

public class SuiteImpl implements ISuiteAndISuiteResultExtended {
    private List<TestngResults.Suite> suites = new ArrayList<>();
    private TestContextImpl testContext = new TestContextImpl();

    public void addSuites(List<TestngResults.Suite> suites){
        this.suites.addAll(suites);

        suites.forEach(suite -> suite.getTest().forEach(test->{
            test.getClassDetailList().forEach(testContext::addAll);
        }));
    }

    public List<ISuite> getSingleSuiteList() {
        return Lists.newArrayList(this);
    }

    @Override
    public String getName() {
        return "Merged suite";
    }

    @Override
    public Map<String, ISuiteResult> getResults() {
        return ImmutableMap.of("merged", this);
    }

    @Override
    public ITestContext getTestContext() {
        return this.testContext;
    }

}
