public class Pc {
    private Cpu cpu;
    private HardDisk HD;

    public void setCPU(Cpu c)
    {
        this.cpu = c;
    }
    public void setHardDisk(HardDisk h) {
        this.HD = h;
    }
    public void show(){
        System.out.println("CPU的速度为：" + cpu.toString() + ",硬盘的大小为：" + HD.toString());
    }
}
