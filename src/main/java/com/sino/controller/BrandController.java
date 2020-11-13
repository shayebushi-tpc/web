package com.sino.controller;

import com.sino.pojo.PmsBrand;
import com.sino.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by tianpengcheng on 11/13/2020.
 */
@RestController("/brand")
@Api(tags = "PmsBrandController", description = "商品品牌管理")
public class BrandController {
    @Autowired
    BrandService brandService;

    @GetMapping("/findall")
    @ApiOperation("获取所有品牌列表")
    public List<PmsBrand> findall(){
        return brandService.queryBrandList();
    }

    @GetMapping("/queryOne")
    @ApiOperation("根据id查找某个品牌")
    public PmsBrand queryById(@RequestParam("id") long id){
        return brandService.queryById(id);
    }
}
