package com.fedorov.sudoku;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest extends TestCase
{
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /*
    public void testSingleMissing()
    {
        var a = new int[] { 1, 2, 3 };
        var b = new int[] { 4, 5, 6 };
        var c = new int[] { 7, 8 };
        App.getOptions( );
    }
     */
}
