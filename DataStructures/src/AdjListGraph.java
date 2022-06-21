import java.util.HashMap;
import java.util.List;

public class AdjListGraph<V> {

	private class Vertex{
		private HashMap<Vertex, List<Vertex>> adjacentVertices;
		private V data;
		
		public Vertex(V data) {
			this.data = data;
			adjacentVertices = new HashMap<>();
		}
	}
	
	
	
}
