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
 * 图书表
 * </p>
 *
 * @author SilenceOu
 */
@Data
@ApiModel(value="BookDTO", description="图书表")
public class BookDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String cover;

    private String title;

    private String author;

    private String date;

    private String press;

    private String abs;

    private Integer cid;


}
