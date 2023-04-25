package com.ohc.bookNote.model.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author SilenceOu
 */
@Data
@ApiModel(value="AdminRoleDTO", description="角色表")
public class AdminRoleDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String nameZh;

    private Boolean enabled;


}
