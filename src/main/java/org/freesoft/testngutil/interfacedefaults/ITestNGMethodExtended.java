package org.freesoft.testngutil.interfacedefaults;

import org.testng.IClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestClass;
import org.testng.ITestNGMethod;
import org.testng.internal.ConstructorOrMethod;
import org.testng.xml.XmlTest;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public interface ITestNGMethodExtended extends ITestNGMethod {
    @Override
    default Class getRealClass() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestClass getTestClass() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setTestClass(ITestClass cls) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getMethodName() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Object getInstance() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default long[] getInstanceHashCodes() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String[] getGroups() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String[] getGroupsDependedUpon() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getMissingGroup() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setMissingGroup(String group) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String[] getBeforeGroups() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String[] getAfterGroups() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String[] getMethodsDependedUpon() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void addMethodDependedUpon(String methodName) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isTest() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isBeforeMethodConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isAfterMethodConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isBeforeClassConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isAfterClassConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isBeforeSuiteConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isAfterSuiteConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isBeforeTestConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isAfterTestConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isBeforeGroupsConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isAfterGroupsConfiguration() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default long getTimeOut() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setTimeOut(long timeOut) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default int getInvocationCount() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setInvocationCount(int count) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default int getSuccessPercentage() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getId() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setId(String id) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default long getDate() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setDate(long date) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean canRunFromClass(IClass testClass) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean isAlwaysRun() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default int getThreadPoolSize() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setThreadPoolSize(int threadPoolSize) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean getEnabled() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getDescription() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setDescription(String description) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void incrementCurrentInvocationCount() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default int getCurrentInvocationCount() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setParameterInvocationCount(int n) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default int getParameterInvocationCount() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setMoreInvocationChecker(Callable<Boolean> moreInvocationChecker) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean hasMoreInvocation() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod clone() {
        throw new UnsupportedOperationException("not supported");
    }

    @Deprecated
    @Override
    default IRetryAnalyzer getRetryAnalyzer() {
        throw new UnsupportedOperationException("not supported");
    }

    @Deprecated
    @Override
    default void setRetryAnalyzer(IRetryAnalyzer retryAnalyzer) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean skipFailedInvocations() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setSkipFailedInvocations(boolean skip) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default long getInvocationTimeOut() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default boolean ignoreMissingDependencies() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setIgnoreMissingDependencies(boolean ignore) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default List<Integer> getInvocationNumbers() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setInvocationNumbers(List<Integer> numbers) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void addFailedInvocationNumber(int number) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default List<Integer> getFailedInvocationNumbers() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default int getPriority() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setPriority(int priority) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default int getInterceptedPriority() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setInterceptedPriority(int priority) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default XmlTest getXmlTest() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ConstructorOrMethod getConstructorOrMethod() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Map<String, String> findMethodParameters(XmlTest test) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getQualifiedName() {
        throw new UnsupportedOperationException("not supported");
    }
}
