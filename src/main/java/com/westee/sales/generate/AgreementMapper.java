package com.westee.sales.generate;

import com.westee.sales.generate.Agreement;
import com.westee.sales.generate.AgreementExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AgreementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    long countByExample(AgreementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int deleteByExample(AgreementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int insert(Agreement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int insertSelective(Agreement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    List<Agreement> selectByExampleWithBLOBs(AgreementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    List<Agreement> selectByExample(AgreementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    Agreement selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int updateByExampleSelective(@Param("record") Agreement record, @Param("example") AgreementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") Agreement record, @Param("example") AgreementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int updateByExample(@Param("record") Agreement record, @Param("example") AgreementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int updateByPrimaryKeySelective(Agreement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(Agreement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AGREEMENT
     *
     * @mbg.generated Wed Nov 29 23:30:10 CST 2023
     */
    int updateByPrimaryKey(Agreement record);
}