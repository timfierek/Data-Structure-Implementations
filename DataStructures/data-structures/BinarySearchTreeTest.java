import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	@Test
	void testConstructor1() {
		BinarySearchTree testTree = new BinarySearchTree();
		
		int expected = 0;
		int actual = testTree.getSize();
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testInsert1() {
		BinarySearchTree testTree = new BinarySearchTree();
		
		boolean expected = true;
		boolean actual = testTree.insert(0);
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testInsert2() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(4);
		testTree.insert(3);
		
		boolean expected = true;
		boolean actual = testTree.insert(5);
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testInsert3() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(3);
		testTree.insert(4);
		
		boolean expected = true;
		boolean actual = testTree.insert(2);
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testInsert4() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(3);
		
		boolean expected = false;
		boolean actual = testTree.insert(3);
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testInsert5() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(3);
		testTree.insert(4);
		testTree.insert(6);
		
		int expected = 3;
		int actual = testTree.getSize();
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testInsert6() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(3);
		testTree.insert(4);
		testTree.insert(4);
		
		int expected = 2;
		int actual = testTree.getSize();
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testContains1() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(3);
		testTree.insert(4);
		
		boolean expected = true;
		boolean actual = testTree.contains(3);
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testContains2() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(3);
		testTree.insert(4);
		testTree.insert(2);
		testTree.insert(1);
		testTree.insert(5);
		
		boolean expected = true;
		boolean actual = testTree.contains(1);
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testContains3() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(3);
		testTree.insert(4);
		testTree.insert(2);
		testTree.insert(1);
		testTree.insert(5);
		
		boolean expected = false;
		boolean actual = testTree.contains(6);
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testInorder1() {
		BinarySearchTree testTree = new BinarySearchTree();
		
		String expected = "";
		String actual = testTree.inorderString();
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testInorder2() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(4);
		
		String expected = "4";
		String actual = testTree.inorderString();
		
		assertEquals(expected,actual);
	}
	
	@Test
	void testInorder3() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(3);
		testTree.insert(4);
		testTree.insert(2);
		testTree.insert(1);
		testTree.insert(5);
		
		String expected = "1 2 3 4 5";
		String actual = testTree.inorderString();
		
		assertEquals(expected,actual);
	}

	@Test
	void testInorder4() {
		BinarySearchTree testTree = new BinarySearchTree();
		testTree.insert(5);
		testTree.insert(16);
		testTree.insert(3);
		testTree.insert(4);
		testTree.insert(10);
		
		String expected = "3 4 5 10 16";
		String actual = testTree.inorderString();
		
		assertEquals(expected,actual);
	}
}
