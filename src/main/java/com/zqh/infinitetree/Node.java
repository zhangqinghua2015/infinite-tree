package com.zqh.infinitetree;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;

/**
 * Created by OrangeKiller on 2017/2/23.
 */
public class Node implements Comparable<Node>{

    private Integer id;
    private String name;
    private Integer parentId;
    private Integer sort;
    private List<Node> children;

    public Node() {}

    public Node(Integer id, String name, Integer parentId, Integer sort) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.sort = sort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name == null ? null : name.trim();
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public int compareTo(Node o) {
        if (null == o) {
            return 1;
        }
        return this.sort - o.sort;
    }
}
