package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

//import com.internousdev.template.dao.BuyItemCompleteDAO;
import com.internousdev.template.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private ArrayList<BuyItemDTO> selectList = new ArrayList<BuyItemDTO>();
	private String pay;
	private String payment;
	private int TotalPrice;

//	private BuyItemCompleteDAO dao=new BuyItemCompleteDAO();

	@SuppressWarnings("unchecked")
	public String execute() throws SQLException {
		selectList = (ArrayList<BuyItemDTO>) session.get("selectList");
		BuyItemDTO bidto = new BuyItemDTO();
		for (BuyItemDTO dto : selectList) {
			if (pay.equals("1")) {
				payment = "現金払い";
				bidto.setPay("payment");
				selectList.add(bidto);
			} else {
				payment = "クレジットカード";
				bidto.setPay("payment");
				selectList.add(dto);
			}

			int id = Integer.parseInt(dto.getId());
			for (int i = 0; i < selectList.size(); i++) {
				if (i == id) {
					int intCount = dto.getCount();
					int intPrice = Integer.parseInt(dto.getItemPrice());
					int TotalPrice = intCount * intPrice;

					session.put("total_price", TotalPrice);
					// session.put("total_price", intCount * intPrice);
					System.out.println(TotalPrice);
				}
			}

//			String item_transaction_id;
//			String user_master_id;
//			String total_price;
//			String count;
//			dao.BuyItemInfo(session.get(item_transaction_id).toString(),
//					session.get(count).toString(),
//					session.get(user_master_id).toString(),
//					session.get(total_price).toString(),
//					session.get(pay).toString());
//			session.get("login_user_id").toString();

		}
//		 bicdao.buyItemInfo(session.get("id").toString(),
//		 session.get("login_user_id").toString(),
//		 session.get("buyItem_price").toString(),
//		 session.get("count").toString(),
//		 session.get("pay").toString());

		String result = SUCCESS;

		return result;
	}

	public int getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public ArrayList<BuyItemDTO> getSelectList() {
		return selectList;
	}

	public void setSelectList(ArrayList<BuyItemDTO> selectList) {
		this.selectList = selectList;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public Map<String, Object> session() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
