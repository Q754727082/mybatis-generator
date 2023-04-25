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
 * 菜单表
 * </p>
 *
 * @author SilenceOu
 */
@Data
@ApiModel(value="AdminMenuDTO", description="菜单表")
public class AdminMenuDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String path;

    private String name;

    private String nameZh;

    private String iconCls;

    private String component;

    private Integer parentId;


}
