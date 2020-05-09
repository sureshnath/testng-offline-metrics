package org.freesoft.testngutil.interfacedefaults;

import org.testng.ITestClass;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlTest;

public interface ITestClassExtended extends ITestClass {
    @Override
    default ITestNGMethod[] getTestMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getBeforeTestMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getAfterTestMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getBeforeClassMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getAfterClassMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getBeforeSuiteMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getAfterSuiteMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getBeforeTestConfigurationMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getAfterTestConfigurationMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getBeforeGroupsMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getAfterGroupsMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getName() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default XmlTest getXmlTest() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default XmlClass getXmlClass() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getTestName() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Class<?> getRealClass() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Object[] getInstances(boolean create) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default long[] getInstanceHashCodes() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void addInstance(Object instance) {
        throw new UnsupportedOperationException("not supported");
    }
}
