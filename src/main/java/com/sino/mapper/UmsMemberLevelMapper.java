package com.sino.mapper;

import com.sino.pojo.UmsMemberLevel;
import com.sino.pojo.UmsMemberLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int countByExample(UmsMemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByExample(UmsMemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insert(UmsMemberLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int insertSelective(UmsMemberLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    List<UmsMemberLevel> selectByExample(UmsMemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    UmsMemberLevel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByExample(@Param("record") UmsMemberLevel record, @Param("example") UmsMemberLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKeySelective(UmsMemberLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_member_level
     *
     * @mbggenerated Fri Nov 13 14:28:45 CST 2020
     */
    int updateByPrimaryKey(UmsMemberLevel record);
}