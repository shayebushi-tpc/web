package com.sino.mapper;

import com.sino.pojo.UmsGrowthChangeHistory;
import com.sino.pojo.UmsGrowthChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsGrowthChangeHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int countByExample(UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByExample(UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insert(UmsGrowthChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insertSelective(UmsGrowthChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    List<UmsGrowthChangeHistory> selectByExample(UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsGrowthChangeHistory record, @Param("example") UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExample(@Param("record") UmsGrowthChangeHistory record, @Param("example") UmsGrowthChangeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_growth_change_history
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKey(UmsGrowthChangeHistory record);
}