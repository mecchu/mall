package me.cchu.mall.search.service;


import me.cchu.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;


public interface ProductSaveService {


	boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
