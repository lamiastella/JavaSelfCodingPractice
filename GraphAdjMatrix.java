/**
 * Created by mona on 3/26/16.
 */

//TODO
    //toString: String representation of the graph
    //addVertex
    //getVertices
    //implement Graph using HashMap
public class GraphAdjMatrix {
    private boolean adjMatrix[][];
    private int vertexCount;

    public GraphAdjMatrix(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adjMatrix = new boolean[vertexCount][vertexCount];
    }

    public void addEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjMatrix[i][j] = true;
            adjMatrix[j][i] = true;
        }
    }

    public void removeEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
            adjMatrix[i][j] = false;
            adjMatrix[j][i] = false;
        }
    }

    public boolean isEdge(int i, int j) {
        if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount)
            return adjMatrix[i][j];
        else
            return false;
    }
}