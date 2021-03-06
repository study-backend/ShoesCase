package shop.shoes.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.shoes.dao.CategoryDAO;
import shop.shoes.dao.CategoryDAOImple;
import shop.shoes.dao.GoodsDAO;
import shop.shoes.dao.GoodsDAOImpl;
import shop.shoes.dao.GoodsVersionDAO;
import shop.shoes.dao.GoodsVersionDAOImpl;
import shop.shoes.dao.ReviewDAO;
import shop.shoes.dao.ReviewDAOImpl;
import shop.shoes.dao.RollingBannerDAO;
import shop.shoes.dao.RollingBannerDAOImpl;
import shop.shoes.model.CategoryDTO;
import shop.shoes.model.GoodsDTO;
import shop.shoes.model.GoodsVersionDTO;
import shop.shoes.model.ReviewDTO;
import shop.shoes.model.RollingBannerDTO;
import shop.shoes.model.dto.GoodsDetailDTO;
import shop.shoes.model.dto.GoodsMainDTO;
import shop.shoes.model.dto.GoodsReviewDTO;

public class GoodsServiceImpl implements GoodsService {
	
	private static GoodsDAO goodsDAO = new GoodsDAOImpl();
	private static ReviewDAO reviewsDAO = new ReviewDAOImpl();
	private static GoodsVersionDAO versionDAO = new GoodsVersionDAOImpl();
	private static CategoryDAO categoryDAO = new CategoryDAOImple();
	private static RollingBannerDAO rollingBannerDAO = new RollingBannerDAOImpl();

	@Override
	public List<GoodsDTO> selectByCatagory(String categoryName) throws Exception { 
		//dao에서 얻어온 카테고리 list를 저장해서 컨트롤러로 리턴
		
		List<GoodsDTO> list =new ArrayList<GoodsDTO>();
		GoodsDAO goodsDAO = new GoodsDAOImpl();
				
		list = goodsDAO.selectByCatagory(categoryName);
		System.out.println(categoryName);
		
		if(list==null) { //검색된 것 없음 or 카테고리 없음 or 다른이유로 에러
			System.out.println("검색된거 없다!!");
		}
		return list;
	}

	@Override
	public GoodsDTO selectOneProduct(String goodsName) throws SQLException {
		GoodsDTO goodsDTO = new GoodsDTO(); //dao 갔다와서 담을 dto 선언
		GoodsDAO goodsDAO = new GoodsDAOImpl(); // dao 선언
		
		goodsDTO = goodsDAO.selectOneProduct(goodsName);
		if(goodsDTO==null) {
			//dto가 검색 없음 or 다른이유로 에러
		}
		return goodsDTO;
	}

	@Override
	public GoodsMainDTO goodsMain() throws Exception {
		
		//[1] 가장 최신 버전의 version을 가져온다 
		GoodsVersionDTO version = versionDAO.selectNewVersion();
		
		//[2] 운영중인 카테고리 정보를 모두 가져온다
		List<CategoryDTO> categorys = categoryDAO.selectAll();
		
		//[3] 최신버전의 상품을 검색해 온다 
		List<GoodsDTO> goodsList = goodsDAO.selectByVersionId(version.getVersionId());
		System.out.println("ddd : "+goodsList.size());
		
		//[4] 롤링배너 정보를 알아온다
		List<RollingBannerDTO> banners = rollingBannerDAO.selectAll(version.getVersionId());
		System.out.println("banners : "+banners.size());
		
		GoodsMainDTO dto = new GoodsMainDTO(goodsList, categorys, banners);
		//끝
		return dto;
	}

	@Override
	public List<GoodsDTO> goodsSub(String categoryName) throws Exception {
		//[1] 카테고리의 상품을 가져온다  
		List<GoodsDTO> goods = goodsDAO.selectByCatagory(categoryName);
		//끝
		return goods;
	}

	@Override
	public GoodsDTO goodsDetail(long goodsId) throws Exception {

		GoodsDTO goods = goodsDAO.selectById(goodsId);
		return goods;
	}
	
	@Override
	public GoodsDetailDTO goodsDetail(String goodsName) throws Exception {
		//[1] 상세상품의 정보를 가져온다 
		GoodsDTO goods = goodsDAO.selectOneProduct(goodsName);
		//[2] 리뷰정보를 구해온다
		List<ReviewDTO> reviewList = reviewsDAO.selectByGoodName(goodsName);
		//System.out.println(reviewList+"나오니?");
		// 끝
		GoodsDetailDTO dto = new GoodsDetailDTO(goods, reviewList);
		//GoodsDetailDTO dto = new GoodsDetailDTO(goods); 테스트 위해 썼음
		
		return dto;
	}

	@Override
	public int insertGoodsList() throws Exception {
		
		// 이것좀 누가 구현
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateGoods(GoodsDTO goods) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteGoods(GoodsDTO goods) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


}
