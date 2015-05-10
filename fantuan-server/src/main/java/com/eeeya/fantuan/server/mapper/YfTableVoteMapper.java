package com.eeeya.fantuan.server.mapper;

import com.eeeya.fantuan.server.domain.YfTableVote;
import com.eeeya.fantuan.server.domain.YfTableVoteExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YfTableVoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    int countByExample(YfTableVoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    int deleteByExample(YfTableVoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    int insert(YfTableVote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    int insertSelective(YfTableVote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    List<YfTableVote> selectByExample(YfTableVoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    YfTableVote selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") YfTableVote record, @Param("example") YfTableVoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") YfTableVote record, @Param("example") YfTableVoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(YfTableVote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yf_table_vote
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YfTableVote record);
}