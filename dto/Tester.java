package edu.jspiders.firsthibproject.dto;

public class Tester {

	public static void main(String[] args) {
		SweetDTO dto = new SweetDTO();
		dto.setSid(2);
		dto.setSname("kaju barfi");
		dto.setPrice(15.00);
		dto.setBestBefore(30);
		
		SweetDAO dao = new SweetDAO();
		dao.create(dto);
	}
}
