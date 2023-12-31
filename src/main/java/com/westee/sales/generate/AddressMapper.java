package com.westee.sales.generate;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    long countByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    int deleteByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    int insertSelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    List<Address> selectByExample(AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    Address selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADDRESS
     *
     * @mbg.generated Tue Aug 01 22:05:43 CST 2023
     */
    int updateByPrimaryKey(Address record);
}