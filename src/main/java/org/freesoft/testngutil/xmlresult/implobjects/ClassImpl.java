package org.freesoft.testngutil.xmlresult.implobjects;

import org.freesoft.testngutil.interfacedefaults.ITestClassExtended;
import org.freesoft.testngutil.pojo.TestngResults.ClassDetail;

public class ClassImpl implements ITestClassExtended {
    private ClassDetail classDetail;

    public ClassImpl(ClassDetail classDetail) {
        this.classDetail = classDetail;
    }

    @Override
    public String getName() {
        return classDetail.getName();
    }

}
