package com.ohc.bookNote.mapper;

import com.ohc.bookNote.model.po.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 图书表 Mapper 接口
 * </p>
 *
 * @author SilenceOu
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
