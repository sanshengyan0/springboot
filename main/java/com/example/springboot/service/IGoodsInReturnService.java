package com.example.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.entity.vo.GoodsInReturnVO;
import com.example.springboot.entity.vo.GoodsInVO;

public interface IGoodsInReturnService extends IService<GoodsInReturnVO> {
    void pageQuery(Page<GoodsInReturnVO> pageParam);
    void likePageBySupplierName(Page<GoodsInReturnVO> pageParam, String supplierName);
    void likePageByGoodsName(Page<GoodsInReturnVO> pageParam, String goodsName);
}
