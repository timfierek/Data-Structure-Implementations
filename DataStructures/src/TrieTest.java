import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrieTest {

	@Test
	void testAddWordAndIsWord() {
		Trie testTrie = new Trie();
		testTrie.addWord("tim");
		
		boolean expected = true;
		boolean actual = testTrie.isWord("tim");
		
		assertEquals(expected, actual);
	}

}
