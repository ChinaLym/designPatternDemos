package com.lym.designPartten.demo.creationType.fctoryMethodPattern.concreateCreator;

import com.lym.designPartten.demo.creationType.fctoryMethodPattern.creator.FoodShop;
import com.lym.designPartten.demo.creationType.fctoryMethodPattern.concreateProduct.Hamburger;
import com.lym.designPartten.demo.creationType.fctoryMethodPattern.product.Food;

/**
 * 
* Type: FrenchFrieShop
* Description: 
* @author LYM
* @date 2018年11月17日
 */
public class HamburgerShop implements FoodShop{
	@Override
	public Food sale() {
		return new Hamburger();
	}
}
