package me.cchu.mall.product.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.cchu.mall.product.entity.CategoryEntity;
import me.cchu.mall.product.service.CategoryService;
import me.cchu.common.utils.R;



/**
 * 商品三级分类
 *
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 15:15:32
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 查出所有分类以及子分类，以树形结构组装起来
     */
    @RequestMapping("/list/tree")
    public R list() {
        List<CategoryEntity> entities = categoryService.listWithTree();
        return R.ok().put("data", entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
        categoryService.updateCascade(category);

        return R.ok();
    }

    /**
     * 删除
     * @RequestBody:获取请求体，必须发送POST请求
     * SpringMVC自动将请求体的数据(json)转换为对象
     */
    @DeleteMapping("/delete")
    //@RequiresPermissions("product:category:delete")
    public R delete(@RequestBody Long[] catIds){

        //1、检查当前删除的菜单，是否被别的地方引用
        //categoryService.removeByIds(Arrays.asList(catIds));

        categoryService.removeMenuByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
