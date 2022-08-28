package com.domain;


public class GSClient {
  
	public static void main(String[] args) {
		GSShopfactory factory=new GSShopfactory();
		//Creating Normal Account
		
	 GSNormalAcc gsn=(GSNormalAcc) factory.getNewNormalAcc(1212,"Gayatri",500.00f);
		 gsn.bookProduct(gsn.getCharges());
		
		//Creating Prime Account
		GSPrimeAcc gsp=(GSPrimeAcc) factory.getNewPrimeAcc(12122, "Rachana", 600.0f, true);
		gsp.bookProduct(gsp.getCharges());
	}

}
