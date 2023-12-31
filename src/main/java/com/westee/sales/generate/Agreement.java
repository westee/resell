package com.westee.sales.generate;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Agreement implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AGREEMENT.ID
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AGREEMENT.TITLE
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AGREEMENT.AUTHOR
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AGREEMENT.IS_SHOW
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    private Boolean isShow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AGREEMENT.CREATED_AT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    private LocalDateTime createdAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AGREEMENT.UPDATED_AT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    private LocalDateTime updatedAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AGREEMENT.CONTENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public Agreement(Long id, String title, String author, Boolean isShow, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isShow = isShow;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public Agreement(Long id, String title, String author, Boolean isShow, LocalDateTime createdAt, LocalDateTime updatedAt, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isShow = isShow;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public Agreement() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AGREEMENT.ID
     *
     * @return the value of AGREEMENT.ID
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AGREEMENT.ID
     *
     * @param id the value for AGREEMENT.ID
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AGREEMENT.TITLE
     *
     * @return the value of AGREEMENT.TITLE
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AGREEMENT.TITLE
     *
     * @param title the value for AGREEMENT.TITLE
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AGREEMENT.AUTHOR
     *
     * @return the value of AGREEMENT.AUTHOR
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AGREEMENT.AUTHOR
     *
     * @param author the value for AGREEMENT.AUTHOR
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AGREEMENT.IS_SHOW
     *
     * @return the value of AGREEMENT.IS_SHOW
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AGREEMENT.IS_SHOW
     *
     * @param isShow the value for AGREEMENT.IS_SHOW
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AGREEMENT.CREATED_AT
     *
     * @return the value of AGREEMENT.CREATED_AT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AGREEMENT.CREATED_AT
     *
     * @param createdAt the value for AGREEMENT.CREATED_AT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AGREEMENT.UPDATED_AT
     *
     * @return the value of AGREEMENT.UPDATED_AT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AGREEMENT.UPDATED_AT
     *
     * @param updatedAt the value for AGREEMENT.UPDATED_AT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AGREEMENT.CONTENT
     *
     * @return the value of AGREEMENT.CONTENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AGREEMENT.CONTENT
     *
     * @param content the value for AGREEMENT.CONTENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}