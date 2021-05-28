package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.dto.Player;

@Mapper
public interface TestMapper {

	@Select("SELECT * FROM player")
	List<Player> selectAll();
}
