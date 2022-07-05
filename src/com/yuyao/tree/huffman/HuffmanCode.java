package com.yuyao.tree.huffman;

import java.util.*;

public class HuffmanCode {

    static Map<Byte, String> huffmanCodes = new HashMap<>();
    static StringBuilder stringBuilder = new StringBuilder();


    public static void main(String[] args) {
        String str = "i like like like java do you like a java";
        byte[] contentBytes = str.getBytes();
        List<Node> nodes = getNodes(contentBytes);
        Node root = creatHuffmanTree(nodes);
        root.preOrder();
        Map<Byte, String> huffmanCodes = getCodes(root);
        System.out.println(HuffmanCode.huffmanCodes);
    }

    public static byte[] zip(byte[] bytes, Map<Byte, String> huffmanCodes) {
        return null;
    }

    public static Map<Byte, String> getCodes (Node root) {
        if (root == null) {
            return null;
        }
        getCodes(root.left, "0", stringBuilder);
        getCodes(root.right, "1", stringBuilder);
        return huffmanCodes;
    }

    /**
     * 传入节点后，得到赫夫曼编码的map
     * @param node
     * @param code 路径 左子点路径是0，右字点路径是1
     * @param builder
     */
    public static void getCodes(Node node, String code, StringBuilder builder) {
        StringBuilder stringBuilder2 = new StringBuilder(builder);
        stringBuilder2.append(code);
        if (node != null) {
            if (node.data == null) {
                 getCodes(node.left, "0", stringBuilder2);
                 getCodes(node.right, "1", stringBuilder2);
            } else {
                huffmanCodes.put(node.data, stringBuilder2.toString());
            }
        }
    }

    public static List<Node> getNodes (byte[] bytes) {
        List<Node> nodes = new ArrayList<Node>();
        Map<Byte, Integer> counts = new HashMap<>();
        for (byte b : bytes) {
            Integer count = counts.get(b);
            if (count == null) {
                counts.put(b, 1);
            }
            else {
                counts.put(b, count + 1);
            }
        }

        for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }
        return nodes;
    }

    public static Node creatHuffmanTree(List<Node> nodes) {
        while (nodes.size() > 1) {
            Collections.sort(nodes);
            Node left = nodes.get(0);
            Node right = nodes.get(1);
            Node root = new Node(left.weight+right.weight, left, right);
//            root.left = left;
//            root.right = right;
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(root);
        }
        return nodes.get(0);
    }


}

class Node implements Comparable<Node> {

    Byte data;
    int weight;
    Node left;
    Node right;

    public Node(int weight, Node left, Node right) {
        this(null, weight, left, right);
    }

    public Node(Byte data, int weight) {
        this(data, weight, null, null);
    }

    public Node(Byte date,int weight, Node left, Node right) {
        this.data = date;
        this.weight = weight;
        this.left = left;
        this.right = right;
    }


    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", weight=" + weight + "}";
    }

    public void preOrder() {
        if (this == null) {return;}
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }
}
