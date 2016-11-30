package JavaDesignModel;



public class WomanBuilder implements PersonBuilder{
    
    person person;
    public WomanBuilder() {
        super();
        this.person = new woman();
    }
    @Override
    public void buildHead() {
        // TODO Auto-generated method stub
        person.setBody("建造女人头");
        System.out.println("建造女人头");
    }

    @Override
    public void buildBody() {
        // TODO Auto-generated method stub
        person.setBody("建造女人身体");
        System.out.println("建造女人身体");
    }

    @Override
    public void buildFoot() {
        // TODO Auto-generated method stub
        person.setBody("建造女人脚");
        System.out.println("建造女人脚");
    }


    @Override
    public JavaDesignModel.person builderPerson() {
        // TODO Auto-generated method stub
        return person;
    }
}
