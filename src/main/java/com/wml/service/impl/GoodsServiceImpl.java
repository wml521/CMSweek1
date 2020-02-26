package com.wml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wml.dao.GoodsDao;
import com.wml.domain.Brand;
import com.wml.domain.Goods;
import com.wml.domain.Type;
import com.wml.service.GoodsService;
import com.wml.vo.GoodsVO;

/** 
 * @author by WangMaoLin
 * @version 2020年2月24日 下午2:15:15 
 * 
 */
@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsDao gd;

	@Override
	public List<Goods> list(GoodsVO gv) {
		// TODO Auto-generated method stub
		return gd.list(gv);
	}

	@Override
	public List<Type> selectType() {
		// TODO Auto-generated method stub
		return gd.selectType();
	}

	@Override
	public List<Brand> selectBrand() {
		// TODO Auto-generated method stub
		return gd.selectBrand();
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		gd.addGoods(goods);
		gd.addGb(goods.getId(),goods.getBid());
		gd.addGt(goods.getId(),goods.getTid());
	}
}
