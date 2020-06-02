package com.biz.service;

import com.biz.model.AddressVO;

public class AddrServiceV1 {

	public void addrList(AddressVO[] address) {
	
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		
			System.out.println(d_line);
			System.out.println("\t\t\t주소록");
			System.out.println(s_line);
			System.out.println("이름\t 전화번호\t 나이\t 주소");
			System.out.println(s_line);
			
			for(int i = 0 ; i < address.length ; i++) {
				System.out.printf("%s\t %s\t %d\t %s\n", address[i].getName(), address[i].getTel(),
						address[i].getAge(), address[i].getAddr());
			}
			System.out.println(d_line);
	}
	
	
}
