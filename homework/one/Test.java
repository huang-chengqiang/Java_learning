public class Test {
    public static void main(String[] args) {
        Cpu cpu = new Cpu();
        cpu.getSpeed(2200);
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        Pc pc = new Pc();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();

    }
}
