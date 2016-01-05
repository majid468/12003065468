/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bst;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import static org.testng.Assert.fail;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.junit.Test;
/**
 *
 * @author Maajid
 */
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @BeforeMethod
    public void setUp() {
    }
    
    @AfterMethod
    public void tearDown() {
    }

    /**
     * Test of main method, of class BinarySearchTree.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BinarySearchTree.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
