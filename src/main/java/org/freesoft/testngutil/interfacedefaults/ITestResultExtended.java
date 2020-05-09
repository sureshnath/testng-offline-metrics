package org.freesoft.testngutil.interfacedefaults;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.Set;

public interface ITestResultExtended extends ITestResult {
    @Override
    default int getStatus() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setStatus(int status) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod getMethod() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Object[] getParameters() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setParameters(Object[] parameters) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IClass getTestClass() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Throwable getThrowable() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setThrowable(Throwable throwable) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default long getStartMillis() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default long getEndMillis() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setEndMillis(long millis) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getName() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isSuccess() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getHost() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Object getInstance() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Object[] getFactoryParameters() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getTestName() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getInstanceName() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestContext getTestContext() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setTestName(String name) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean wasRetried() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setWasRetried(boolean wasRetried) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default int compareTo(ITestResult iTestResult) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Object getAttribute(String name) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setAttribute(String name, Object value) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Set<String> getAttributeNames() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Object removeAttribute(String name) {
        throw new UnsupportedOperationException("not supported");
    }
}
