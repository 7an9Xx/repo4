package com.example.exam1206.dao;

import com.example.exam1206.entity.Professionals;
import com.example.exam1206.util.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CrudDAO {
    private JdbcTemplate jdbcTemplate=new JdbcTemplate(JdbcUtils.getDataSource());

    public int addProfessional(String major_name,String organization_name){
        String sql="insert into ttt(major_name, organization_name)\n" +
                "values(?,?)";
        return jdbcTemplate.update(sql,major_name,organization_name);

    }

    public Professionals getByname(String name){
        Professionals professionals = null;
        String sql="select * from ttt where major_name=?;";
        professionals=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Professionals.class),name);
        return professionals;
    }
    public List<Professionals> getByOname(String name){
        List<Professionals> professionalsList;

        String sql="select * from ttt where organization_name = ?";
        professionalsList= jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Professionals.class),name);
        return  professionalsList;
    }

    public List<Professionals> getByMname(String name){
        List<Professionals> professionals;
        String sql="select * from ttt where major_name like ?";
        String mname = "%"+name+"%";
        professionals= jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Professionals.class),mname);
        return professionals;
    }

    public int updateMajorName(String name,String newname){
        String  sql="update ttt\n" +
                "set major_name=?\n" +
                "where major_name=?";
        return jdbcTemplate.update(sql,newname,name);
    }

    public int deleteProfessional(String name){
        String sql="delete from ttt\n"+
                "where major_name=?";
        return jdbcTemplate.update(sql,name);
    }
}
