package shop.shoes.model.dto;

import java.util.List;

import shop.shoes.model.AccountDTO;
import shop.shoes.model.PurchaseGoodsDTO;

public class PurchasePageDTO {
	private List<PurchaseGoodsDTO> purchaseGoods;
	private AccountDTO accountDTO;
	
	public PurchasePageDTO(List<PurchaseGoodsDTO> purchaseGoods, AccountDTO accountDTO) {
		super();
		this.purchaseGoods = purchaseGoods;
		this.accountDTO = accountDTO;
	}

	public List<PurchaseGoodsDTO> getPurchaseGoods() {
		return purchaseGoods;
	}

	public void setPurchaseGoods(List<PurchaseGoodsDTO> purchaseGoods) {
		this.purchaseGoods = purchaseGoods;
	}

	public AccountDTO getAccountDTO() {
		return accountDTO;
	}

	public void setAccountDTO(AccountDTO accountDTO) {
		this.accountDTO = accountDTO;
	}
	
	
}
