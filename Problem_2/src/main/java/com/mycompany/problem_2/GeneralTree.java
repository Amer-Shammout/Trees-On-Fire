/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author dell
 */
public class GeneralTree {
    
    public static List<Node>nodes = new ArrayList<>();
    /*--------------------------------------------------------------------------
    1)Insert
    ----------------------------------------------------------------------------*/
    public static  void insert(Node n , List<String>children)
    {
       Node temp = n;
        Node temp2 = null;

        nodes.add(searchNode(n));
        for (String s : children) {         
            temp2 = new Node(s.charAt(0));
            searchNode(n).addChild(temp2);
        }
    }
    
    public static  Node searchNode(Node n)
    {
        for (Node node : nodes) {
            for (Node node1 : node.children) {
                if(n.data == node1.data){
                    return node1;
                }
            }
        }
        return n;
    }
    
    
     /*--------------------------------------------------------------------------
    2)Export and Import
    ----------------------------------------------------------------------------*/
    public static String exportToTextFile()
    {
        String str = "";
        for (Node node : nodes) {

            str = str + node.data + " -> ";

            for (Node node1 : node.children) {
                str = str + node1.data+", ";
            }            
            str = str.substring(0, str.length()-2) + '\n';
        }
        PrintWriter writeOnFile = null;
        try {
            writeOnFile = new PrintWriter(new File("export.txt"));
            writeOnFile.print(str.substring(0, str.length()-1));
            writeOnFile.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Un Valid File Path!!");
        }
        finally{
            writeOnFile.close();
        }
        
        return str.substring(0, str.length()-1);
    }
    
     
    
    public static List<Node> importFromTextFile() 
    {
        nodes.clear();
        int c = 0;
        Node mainNode = null;
        Node childNode = null;
        Scanner readFromFile = null;
        try {
            readFromFile = new Scanner(new FileInputStream("export.txt"));
            while (readFromFile.hasNextLine()) {
                String s = readFromFile.nextLine();
                if(c==0){
                    mainNode = new Node(s.charAt(0));
                    c++;
                }
                else{
                    mainNode = new Node(s.charAt(0));
                    mainNode = searchNode(mainNode);
                }
                for (int i = 5; i < s.length(); i++) {
                    if(s.charAt(i)==',' || s.charAt(i)==' '){
                        continue;
                    }
                    else
                    {
                        childNode = new Node(s.charAt(i));
                        mainNode.addChild(childNode);
                    }
                }
                nodes.add(mainNode);
            }
        } catch (FileNotFoundException ex) {
           System.out.println("Un Valid File Path!!");
        }
        finally{
            readFromFile.close();
        }
        
        return nodes;
    }
    
    public static String printTree(List<Node>nodes)
    {
        String s = "";
        for (Node node : nodes) {
            s = s + node.data +" : ";
            for (Node node1 : node.children) {
                s = s + node1.data+" ";
            }
            s = s + "\n";
        }
        return s;
    }
    
    /*--------------------------------------------------------------------------
    3)Transfer From General Tree To Binary Tree
    ----------------------------------------------------------------------------*/  
    
    public static BinaryTreeNode generic_to_binary(Node root) {
        if (root == null)
            return null;

        BinaryTreeNode binaryRoot = new BinaryTreeNode(root.data);
        if (!root.children.isEmpty())
            binaryRoot.right = generic_to_binary(root.children.get(root.children.size()-1));

        BinaryTreeNode current = binaryRoot.right;

        for (int i = root.children.size()-2; i >= 0 ; i--) {
            Node child = root.children.get(i);
            current.left = generic_to_binary(child);
            current = current.left;
        }
        return binaryRoot;
    }
    public static String printTreeHelper(BinaryTreeNode root)
    {
        String s = "";

        List<List<BinaryTreeNode>>levels = levelOrder(root);
        List <BinaryTreeNode>currentLevel = new ArrayList<>();
        for (int i = 0; i < levels.size(); i++) {
            currentLevel = levels.get(i);
            for (int j = 0; j < currentLevel.size(); j++) {
                s = s + printTree(currentLevel.get(j));          
            } 
        }
        return s.substring(0,s.length()-1);
    }
    
    
    private static String printTree(BinaryTreeNode root)
    {
        String str = "";
        boolean isLeaf = (root.right == null && root.left == null);
        boolean hasLeft = (root.left != null);
        boolean hasRight = (root.right != null);
        if (root == null)
            return "";
        if(isLeaf)
            return "";
     
        str = str + root.data +" -> ";

        if (hasLeft) {
            str = str + root.left.data;
        }

        if (hasRight) {
            if (hasLeft) {
                str = str + ", ";
            }
            str = str + root.right.data;
        }
        str = str + '\n';
            
        return str;
    
    }
    
    
    
    public static List<List<BinaryTreeNode>> levelOrder(BinaryTreeNode root) {
        List<List<BinaryTreeNode>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<BinaryTreeNode> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                BinaryTreeNode currentNode = queue.poll();
                currentLevel.add(currentNode);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

            result.add(currentLevel);
            
        }

        return result;
    }
    
    public static Node binary_to_generic(BinaryTreeNode root) {
        if (root == null)
            return null;

        Node genericRoot = new Node(root.data);

        // Add right children in reverse order
        if (root.right != null) {
            Stack<BinaryTreeNode> stack = new Stack<>();
            BinaryTreeNode current = root.right;
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            while (!stack.isEmpty()) {
                genericRoot.children.add(binary_to_generic(stack.pop()));
            }
        }

        return genericRoot;
    }
    
    
    
    public static List<Node> convertGenericRootToNodes(Node genericRoot)
    {
        nodes.clear();
        nodes.add(genericRoot);
        for (int i = 0; i < nodes.size(); i++) {
            if(i!=0){
            genericRoot = nodes.get(i);
            }
        for (int j = 0; j < genericRoot.children.size(); j++) {
            if(!genericRoot.children.get(j).children.isEmpty())
            {
                nodes.add(genericRoot.children.get(j));
            }
        }
        }
        return nodes;
    }
    
    public static Node returnRoot()
    {
        Node root = nodes.get(0);
        return root;
    }
    
     /*--------------------------------------------------------------------------
    5)Draw General Tree And Binary Tree
    ----------------------------------------------------------------------------*/   
    // Drawing the General Tree
    public static String drawGeneralTree(Node node, String prefix, boolean isTail) {

        String str = prefix + (isTail ? "└── " : "├── ") + node.data + "\n";
        for (int i = 0; i < node.children.size() - 1; i++) {
           str+= drawGeneralTree(node.children.get(i), prefix + (isTail ? "    " : "│   "), false);
        }
        if (node.children.size() > 0) {
             str += drawGeneralTree(node.children.get(node.children.size() - 1), prefix + (isTail ?"    " : "│   "), true);
        }
        return str ;
    }


 //Drawing the Binary Tree
    public static String drawBinaryTree(BinaryTreeNode node, String prefix, boolean isTail) {
        if (node == null) return "";
        String str = prefix + (isTail ? "└── " : "├── ") + node.data + "\n";



        if (node.left != null && node.right != null) {
            str += drawBinaryTree(node.left, prefix + (isTail ? "    " : "│   "), false);
            str += drawBinaryTree(node.right, prefix + (isTail ? "    " : "│   "), true);
        } else if (node.left != null) {
            str += drawBinaryTree(node.left, prefix + (isTail ? "    " : "│   "), true);
        } else if (node.right != null) {
            str += drawBinaryTree(node.right, prefix + (isTail ? "    " : "│   "), true);
        }
        return str ;
    }
}
