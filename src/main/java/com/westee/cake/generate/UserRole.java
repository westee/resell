package com.westee.cake.generate;

import java.io.Serializable;

public class UserRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_ROLE.USER_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_ROLE.ROLE_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USER_ROLE
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public UserRole(Long userId, Long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_ROLE
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public UserRole() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_ROLE.USER_ID
     *
     * @return the value of USER_ROLE.USER_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_ROLE.USER_ID
     *
     * @param userId the value for USER_ROLE.USER_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_ROLE.ROLE_ID
     *
     * @return the value of USER_ROLE.ROLE_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_ROLE.ROLE_ID
     *
     * @param roleId the value for USER_ROLE.ROLE_ID
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}