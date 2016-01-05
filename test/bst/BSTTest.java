/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bst;

//import org.junit.After;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;

/**
 *
 * @author Maajid
 */
public class BSTTest {
    
    public BSTTest() {
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
     * Test of isEmpty method, of class BST.
     */
    @org.junit.Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BST instance = new BST();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class BST.
     */
    @org.junit.Test
    public void testInsert() {
        System.out.println("insert");
        int data = 0;
        BST instance = new BST();
        instance.insert(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class BST.
     */
    @org.junit.Test
    public void testDelete() {
        System.out.println("delete");
        int k = 0;
        BST instance = new BST();
        instance.delete(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countNodes method, of class BST.
     */
    @org.junit.Test
    public void testCountNodes() {
        System.out.println("countNodes");
        BST instance = new BST();
        int expResult = 0;
        int result = instance.countNodes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class BST.
     */
    @org.junit.Test
    public void testSearch() {
        System.out.println("search");
        int val = 0;
        BST instance = new BST();
        boolean expResult = false;
        boolean result = instance.search(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inorder method, of class BST.
     */
    @org.junit.Test
    public void testInorder() {
        System.out.println("inorder");
        BST instance = new BST();
        instance.inorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preorder method, of class BST.
     */
    @org.junit.Test
    public void testPreorder() {
        System.out.println("preorder");
        BST instance = new BST();
        instance.preorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postorder method, of class BST.
     */
    @org.junit.Test
    public void testPostorder() {
        System.out.println("postorder");
        BST instance = new BST();
        instance.postorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
