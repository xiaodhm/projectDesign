package com.lyq.bean;


import java.util.HashSet;
import java.util.Set;

    public class Item {
    public static final int PAGE_SIZE=5;
    private int imid;
    private String itemname;
    private Set<Selector> selectors=new HashSet<Selector>();
    public  Item(){}

    public int getImid() {
        return imid;
    }

    public void setImid(int imid) {
        this.imid = imid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Set<Selector> getSelectors() {
        return selectors;
    }

    public void setSelectors(Set<Selector> selectors) {
        this.selectors = selectors;
    }
}
