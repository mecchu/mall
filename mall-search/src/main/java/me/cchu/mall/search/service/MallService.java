package me.cchu.mall.search.service;

import me.cchu.mall.search.vo.SearchParam;
import me.cchu.mall.search.vo.SearchResult;


public interface MallService {

	/**
	 * 检索所有参数
	 */
	SearchResult search(SearchParam Param);
}
