static class Node<T1, T2> {
        T1 key;
        T2 value;
        Node<T1, T2> left, right;

        Node(T1 key, T2 value) {
            this.key = key;
            this.value = value;
        }

        public T2 get(T1 k) {
            Node<T1, T2> x = rootNode;
            while (x != null) {
            int cmp = k.compareTo(x.key);
            if(cmp == 0) {
                return x.value;
            }

            }
        return null;
        }
}
