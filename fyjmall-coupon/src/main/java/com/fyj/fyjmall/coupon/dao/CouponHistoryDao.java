package com.fyj.fyjmall.coupon.dao;

import com.fyj.fyjmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author fyj
 * @email 1813306692@qq.com
 * @date 2020-05-15 16:17:42
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
