package menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyMenu
{
	String menuName;
	List<MyMenuItem> menuItemList = new ArrayList<MyMenuItem>();
	
	public MyMenu(String name) {
		menuName = name;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	public void addMenuItem(MyMenuItem menuItem) {
		menuItemList.add(menuItem);
	}
	
	public void showMenu() {
		System.out.println("------------------------------------");
		System.out.println(getMenuName());
		System.out.println("------------------------------------");
		Iterator<MyMenuItem> iter = menuItemList.iterator();
		while(iter.hasNext()) {
			MyMenuItem menuItem = iter.next();
			System.out.println(menuItem.getMenuItemLabel());
		}
	}
}