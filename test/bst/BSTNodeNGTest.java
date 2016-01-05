/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bst;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Maajid
 */
public class BSTNodeNGTest {
    
    public BSTNodeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of setLeft method, of class BSTNode.
     */
    @Test
    public void testSetLeft() {
        System.out.println("setLeft");
        BSTNode n = null;
        BSTNode instance = new BSTNode();
        instance.setLeft(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRight method, of class BSTNode.
     */
    @Test
    public void testSetRight() {
        System.out.println("setRight");
        BSTNode n = null;
        BSTNode instance = new BSTNode();
        instance.setRight(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeft method, of class BSTNode.
     */
    @Test
    public void testGetLeft() {
        System.out.println("getLeft");
        BSTNode instance = new BSTNode();
        BSTNode expResult = null;
        BSTNode result = instance.getLeft();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRight method, of class BSTNode.
     */
    @Test
    public void testGetRight() {
        System.out.println("getRight");
        BSTNode instance = new BSTNode();
        BSTNode expResult = null;
        BSTNode result = instance.getRight();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class BSTNode.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        int d = 0;
        BSTNode instance = new BSTNode();
        instance.setData(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class BSTNode.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        BSTNode instance = new BSTNode();
        int expResult = 0;
        int result = instance.getData();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
