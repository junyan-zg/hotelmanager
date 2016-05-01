/**   
 * @Title: Tree.java 
 * @Package cn.com.jy.hotel.domain 
 * @Description: TODO 
 * @author zjy   
 * @date 2016年4月22日 下午10:17:18 
 * @version V1.0   
 */
package cn.com.jy.hotel.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Tree
 * @Description: TODO
 * @author zjy
 * @date 2016年4月22日 下午10:17:18
 * 
 */
public class Tree implements Serializable {
	private Short id;
	private String text;
	/**
	 * icon-house2 icon-house
	 */
	private String iconCls = "icon-house2";
	private List<Tree> children = new ArrayList<Tree>();
	/**
	 * closed open
	 */
	private String state = "open";

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public List<Tree> getChildren() {
		return children;
	}

	public void setChildren(List<Tree> children) {
		this.children = children;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Tree(){}
	
	public Tree(Short id, String text) {
		this.id = id;
		this.text = text;
	}
	public Tree(Short id) {
		this.id = id;
	}
}