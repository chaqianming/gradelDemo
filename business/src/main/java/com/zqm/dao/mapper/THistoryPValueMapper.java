package com.zqm.dao.mapper;

import com.zqm.dao.entity.THistoryPValue;
import com.zqm.dao.entity.THistoryPValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface THistoryPValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    long countByExample(THistoryPValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    int deleteByExample(THistoryPValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    int insert(THistoryPValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    int insertSelective(THistoryPValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    List<THistoryPValue> selectByExampleWithRowbounds(THistoryPValueExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    List<THistoryPValue> selectByExample(THistoryPValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    THistoryPValue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") THistoryPValue record, @Param("example") THistoryPValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    int updateByExample(@Param("record") THistoryPValue record, @Param("example") THistoryPValueExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    int updateByPrimaryKeySelective(THistoryPValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_history_p_value
     *
     * @mbg.generated Mon Jul 29 11:53:44 CST 2019
     */
    int updateByPrimaryKey(THistoryPValue record);
}