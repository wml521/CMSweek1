package com.wml.service;

import java.util.List;

import com.wml.domain.Brand;
import com.wml.domain.Goods;
import com.wml.domain.Type;
import com.wml.vo.GoodsVO;

/** 
 * @author by WangMaoLin
 * @version 2020年2月24日 下午2:14:55 
 * 
 */

public interface GoodsService {

	List<Goods> list(GoodsVO gv);

	List<Type> selectType();

	List<Brand> selectBrand();

	void add(Goods goods);

}
