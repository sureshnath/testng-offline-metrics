package org.freesoft.testngutil.interfacedefaults;

import com.google.inject.Injector;
import org.testng.*;
import org.testng.internal.annotations.IAnnotationFinder;
import org.testng.xml.XmlSuite;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ISuiteAndISuiteResultExtended extends ISuite, ISuiteResult {
    @Override
    default String getName() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Map<String, ISuiteResult> getResults() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IObjectFactory getObjectFactory() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IObjectFactory2 getObjectFactory2() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getOutputDirectory() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getParallel() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getParentModule() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getGuiceStage() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getParameter(String parameterName) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Map<String, Collection<ITestNGMethod>> getMethodsByGroups() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default List<IInvokedMethod> getAllInvokedMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Collection<ITestNGMethod> getExcludedMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void run() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default String getHost() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default SuiteRunState getSuiteState() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default IAnnotationFinder getAnnotationFinder() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default XmlSuite getXmlSuite() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void addListener(ITestNGListener listener) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Injector getParentInjector() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void setParentInjector(Injector injector) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default List<ITestNGMethod> getAllMethods() {
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

    @Override
    default String getPropertyFileName() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default ITestContext getTestContext() {
        throw new UnsupportedOperationException("not supported");
    }
}
