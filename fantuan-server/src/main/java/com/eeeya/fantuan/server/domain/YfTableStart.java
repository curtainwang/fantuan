package com.eeeya.fantuan.server.domain;

import java.util.Date;

public class YfTableStart {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yf_table_start.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yf_table_start.start_time
     *
     * @mbggenerated
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yf_table_start.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yf_table_start.table_id
     *
     * @mbggenerated
     */
    private Long tableId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yf_table_start.id
     *
     * @return the value of yf_table_start.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yf_table_start.id
     *
     * @param id the value for yf_table_start.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yf_table_start.start_time
     *
     * @return the value of yf_table_start.start_time
     *
     * @mbggenerated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yf_table_start.start_time
     *
     * @param startTime the value for yf_table_start.start_time
     *
     * @mbggenerated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yf_table_start.user_id
     *
     * @return the value of yf_table_start.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yf_table_start.user_id
     *
     * @param userId the value for yf_table_start.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yf_table_start.table_id
     *
     * @return the value of yf_table_start.table_id
     *
     * @mbggenerated
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yf_table_start.table_id
     *
     * @param tableId the value for yf_table_start.table_id
     *
     * @mbggenerated
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }
}