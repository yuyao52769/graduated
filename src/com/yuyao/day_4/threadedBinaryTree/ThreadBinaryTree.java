package com.yuyao.day_4.threadedBinaryTree;

public class ThreadBinaryTree {

    public ThreadBinaryTree() {
    }

    public static void main(String[] args) {
        HeroNode root = new HeroNode(1, "aaa");
        HeroNode no2 = new HeroNode(3, "bbb");
        HeroNode no3 = new HeroNode(6, "ccc");
        HeroNode no4 = new HeroNode(8, "ddd");
        HeroNode no5 = new HeroNode(10, "eee");
        HeroNode no6 = new HeroNode(14, "fff");

        root.setLeft(no2);
        root.setRight(no3);
        no2.setLeft(no4);
        no2.setRight(no5);
        no3.setLeft(no6);

        BinaryTree tree = new BinaryTree(root);
        tree.threadedNode();

        // 测试
        HeroNode leftNode = no5.getLeft();
        HeroNode rightNode = no5.getRight();
        System.out.println(leftNode);
        System.out.println(rightNode);

    }
}

class BinaryTree {

    private HeroNode root;
    private HeroNode preNode = null;

    public BinaryTree(HeroNode root) {
        this.root = root;
    }

    public BinaryTree(){}

    public void threadedNode() {
        threadedNode(root);
    }

    // 编写对线索化后的二叉树的中序遍历方法
    public void infixOrderThread() {
        HeroNode node = root;
        while (node != null) {
            while (node.getLeftType() == 0) {
                node = node.getLeft();
            }
            System.out.println(node);
            while (node.getRightType() == 1) {
                node = node.getRight();
                System.out.println(node);
            }
            node = node.getRight();
        }
    }

    // 编写对二叉树进行中序线索化的方法
    public void threadedNode(HeroNode node) {
        if (node == null) {
            return;
        }
        threadedNode(node.getLeft());
        if (node.getLeft() == null) {
            node.setLeft(preNode);
            node.setLeftType(1);
        }
        if (preNode != null && preNode.getRight() == null) {
            preNode.setRight(node);
            preNode.setRightType(1);
        }
        preNode = node;
        threadedNode(node.getRight());
    }

    public void deleteNodeSpecial(int id) {
        if (root != null) {
            root.deleteNodeSpecial(id);
        }
        else {System.out.println("Error! this binary tree is empty!");}
    }

    public void deleteNode(int id) {
        if (root != null) {
            if (root.getNo() == id) {
                root = null;
            }
            else {
                root.deleteNode(id);
            }
        } else {System.out.println("Error! this binary tree is empty!");}
    }

    // 前序遍历

    public HeroNode preOrderSearch(int id) {
        if (root != null) {
            return root.perOrderSearch(id);
        }
        else {
            System.out.println("Error! this binary tree is empty!");
            return null;}
    }

    public HeroNode infixOrderSearch(int id) {
        if (root != null) {
            return root.infixOrderSearch(id);
        }
        else {
            System.out.println("Error! this binary tree is empty!");
            return null;}
    }

    public HeroNode postOrderSearch(int id) {
        if (root != null) {
            return root.postOrderSearch(id);
        }
        else {
            System.out.println("Error! this binary tree is empty!");
            return null;}
    }

    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {System.out.println("Error! this binary tree is empty!");}
    }

    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {System.out.println("Error! this binary tree is empty!");}
    }

    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {System.out.println("Error! this binary tree is empty!");}
    }
}


class HeroNode{
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    private int leftType;
    private int rightType;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    // 前序删除 （若该非叶子节点A只有一个子节点B，则子节点B来替代节点A；
    // 如果该非叶子节点A有左节点B和右节点C，则让左节点B来替代节点A）
    public void deleteNodeSpecial(int id) {
        if (this.left != null && this.left.no == id) {
            if (this.left.left != null && this.left.right != null) {
                HeroNode temp = this.left.right;
                this.left = this.left.left;
                this.left.right = temp;
                return;
            }
            else if (this.left.left != null && this.left.right == null) {
                this.left = this.left.left;
                return;
            }
            else if (this.left.left == null && this.left.right != null) {
                this.left =  this.left.right;
                return;
            }
            else if (this.left.left == null && this.left.right == null) {
                this.left = null;
                return;
            }
        }
        if (this.right != null && this.right.no == id) {
            if (this.right.left != null && this.right.right != null) {
                HeroNode temp = this.right.right;
                this.right = this.right.left;
                this.right.right = temp;
                return;
            }
            else if (this.right.left != null && this.right.right == null) {
                this.right = this.right.left;
                return;
            }
            else if (this.right.left == null && this.right.right != null) {
                this.right =  this.right.right;
                return;
            }
            else if (this.right.left == null && this.right.right == null) {
                this.right = null;
                return;
            }
        }
        if (this.left != null) {
            this.left.deleteNodeSpecial(id);
        }
        if (this.right != null) {
            this.right.deleteNodeSpecial(id);
        }
    }

    // 前序删除
    public void deleteNode(int id) {
        if (this.left != null && this.left.no == id) {
            this.left = null;
            return;
        }
        if (this.right != null && this.right.no == id) {
            this.right = null;
            return;
        }
        if (this.left != null) {
            this.left.deleteNode(id);
        }
        if (this.right != null) {
            this.right.deleteNode(id);
        }
    }

    // 中序删除
    public HeroNode perOrderSearch(int id) {
        if (this.no == id) {
            return this;
        }
        else {
            HeroNode result = null;
            if (this.left != null) {
                result = this.left.perOrderSearch(id);
            }
            if (result != null) {return result;}
            if (this.right != null) {
                result = this.right.perOrderSearch(id);
            }
            return result;
        }
    }

    public HeroNode infixOrderSearch(int id) {
        HeroNode result = null;
        if (this.left != null) {
            result = this.left.infixOrderSearch(id);
        }
        if (result != null) {return result;}
        if (this.no == id) {return this;}
        if (this.right != null) {
            result = this.right.infixOrderSearch(id);
        }
        return result;
    }

    public HeroNode postOrderSearch(int id) {
        HeroNode result = null;
        if (this.left != null) {
            result = this.left.postOrderSearch(id);
        }
        if (result != null) {return result;}
        if (this.right != null) {
            result = this.right.postOrderSearch(id);
        }
        if (result != null) {return result;}
        if (this.no == id) {return this;}
        else {return null;}
    }

    // 前序遍历
    public void preOrder()  {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    // 中序遍历
    public void infixOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }
        System.out.println(this);
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    // 后序遍历
    public void postOrder() {
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "HeroNode[no = " + no + ", name = " + name + "]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }
}
