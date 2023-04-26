package com.ohc.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Arrays;

/**
 * MyBatis-Plus 代码生成类
 */
public class BookNoteCodeGenerator {

    // TODO 修改服务名以及数据表名
    private static final String SERVICE_NAME = "bookNote";

    // 数据库账号
    private static final String DATA_SOURCE_USER_NAME = "root";
    // 数据库密码
    private static final String DATA_SOURCE_PASSWORD = "123456";
    // 生成的表
    private static final String[] TABLE_NAMES = new String[]{
            "admin_menu",
            "admin_role",
            "book"
    };

    // TODO 默认生成entity，需要生成DTO修改此变量
    // 一般情况下要先生成DTO类 然后修改此参数再生成PO类,覆盖掉其他类，将DTO改为PO。
    private static final Boolean IS_DTO = false;

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Velocity
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setFileOverride(true);
        // 生成路径,System.getProperty("user.dir")对应当前项目的路径
        gc.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        gc.setAuthor("SilenceOu");
        // 控制是否开启某些功能,比如字段下划线转驼峰、逻辑删除、自动填充等
        gc.setOpen(false);
        gc.setSwagger2(false);
        // 移除IService前面的I，%s代表驼峰状的实体名
        gc.setServiceName("%sService");
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);

        if (IS_DTO) {
            gc.setSwagger2(true);
            gc.setEntityName("%sDTO");
        }
        mpg.setGlobalConfig(gc);

        // 数据库配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setUrl("jdbc:mysql://192.168.225.129:3306/book_note"
                + "?serverTimezone=UTC&useUnicode=true&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername(DATA_SOURCE_USER_NAME);
        dsc.setPassword(DATA_SOURCE_PASSWORD);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(SERVICE_NAME);
        pc.setParent("com.ohc");
        pc.setEntity("model.po");
        // 生成DTO则选下面这个
        // pc.setEntity("model.dto");
        mpg.setPackageInfo(pc);

        // 设置模板
        TemplateConfig tc = new TemplateConfig();
        mpg.setTemplate(tc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setInclude(TABLE_NAMES);
        strategy.setControllerMappingHyphenStyle(true);
        // 是否移除表前缀
        // strategy.setTablePrefix(pc.getModuleName() + "_");
        // Boolean类型字段是否移除is前缀处理
        // strategy.setEntityBooleanColumnRemoveIsPrefix(true);
        strategy.setRestControllerStyle(true);

        // 自动填充字段配置
        strategy.setTableFillList(Arrays.asList(
                new TableFill("create_date", FieldFill.INSERT),
                new TableFill("change_date", FieldFill.INSERT_UPDATE),
                new TableFill("modify_date", FieldFill.UPDATE)
        ));
        mpg.setStrategy(strategy);

        mpg.execute();
    }

}
