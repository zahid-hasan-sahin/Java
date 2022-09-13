package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class MyTag extends TagSupport {

    public int number;
    public String color;

    public void setNumber(int number) {
        this.number = number;
    }
     public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter wr = this.pageContext.getOut();
        try {
            wr.println("<h1 style='color:" + color + "'>you given " + number + "</h1>");
        } catch (Exception e) {
            System.out.println(e);
        }
        return SKIP_BODY;
    }

}
