package JavaDesignModel;

/**
 * @author hanshizhe
 * 外观模式，cpu,memory为电脑的组成部分，电脑为外观。CPU，Memory为内部组成部分
 */
public class ComputerAppearanceModel {
    private CPU cpu = null;
    private Memory memory = null;

    public ComputerAppearanceModel() {
        super();
        cpu = new CPU();
        memory = new Memory();
    }

    public void ComputerStart() {
        System.out.println("Computer start");
        cpu.CPUstart();
        memory.MemoryStart();
    }

    public void ComputerEnd() {
        cpu.CPUEnd();
        memory.MemoryEnd();
        System.out.println("Computer end");
    }

    public static void main(String[] args) {
        ComputerAppearanceModel com = new ComputerAppearanceModel();
        com.ComputerStart();
        com.ComputerEnd();
    }
    
}
