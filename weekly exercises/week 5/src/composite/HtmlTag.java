package composite;

import java.util.List;

public abstract class HtmlTag {
	
	protected String tagBody;
	
	protected List<HtmlTag> children;
	
	
	public abstract String getTagName();
	public abstract void setStartTag(String tag);

	public abstract void setEndTag(String tag);
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}
	public void addChildTag(HtmlTag htmlTag) {
		children.add(htmlTag);
	}
	public void removeChildTag(HtmlTag htmlTag) {
		children.remove(0);
	}
	public List<HtmlTag> getChildren() {
		return children;
	}
	public abstract void generateHtml();
}
