package com.ohc.bookNote.service.impl;

import com.ohc.bookNote.model.po.Book;
import com.ohc.bookNote.mapper.BookMapper;
import com.ohc.bookNote.service.BookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图书表 服务实现类
 * </p>
 *
 * @author SilenceOu
 */
@Slf4j
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
