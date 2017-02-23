package com.zqh.infinitetree;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OrangeKiller on 2017/2/23.
 */
public class Main {

    public static void main(String[] args) {
        Node pn1 = new Node(1, "供应链部", 0, 3);
        Node pn2 = new Node(2, "技术部", 0, 1);
        Node pn3 = new Node(3, "行政部", 0, 2);
        Node pn4 = new Node(4, "公关部", 0, 4);

        Node cn11 = new Node(5, "物流部", 1, 1);
        Node cn12 = new Node(6, "采购部", 1, 2);

        Node cn21 = new Node(7, "开发部", 2, 2);
        Node cn22 = new Node(8, "测试部", 2, 1);
        Node cn23 = new Node(9, "运维部", 2, 3);

        Node cn31 = new Node(10, "招聘部", 3, 1);
        Node cn32 = new Node(11, "人事部", 3, 2);

        Node cn211 = new Node(12, "后端部", 7, 2);
        Node cn212 = new Node(13, "前端部", 7, 2);

        List<Node> nodes = new ArrayList<Node>();
        nodes.add(pn1);
        nodes.add(pn2);
        nodes.add(pn3);
        nodes.add(pn4);
        nodes.add(cn11);
        nodes.add(cn12);
        nodes.add(cn21);
        nodes.add(cn22);
        nodes.add(cn23);
        nodes.add(cn31);
        nodes.add(cn32);
        nodes.add(cn211);
        nodes.add(cn212);
        nodes = InfiniteTreeUtils.getInfiniteTree(nodes);

        System.out.println(JSON.toJSON(nodes));

    }

}
