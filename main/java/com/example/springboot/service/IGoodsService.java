package com.example.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.entity.Goods;
import com.example.springboot.entity.vo.GoodsVO;

public interface IGoodsService extends IService<Goods> {
    void pageQuery(Page<GoodsVO> pageParam);
    void likePageByGoodsName(Page<GoodsVO> pageParam, String goodsName);
    void likePageByProduceNumber(Page<GoodsVO> pageParam, String produceNumber);
    void likePageByApprovalNumber(Page<GoodsVO> pageParam, String approvalNumber);
    void likePageByDescribeInformation(Page<GoodsVO> pageParam, String describeInformation);
    void likePageBySpecification(Page<GoodsVO> pageParam, String specification);
    void likePageBySupplierName(Page<GoodsVO> pageParam, String supplierName);
    Integer selectIdByGoodsName(String goodsName);
}
