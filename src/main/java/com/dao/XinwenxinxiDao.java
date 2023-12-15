package com.dao;

import com.entity.XinwenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwenxinxiVO;
import com.entity.view.XinwenxinxiView;


/**
 * 新闻信息
 * 
 * @author 
 * @email 
 * @date 2023-02-27 10:27:51
 */
public interface XinwenxinxiDao extends BaseMapper<XinwenxinxiEntity> {
	
	List<XinwenxinxiVO> selectListVO(@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);
	
	XinwenxinxiVO selectVO(@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);
	
	List<XinwenxinxiView> selectListView(@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);

	List<XinwenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);
	
	XinwenxinxiView selectView(@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XinwenxinxiEntity> wrapper);



}
