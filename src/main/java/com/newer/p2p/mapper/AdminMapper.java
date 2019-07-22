package com.newer.p2p.mapper;

import com.newer.p2p.domain.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    @Select("select * from admin where ausername = #{ausername} and apassword = #{apassword}")
    public Admin AdminLogin(@Param("ausername")String ausername,@Param("apassword")String apassword);


    @Insert("insert into admin values (null,'普通用户',#{ausername},#{apassword},#{register})")
    public int AdminRegister(Admin admin);

}
