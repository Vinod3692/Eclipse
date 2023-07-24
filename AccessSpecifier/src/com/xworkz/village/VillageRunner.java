package com.xworkz.village;

import com.xworkz.village.inner.OldVillage;
import com.xworkz.village.outer.NewVillage;

public class VillageRunner {

	public static void main(String[] args) {
		
		OldVillage old = new OldVillage();
		old.enter();
		old.exit();
		
		NewVillage ref2 = new NewVillage();
		ref2.enter();
		ref2.exit();
		
	}

}