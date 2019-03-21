package kr.co.booktopia.vo;

import org.springframework.stereotype.Component;

@Component
public class ShopCartVO {
	
	private String member_id;
	private int goods_id;
	private int cart_id;
	private int cart_goods_qty;
	private String credate;
	
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getCart_goods_qty() {
		return cart_goods_qty;
	}
	public void setCart_godds_qty(int cart_goods_qty) {
		this.cart_goods_qty = cart_goods_qty;
	}
	public String getCredate() {
		return credate;
	}
	public void setCredate(String credate) {
		this.credate = credate;
	}


}
