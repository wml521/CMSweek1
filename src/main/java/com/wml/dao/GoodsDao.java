package com.wml.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wml.domain.Brand;
import com.wml.domain.Goods;
import com.wml.domain.Type;
import com.wml.vo.GoodsVO;

/** 
 * @author by WangMaoLin
 * @version 2020年2月24日 下午2:14:45 
 * 
 */

public interface GoodsDao {

	List<Goods> list(GoodsVO gv);
	
	List<Type> findType(Integer id);
	
	List<Brand> findBrand(Integer id);

	List<Type> selectType();

	List<Brand> selectBrand();

	void addGoods(Goods goods);

	void addGb(@Param("id")Integer id,@Param("bid") Integer bid);

	void addGt(@Param("id")Integer id,@Param("tid") Integer tid);

}
