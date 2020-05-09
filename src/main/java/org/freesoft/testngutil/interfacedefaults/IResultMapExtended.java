package org.freesoft.testngutil.interfacedefaults;

import org.testng.IResultMap;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.Collection;
import java.util.Set;

public interface IResultMapExtended extends IResultMap {
    @Override
    default void addResult(ITestResult result, ITestNGMethod method) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Set<ITestResult> getResults(ITestNGMethod method) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Set<ITestResult> getAllResults() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void removeResult(ITestNGMethod m) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default void removeResult(ITestResult r) {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default Collection<ITestNGMethod> getAllMethods() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    default int size() {
        throw new UnsupportedOperationException("not supported");
    }
}
