package com.sino.service.serviceimple;

import com.sino.mapper.PmsBrandMapper;
import com.sino.pojo.PmsBrand;
import com.sino.pojo.PmsBrandExample;
import com.sino.service.BrandService;
import com.sino.service.RedisService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.lang.model.element.VariableElement;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by tianpengcheng on 11/13/2020.
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private PmsBrandMapper brandMapper;
    @Autowired
    private RedisService redis;
    private  final org.slf4j.Logger logger = LoggerFactory.getLogger(BrandService.class);

    @Override
    public List<PmsBrand> queryBrandList() {
        List<PmsBrand> pmsBrands = brandMapper.selectByExample(new PmsBrandExample());
        return pmsBrands;
    }

    @Override
    public PmsBrand queryById(long id) {
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.createCriteria().andIdEqualTo(id);
        PmsBrand obj = (PmsBrand) redis.getObj(id + "");
        //从缓存中取 如果取到了直接返回
        if(obj!= null){
            logger.info("从缓存中查询!!!");
            return obj;
        }
        PmsBrand pmsBrand = brandMapper.selectByExample(pmsBrandExample).get(0);
        return pmsBrand;
    }

    @Override
    /**
    新增品牌
     */
    public Integer insertBrand(PmsBrand brand) {
        int insert = brandMapper.insert(brand);
        if(insert>0){
            redis.setObj(brand.getId()+"",brand);
        }
        return insert;
    }
}
