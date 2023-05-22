package datastructure;

import java.util.ArrayList;
import java.util.List;

public class Node {

    char value;
    boolean isTerminating;
    List<Node> children;

    public Node(char value) {
        this.value = value;
        this.isTerminating = false;
        this.children = new ArrayList<>();
    }
}
