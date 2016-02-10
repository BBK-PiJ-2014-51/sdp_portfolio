/**
 * A
 * The composite pattern relies on composition to store a collection of objects
 * that share an interface in common with the containing class.
 * 
 * B
 * You can use a composite pattern to share common logic from the abstract parent
 * between parent and child containers
 * 
 * C
 * The four participants are the abstract class, the child class, the parent classs, and the collection;
 */

package composite;

public class TestCompositePattern {

	public static void main(String[] args) {
		HtmlTag parentTag = new HtmlParentElement("<html>");
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");
		HtmlTag p1 = new HtmlParentElement("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");
		parentTag.addChildTag(p1);
		HtmlTag child1 = new HtmlElement("<P>");
		child1.setStartTag("<P>");
		child1.setEndTag("</P>");
		child1.setTagBody("Testing html tag library");
		p1.addChildTag(child1);
		child1 = new HtmlElement("<P>");
		child1.setStartTag("<P>");
		child1.setEndTag("</P>");
		child1.setTagBody("Paragraph 2");
		p1.addChildTag(child1);
		parentTag.generateHtml();
	}

}
