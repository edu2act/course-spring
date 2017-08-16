package constructdi;

public class Computer {
	private IntelCpu intelCpu;
	private KingstonMemory kingstonMemory;

	public Computer() {
	}

	public Computer(IntelCpu intelCpu, KingstonMemory kingstonMemory) {
		this.intelCpu = intelCpu;
		this.kingstonMemory = kingstonMemory;
	}
}
