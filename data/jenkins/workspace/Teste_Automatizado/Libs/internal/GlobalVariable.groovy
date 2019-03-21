package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object api
     
    /**
     * <p></p>
     */
    public static Object encrypted_password
     
    /**
     * <p></p>
     */
    public static Object authorization
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['username' : 'demo@katalon.com', 'password' : 'sPiHQ&YEa6ST`de+', 'api' : 'VBncetOSO70E4NVLYQnh9B2D', 'encrypted_password' : 'KLAk0b2rAgvA1EV7zgpKiS/uV+5nc48Y', 'authorization' : 'Basic ZGVtb0BrYXRhbG9uLmNvbTpWQm5jZXRPU083MEU0TlZMWVFuaDlCMkQ='])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        username = selectedVariables["username"]
        password = selectedVariables["password"]
        api = selectedVariables["api"]
        encrypted_password = selectedVariables["encrypted_password"]
        authorization = selectedVariables["authorization"]
        
    }
}
