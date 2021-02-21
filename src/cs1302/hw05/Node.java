package cs1302.hw05;

/**
 * A node for an item in a linked data structure. Each node contains a string
 * item and may refer to another node in the structure (known as the
 * "next" node).
 *
 * ***** DO NOT MODIFY THIS FILE. ******
 */
public class Node {

    private String item;
    private Node next;

    /**
     * Construct a node with the specified {@code item} and {@code next}.
     * @param item the item to be contained in this node
     * @param next the next node in the stnructure
     */
    public Node(String item, Node next) {
        setItem(item);
        setNext(next);
    } // Node

    /**
     * Construct a node with the specified {@code item} but no next node.
     * @param item the item to be contained in this node
     */
    public Node(String item) {
        this(item, null);
    } // Node

    /**
     * Returns the item in this node.
     * @return the item in this node
     */
    public String getItem() {
        return item;
    } // getItem

    /**
     * Sets the item in this node.
     * @param item the item in this node
     */
    public void setItem(String item) {
        this.item = item;
    } // setItem

    /**
     * Returns the next node.
     * @return the next in this node, if available; otherwise, {@code null}
     */
    public Node getNext() {
        return next;
    } // getNext

    /**
     * Sets the next node.
     * @param next the next node
     */
    public void setNext(Node next) {
        this.next = next;
    } // setNext

    /**
     * Returns {@code true} when the next node is set.
     * @return {@code true} when the next node is set; {@code false} otherwise
     */
    public boolean hasNext() {
        return this.next != null;
    } // hasNext

} // Node
