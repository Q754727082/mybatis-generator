package com.ohc.bookNote.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
@TableName("admin_menu")
public class AdminMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String path;

    private String name;

    private String nameZh;

    private String iconCls;

    private String component;

    private Integer parentId;


}
