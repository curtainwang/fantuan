package com.eeeya.fantuan.server.api.v1.model.table.status;

import com.eeeya.fantuan.server.config.FantuanConfig;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

/**
 * @author zhonghui
 * @since 5/6/15.
 */
@ApiModel("餐桌消息状态")
public class TableMessageStatus extends TableElementStatus {

    @ApiModelProperty("是否有新消息")
    Boolean hasNewMessage;

    public TableMessageStatus() {
        this.hasNewMessage = FantuanConfig.DEFAULT_TABLE_HAS_NEW_MESSAGE;
    }

    public Boolean getHasNewMessage() {
        return hasNewMessage;
    }

    public void setHasNewMessage(Boolean hasNewMessage) {
        this.hasNewMessage = hasNewMessage;
    }
}