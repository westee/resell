package com.westee.sales.generate;

import java.io.Serializable;
import java.util.Date;

public class CakeTagMapping implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAKE_TAG_MAPPING.ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAKE_TAG_MAPPING.CAKE_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private String cakeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAKE_TAG_MAPPING.TAG_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private String tagId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAKE_TAG_MAPPING.DELETED
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private Boolean deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAKE_TAG_MAPPING.CREATED_AT
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private Date createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CAKE_TAG_MAPPING.UPDATED_AT
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private Date updatedAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CAKE_TAG_MAPPING
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAKE_TAG_MAPPING
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public CakeTagMapping(Long id, String cakeId, String tagId, Boolean deleted, Date createdAt, Date updatedAt) {
        this.id = id;
        this.cakeId = cakeId;
        this.tagId = tagId;
        this.deleted = deleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CAKE_TAG_MAPPING
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public CakeTagMapping() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAKE_TAG_MAPPING.ID
     *
     * @return the value of CAKE_TAG_MAPPING.ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAKE_TAG_MAPPING.ID
     *
     * @param id the value for CAKE_TAG_MAPPING.ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAKE_TAG_MAPPING.CAKE_ID
     *
     * @return the value of CAKE_TAG_MAPPING.CAKE_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public String getCakeId() {
        return cakeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAKE_TAG_MAPPING.CAKE_ID
     *
     * @param cakeId the value for CAKE_TAG_MAPPING.CAKE_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public void setCakeId(String cakeId) {
        this.cakeId = cakeId == null ? null : cakeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAKE_TAG_MAPPING.TAG_ID
     *
     * @return the value of CAKE_TAG_MAPPING.TAG_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public String getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAKE_TAG_MAPPING.TAG_ID
     *
     * @param tagId the value for CAKE_TAG_MAPPING.TAG_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAKE_TAG_MAPPING.DELETED
     *
     * @return the value of CAKE_TAG_MAPPING.DELETED
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAKE_TAG_MAPPING.DELETED
     *
     * @param deleted the value for CAKE_TAG_MAPPING.DELETED
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAKE_TAG_MAPPING.CREATED_AT
     *
     * @return the value of CAKE_TAG_MAPPING.CREATED_AT
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAKE_TAG_MAPPING.CREATED_AT
     *
     * @param createdAt the value for CAKE_TAG_MAPPING.CREATED_AT
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CAKE_TAG_MAPPING.UPDATED_AT
     *
     * @return the value of CAKE_TAG_MAPPING.UPDATED_AT
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CAKE_TAG_MAPPING.UPDATED_AT
     *
     * @param updatedAt the value for CAKE_TAG_MAPPING.UPDATED_AT
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}