package com.lym.designPartten.demo.creationType.fctoryMethodPattern.display;

import com.lym.designPartten.demo.creationType.fctoryMethodPattern.concreateCreator.FrenchFrieShop;
import com.lym.designPartten.demo.creationType.fctoryMethodPattern.concreateCreator.HamburgerShop;
import com.lym.designPartten.demo.creationType.fctoryMethodPattern.concreateCreator.PizzaShop;
import com.lym.designPartten.demo.creationType.fctoryMethodPattern.creator.FoodShop;
import com.lym.designPartten.demo.creationType.fctoryMethodPattern.product.Food;

/**
 * 
* Type: Display
* Description: Show how to use this pattern.
* 工厂方法模式
* @author LYM
* @date 2018年11月17日
 */
public class Display {
	public static void main(String[] args) {
		FoodShop f1 = new FrenchFrieShop();
		Food food1 = f1.sale();
		Food food2 = f1.sale();
		food1.getDescription();
		System.out.println(food1.getId());
		food2.getDescription();
		System.out.println(food2.getId());
		
		FoodShop f2 = new HamburgerShop();
		Food food3 = f2.sale();
		Food food4 = f2.sale();
		food3.getDescription();
		System.out.println(food3.getId());
		food4.getDescription();
		System.out.println(food4.getId());
		
		FoodShop f3 = new PizzaShop();
		Food food5 = f3.sale();
		food5.getDescription();
		System.out.println(food5.getId());
	}
}
