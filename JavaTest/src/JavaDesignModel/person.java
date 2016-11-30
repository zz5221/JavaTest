package JavaDesignModel;

public class person {
    private String head;
    private String body;
    private String foot;
    public String getHead() {
        return head;
    }
    public void setHead(String head) {
        this.head = head;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getFoot() {
        return foot;
    }
    public void setFoot(String foot) {
        this.foot = foot;
    }
}
class man extends person{
    public void men(){
        System.out.println("开始建造男人");
    }
}
class woman extends person{
    public void men(){
        System.out.println("开始建造女人");
    }
}
