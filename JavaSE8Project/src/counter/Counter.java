package counter;

public class Counter {
	int instanceVar;
	static int classVar;
	
	public Counter() {
		instanceVar++;
		classVar++;
	}

	public int getInstanceVar() {
		return instanceVar;
	}

	public void setInstanceVar(int instanceVar) {
		this.instanceVar = instanceVar;
	}

	public static int getClassVar() {
		return classVar;
	}

	public static void setClassVar(int classVar) {
		Counter.classVar = classVar;
	}
	

}
