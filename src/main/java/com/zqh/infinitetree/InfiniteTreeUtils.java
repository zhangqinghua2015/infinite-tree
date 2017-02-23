package com.zqh.infinitetree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by OrangeKiller on 2017/2/23.
 */
public class InfiniteTreeUtils {

    public static List<Node> getInfiniteTree(List<Node> nodes) {
        return findRootNodes(nodes);
    }

    /**
     * 找出根节点
     * @param nodes
     * @return
     */
    private static List<Node> findRootNodes(List<Node> nodes) {
        List<Node> rootNodes = new ArrayList<Node>();
        for (Node node : nodes) {
            if (0 == node.getParentId()) {
                rootNodes.add(node);
                findChildNodes(node, nodes);
            }
        }
        // 对父节点进行排序
        Collections.sort(rootNodes);
        return rootNodes;
    }

    /**
     * 找出子节点
     * @param parentNode
     * @param nodes
     */
    private static void findChildNodes(Node parentNode, List<Node> nodes) {
        List<Node> children = new ArrayList<Node>();
        parentNode.setChildren(children);
        for (Node node : nodes) {
            if (node.getParentId() == parentNode.getId()) {
                children.add(node);
                findChildNodes(node, nodes);
            }
        }
        // 对子节点进行排序
        Collections.sort(children);
    }

}
