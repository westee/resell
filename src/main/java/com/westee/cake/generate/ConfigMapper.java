package com.westee.cake.generate;

import com.westee.cake.generate.Config;
import com.westee.cake.generate.ConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    long countByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    int deleteByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    int insert(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    int insertSelective(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    List<Config> selectByExample(ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    Config selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    int updateByPrimaryKeySelective(Config record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CONFIG
     *
     * @mbg.generated Mon Oct 09 16:47:26 CST 2023
     */
    int updateByPrimaryKey(Config record);
}