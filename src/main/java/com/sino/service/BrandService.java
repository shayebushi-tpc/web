package com.sino.service;

import com.sino.pojo.PmsBrand;

import java.util.List;

/**
 * Created by tianpengcheng on 11/13/2020.
 */
public interface BrandService {
    List<PmsBrand> queryBrandList();

    PmsBrand queryById(long id);

    Integer insertBrand(PmsBrand brand);
}
