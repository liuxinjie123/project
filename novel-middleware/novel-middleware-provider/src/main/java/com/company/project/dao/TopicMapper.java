package com.company.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.project.model.Topic;
import com.company.project.model.TopicExample;

public interface TopicMapper {
	long countByExample(TopicExample example);

	int deleteByExample(TopicExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Topic record);

	int insertSelective(Topic record);

	List<Topic> selectByExample(TopicExample example);

	Topic selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

	int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

	int updateByPrimaryKeySelective(Topic record);

	int updateByPrimaryKey(Topic record);
}