/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problem_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class Node {
    char data;
    List<Node>children = new ArrayList<>();

    public Node(char data) {
        this.data = data;
    }
    
    public void addChild(Node child)
    {
        children.add(child);
    }
}
