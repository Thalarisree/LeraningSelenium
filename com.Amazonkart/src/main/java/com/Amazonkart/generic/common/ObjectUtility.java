
package com.Amazonkart.generic.common;

import com.Amazonkart.generic.exelutility.ReadExcelFile;
import com.Amazonkart.generic.javautility.JavaUtility;
import com.Amazonkart.generic.propertyutility.ReadpropertyFile;
import com.Amazonkart.generic.webdriverutility.webDriverUtility;

public class ObjectUtility implements Frameworkconstant {

	public ReadExcelFile excelobj;
	public JavaUtility javaobj;
	public ReadpropertyFile propertyobj;
	public webDriverUtility webdriverobj;

	public void objectcreation() {
		excelobj = new ReadExcelFile();
		javaobj = new JavaUtility();
		propertyobj = new ReadpropertyFile();
		webdriverobj = new webDriverUtility();
	}

}
