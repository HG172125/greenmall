package com.zhg.greenmall.mapper;

import com.zhg.greenmall.entity.Store;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StoreMapper {
//添加商户
    @Insert("insert into store(sname,susername,suserphone,spassword) " +
            "values (#{sname},#{susername}," +
            "#{suserphone},#{spassword})")
    void addStore(String sname,String susername ,String suserphone,String spassword);

//    姓名查找商户
    @Select("SELECT\n" +
            "\tstore.*\n" +
            "FROM\n" +
            "\tstore\n" +
            "WHERE\n" +
            "\tstore.sname = #{sname}")
    Store findOneBySusername(String susername);
}
