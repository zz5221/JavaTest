package JavaDesignModel;

/**
 * @author hanshizhe
 * 建造喆模式--置灰建造
 */
public class PersonDirector {
    public person constuctPerson(PersonBuilder pb){
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.builderPerson();
    }
    
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        person man = pd.constuctPerson(new ManBuilder());
        person woman = pd.constuctPerson(new WomanBuilder());
    }
    
}
