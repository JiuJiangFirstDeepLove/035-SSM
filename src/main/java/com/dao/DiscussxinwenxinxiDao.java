package com.dao;

import com.entity.DiscussxinwenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxinwenxinxiVO;
import com.entity.view.DiscussxinwenxinxiView;


/**
 * 新闻信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-27 10:27:51
 */
public interface DiscussxinwenxinxiDao extends BaseMapper<DiscussxinwenxinxiEntity> {
	
	List<DiscussxinwenxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);
	
	DiscussxinwenxinxiVO selectVO(@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);
	
	List<DiscussxinwenxinxiView> selectListView(@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);

	List<DiscussxinwenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);
	
	DiscussxinwenxinxiView selectView(@Param("ew") Wrapper<DiscussxinwenxinxiEntity> wrapper);
	

}
