public class Rope {
    /* *** BEGIN: DO NOT TOUCH THIS PART *** */
    private class NotImplementedYetException extends RuntimeException {
    }

    private interface Tree {
        <T> T apply(Visitor<T> v);
    }

    private static class Node implements Tree {
        private final int length;
        private final Tree left;
        private final Tree right;

        private Node(Tree left, int length, Tree right) {
            this.left = left;
            this.right = right;
            this.length = length;
        }

        @Override
        public <T> T apply(Visitor<T> v) {
            return v.apply(this);
        }
    }

    private static class Leaf implements Tree {
        private final String string;
        private final int length;

        private Leaf(String string, int length) {
            this.string = string;
            this.length = length;
        }

        @Override
        public <T> T apply(Visitor<T> v) {
            return v.apply(this);
        }
    }

    private interface Visitor<T> {
        T apply(Node node);

        T apply(Leaf leaf);
    }

    private final Tree root;
    /* *** END: DO NOT TOUCH THIS PART *** */

    Rope(String initial) {
        if (initial == null) {
            throw new IllegalArgumentException();
        }
        root = new Leaf(initial, initial.length());
    }

    private Rope(Tree root) {
        this.root = root;
    }

    /**
     * O(lg n)
     *
     * @returns the length of all strings in the rope
     */
    int length() {
        return root.apply(new Visitor<>() {

            @Override
            public Integer apply(Node node) {
                return node.length + node.right.apply(this);
            }

            @Override
            public Integer apply(Leaf leaf) {
                return leaf.length;
            }
        });
    }

    /**
     * O(n)
     *
     * @returns the height of the tree
     */
    int rank() {
        throw new NotImplementedYetException();
    }

    /**
     * O(1)
     *
     * @returns a new rope with one rope after the other
     */
    Rope concat(Rope other) {
        throw new NotImplementedYetException();
    }

    /**
     * O(lg n)
     *
     * @returns the character at a position
     */
    public char charAt(int index) {
        throw new NotImplementedYetException();
    }

    /**
     * O(lg n)
     *
     * @returns two ropes split at a position
     */
    public Rope[] split(int index) {
        throw new NotImplementedYetException();
    }

    /**
     * O(lg n)
     *
     * @returns a new rope with a string inserted into the rope at a position
     */
    public Rope insert(String string, int index) {
        throw new NotImplementedYetException();
    }

    /**
     * O(lg n)
     *
     * @returns a new rope with a range deleted
     */
    public Rope delete(int start, int end) {
        throw new NotImplementedYetException();
    }

    /**
     * O(lg n)
     *
     * @returns a new rope containing a (sub-)range of the original a rope
     */
    public Rope subrope(int start, int end) {
        throw new NotImplementedYetException();
    }

    /**
     * O(n)
     *
     * @returns all the strings in the rope in order
     */
    @Override
    public String toString() {
        throw new NotImplementedYetException();
    }

    /**
     * O(n)
     *
     * @returns the first occurrence of a character in the rope
     */
    public char indexOf(char c) {
        throw new NotImplementedYetException();
    }

    /**
     * Difficult:
     * O(lg n)
     *
     * @returns a balanced tree if the two ropes are balanced
     */
    public Rope concatBalanced(Rope other) {
        throw new NotImplementedYetException();
    }

}