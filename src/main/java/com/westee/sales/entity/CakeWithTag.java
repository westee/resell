package com.westee.sales.entity;

import com.westee.sales.generate.Cake;
import com.westee.sales.generate.CakeTag;

import java.util.ArrayList;
import java.util.Date;

public class CakeWithTag extends Cake {
    private ArrayList<CakeTag> tags;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAKE
     *
     * @param id
     * @param name
     * @param imgUrl
     * @param deleted
     * @param createdAt
     * @param updatedAt
     * @mbg.generated Fri Jul 28 14:34:59 CST 2023
     */
    public CakeWithTag(Long id, String name, String imgUrl, Boolean deleted, Date createdAt, Date updatedAt) {
        super(id, name, imgUrl, deleted, createdAt, updatedAt);
    }

    public ArrayList<CakeTag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<CakeTag> tags) {
        this.tags = tags;
    }
}