package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class HtmlParentElement extends HtmlTag {

	private String name;
	private String startTag;
	private String endTag;
	
	
	public HtmlParentElement(String name) {
		this.name = name;
		children = new ArrayList<HtmlTag>();
	}

	@Override
	public String getTagName() {
		return name;
	}

	@Override
	public void setStartTag(String tag) {
		startTag = tag;

	}

	@Override
	public void setEndTag(String tag) {
		endTag = tag;

	}
	


	@Override
	public void generateHtml() {
		System.out.println(startTag);
		
		Iterator<HtmlTag> it = children.iterator();
		while(it.hasNext()){
			it.next().generateHtml();
		}
		System.out.println(endTag);
		
	}

}
