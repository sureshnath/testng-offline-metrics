package org.freesoft.testngutil.xmlresult.implobjects;

import org.freesoft.testngutil.interfacedefaults.IResultMapExtended;
import org.freesoft.testngutil.interfacedefaults.ITestContextExtended;
import org.freesoft.testngutil.pojo.TestngResults;
import org.testng.IResultMap;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.*;
import java.util.stream.Collectors;

public class TestContextImpl implements ITestContextExtended {

    private final Date startTime = new Date();
    private Date endTime = startTime;
    private List<TestMethodImpl> testMethodList = new ArrayList<>();

    public void addAll(TestngResults.ClassDetail classDetail){
        final ClassImpl classImpl = new ClassImpl(classDetail);
        classDetail.getTestMethodList().forEach(testMethod -> {
            testMethodList.add(new TestMethodImpl(classImpl, testMethod));
            endTime = new Date(endTime.getTime()+testMethod.getDurationMillis());
        });
    }

    private static class ResultMap implements IResultMapExtended {
        Set<TestMethodImpl> testResults;

        public ResultMap(Set<TestMethodImpl> testResults) {
            this.testResults = testResults;
        }

        @Override
        public Set<ITestResult> getAllResults() {
            return new HashSet<>(testResults);
        }

        @Override
        public Collection<ITestNGMethod> getAllMethods() {
            return new ArrayList<>(testResults);
        }

        @Override
        public int size() {
            return testResults.size();
        }
    }

    @Override
    public Date getStartDate() {
        return startTime;
    }

    @Override
    public Date getEndDate() {
        return endTime;
    }

    @Override
    public IResultMap getPassedTests() {
        return new ResultMap(testMethodList.stream().filter(TestMethodImpl::isPassedTest).collect(Collectors.toSet()));
    }

    @Override
    public IResultMap getSkippedTests() {
        return new ResultMap(testMethodList.stream().filter(TestMethodImpl::isSkippedTest).collect(Collectors.toSet()));
    }
    @Override
    public IResultMap getFailedTests() {
        return new ResultMap(testMethodList.stream().filter(TestMethodImpl::isFailedTest).collect(Collectors.toSet()));
    }

    @Override
    public IResultMap getPassedConfigurations() {
        return new ResultMap(testMethodList.stream().filter(TestMethodImpl::isPassedConfiguration).collect(Collectors.toSet()));
    }

    @Override
    public IResultMap getSkippedConfigurations() {
        return new ResultMap(testMethodList.stream().filter(TestMethodImpl::isSkippedConfiguration).collect(Collectors.toSet()));
    }

    @Override
    public IResultMap getFailedConfigurations() {
        return new ResultMap(testMethodList.stream().filter(TestMethodImpl::isFailedConfiguration).collect(Collectors.toSet()));
    }

    @Override
    public Collection<ITestNGMethod> getExcludedMethods() {
        return Collections.emptyList();
    }

    @Override
    public IResultMap getFailedButWithinSuccessPercentageTests() {
        return new ResultMap(Collections.emptySet());
    }
}
