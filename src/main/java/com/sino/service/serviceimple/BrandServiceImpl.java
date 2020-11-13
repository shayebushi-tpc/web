package com.sino.service.serviceimple;

import com.sino.mapper.PmsBrandMapper;
import com.sino.pojo.PmsBrand;
import com.sino.pojo.PmsBrandExample;
import com.sino.service.BrandService;
import com.sino.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tianpengcheng on 11/13/2020.
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private PmsBrandMapper brandMapper;
    @Autowired
    private RedisService redis;
    @Override
    public List<PmsBrand> queryBrandList() {
        List<PmsBrand> pmsBrands = brandMapper.selectByExample(new PmsBrandExample());
        return pmsBrands;
    }

    @Override
    public PmsBrand queryById(long id) {
        PmsBrandExample pmsBrandExample = new PmsBrandExample();
        pmsBrandExample.createCriteria().andIdEqualTo(id);

        return brandMapper.selectByExample(pmsBrandExample).get(0);
    }

    @Override
    /**
    新增品牌
     */
    public Integer insertBrand(PmsBrand brand) {
        int insert = brandMapper.insert(brand);
        if(insert>0){
            redis.setObj(insert+"",brand);
        }
        return insert;
    }
}
