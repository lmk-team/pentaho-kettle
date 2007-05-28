package org.pentaho.di;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.pentaho.di.core.RowSetTest;
import org.pentaho.di.core.database.DatabaseTest;
import org.pentaho.di.core.row.RowDataUtilTest;
import org.pentaho.di.core.row.RowTest;
import org.pentaho.di.core.row.ValueDataUtilTest;
import org.pentaho.di.trans.HopTest;
import org.pentaho.di.trans.steps.blockingstep.BlockingStepTest;
import org.pentaho.di.trans.steps.injector.InjectorTest;
import org.pentaho.di.trans.steps.rowgenerator.RowGeneratorTest;

import be.ibridge.kettle.trans.step.combinationlookup.CombinationLookupTest;

/**
 * Regression tests for the PDI framework.
 * 
 * @author sboden
 */
public class AllRegressionTests
{   
    public static Test suite() throws Exception
    {
        TestSuite suite = new TestSuite("Run regression tests");

        // Suggestion is to put the tests going from easy to hard functionality.
        // If the easy functionality doesn't work, chances are big the harder
        // functionality will also not work.
        suite.addTestSuite(RowSetTest.class);
        suite.addTestSuite(RowTest.class);
        suite.addTestSuite(RowDataUtilTest.class);
        suite.addTestSuite(ValueDataUtilTest.class);  
        suite.addTestSuite(DatabaseTest.class);
        suite.addTestSuite(HopTest.class);
        
        suite.addTestSuite(InjectorTest.class);
        suite.addTestSuite(RowGeneratorTest.class);
        suite.addTestSuite(BlockingStepTest.class);
        suite.addTestSuite(CombinationLookupTest.class);
        
        return suite;
    }
}