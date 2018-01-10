
public class ListElement {

	Object obj; 

    ListElement nextElem; 

    public ListElement(Object obj) { 
        this.obj = obj; 
        nextElem = null; 
    } 

    public void setNextElem(ListElement nextElem) { 
        this.nextElem = nextElem; 
    } 

    public ListElement getNextElem() { 
        return nextElem; 
    } 

    public Object getObj() { 
        return obj; 
    } 
}
