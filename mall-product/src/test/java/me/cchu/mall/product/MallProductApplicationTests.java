package me.cchu.mall.product;

import lombok.extern.slf4j.Slf4j;
import me.cchu.mall.product.dao.AttrGroupDao;
import me.cchu.mall.product.dao.SkuSaleAttrValueDao;
import me.cchu.mall.product.service.BrandService;
import me.cchu.mall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class MallProductApplicationTests {

	@Resource
	private BrandService brandService;

	@Resource
	private CategoryService categoryService;

//	@Resource
//	private StringRedisTemplate stringRedisTemplate;

//	@Autowired
//	private RedissonClient redissonClient;

	@Resource
	private AttrGroupDao attrGroupDao;

	@Resource
	private SkuSaleAttrValueDao skuSaleAttrValueDao;

//	@Test
//	public void test1() {
//		List<SkuItemSaleAttrVo> saleAttrBySpuId = skuSaleAttrValueDao.getSaleAttrBySpuId(13L);
//		saleAttrBySpuId.forEach(System.out::println);
//	}

//	@Test
//	public void test() {
//		List<SpuItemAttrGroupVo> attrGroupWithAttrsBySpuId = attrGroupDao.getAttrGroupWithAttrsBySpuId(130L, 225L);
//		attrGroupWithAttrsBySpuId.forEach(System.out::println);
//	}

//	@Test
//	public void testRedisson() {
//		System.out.println(redissonClient);
//	}

//	@Test
//	public void testStringRedis() {
//		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
//
//		//保存
//		ops.set("hello","world_" + UUID.randomUUID().toString());
//
//		//查询
//		String hello = ops.get("hello");
//		System.out.println("之前保存的数据:"+hello);
//	}

//	@Test
//	public void testFindPath() {
//		Long[] catelogPath = categoryService.findCatelogPath(225l);
//
//		log.info("完整路径catelogPath={}", Arrays.asList(catelogPath));
//	}

//	@Test
//	public void testUpload() throws FileNotFoundException {
//		// Endpoint以杭州为例，其它Region请按实际情况填写。
//		String endpoint = "oss-cn-beijing.aliyuncs.com";
//		// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//		String accessKeyId = "LTAI4G66cCNM2t7LKE79RaY3";
//		String accessKeySecret = "wd0KVDLCO1vVXq4q9aIPTXY7AP7rdW";
//
//		// 创建OSSClient实例。
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//		// 上传文件流。
//		InputStream inputStream = new FileInputStream("C:\\Users\\Jerry\\Desktop\\1.png");
//
//		ossClient.putObject("gulimall-clouds", "1.png", inputStream);
//
//		// 关闭OSSClient。
//		ossClient.shutdown();
//
//		System.out.println("上传成功...");
//	}


	@Test
	public void contextLoads() {
		System.out.println(Integer.MAX_VALUE);

	}
}