package org.freesoft.testngutil.xmlresult.implobjects;

import org.freesoft.testngutil.interfacedefaults.ITestNGMethodExtended;
import org.freesoft.testngutil.interfacedefaults.ITestResultExtended;
import org.freesoft.testngutil.pojo.TestngResults.TestMethod;
import org.testng.ITestClass;
import org.testng.ITestNGMethod;

import java.util.Objects;
import java.util.Optional;

public class TestMethodImpl implements ITestResultExtended, ITestNGMethodExtended {
    private final ClassImpl aClass;
    private final TestMethod testMethod;

    public TestMethodImpl(ClassImpl aClass, TestMethod testMethod){
        this.aClass = aClass;
        this.testMethod = testMethod;
        Objects.requireNonNull(this.testMethod);
    }
    @Override
    public int getStatus() {
        if ("PASS".equals(testMethod.getStatus())){
            return 1;
        }else if ("FAIL".equals(testMethod.getStatus())){
            return 2;
        }if ("SKIP".equals(testMethod.getStatus())){
            return 3;
        }
        return -1;
    }
    @Override
    public ITestNGMethod getMethod() {
        return this;
    }

    @Override
    public ITestClass getTestClass() {
        return this.aClass;
    }

    @Override
    public Throwable getThrowable() {
        return Optional.ofNullable(this.testMethod.getException())
                .map(e->new Throwable(e.getMessage())).orElse(null);
    }
    @Override
    public long getStartMillis() {
        return 0;
    }

    @Override
    public long getEndMillis() {
        return this.testMethod.getDurationMillis();
    }

    @Override
    public String getMethodName() {
        return this.testMethod.getName();
    }

    @Override
    public boolean isTest() {
        return !"true".equalsIgnoreCase(testMethod.getIsConfig());
    }

    public boolean isPassedTest() {
        return isTest() && getStatus()==1;
    }
    public boolean isFailedTest() {
        return isTest() && getStatus()==2;
    }
    public boolean isSkippedTest() {
        return isTest() && getStatus()==3;
    }
    public boolean isPassedConfiguration() {
        return !isTest() && getStatus()==1;
    }
    public boolean isFailedConfiguration() {
        return !isTest() && getStatus()==2;
    }
    public boolean isSkippedConfiguration() {
        return !isTest() && getStatus()==3;
    }

    @Override
    public Object[] getParameters() {
        return new Object[0];
    }

    @Override
    public Object getInstance() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public ITestNGMethod clone() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public Object getAttribute(String name) {
        return null;
    }
}
