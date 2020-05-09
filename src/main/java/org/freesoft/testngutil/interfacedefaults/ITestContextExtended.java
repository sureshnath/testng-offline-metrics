package org.freesoft.testngutil.interfacedefaults;

import com.google.inject.Injector;
import com.google.inject.Module;
import org.testng.*;
import org.testng.xml.XmlTest;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface ITestContextExtended extends ITestContext {
    @Override
    default String getName() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Date getStartDate() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Date getEndDate() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IResultMap getPassedTests() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IResultMap getSkippedTests() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IResultMap getFailedButWithinSuccessPercentageTests() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IResultMap getFailedTests() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String[] getIncludedGroups() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String[] getExcludedGroups() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getOutputDirectory() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ISuite getSuite() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestNGMethod[] getAllTestMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getHost() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Collection<ITestNGMethod> getExcludedMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IResultMap getPassedConfigurations() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IResultMap getSkippedConfigurations() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IResultMap getFailedConfigurations() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default XmlTest getCurrentXmlTest() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default List<Module> getGuiceModules(Class<? extends Module> cls) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Injector getInjector(List<Module> moduleInstances) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Injector getInjector(IClass iClass) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void addInjector(List<Module> moduleInstances, Injector injector) {
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
