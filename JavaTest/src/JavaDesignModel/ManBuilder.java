package JavaDesignModel;

public class ManBuilder implements PersonBuilder{
    person person;
    public ManBuilder() {
        super();
        this.person = new man();
    }

    @Override
    public void buildHead() {
        System.out.println("建造男人的头");
        person.setBody("建造男人的头");
    }

    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
        System.out.println("建造男人的身体");
    }

    @Override
    public void buildFoot() {
        person.setBody("建造男人的脚");
        System.out.println("建造男人的脚");
    }

    @Override
    public person builderPerson() {

        return person;
    }

}
