package otomation;

import java.util.Vector;

public class Worker {
	
	enum WorkSpace{
		WORKER,
		STUFF,
		MANAGER,
		FOUNDER,
	}

	private static final Worker NULL = null;
	
	static Vector<Worker> workerList = new Vector<Worker>();
	static int idController;

	public static int GetWorkerCount() {
		return workerList.size();
	}
	public static int GetWorkerCount(WorkSpace workSpace) {
		int i = 0;
		for (Worker w : workerList) {
			if (w.workSpace == workSpace) {
				i++;
			}
		}
		return i;
	}
	
	public static void AddWorker(String name) {
		Worker w = new Worker(idController++, name);
		workerList.add(w);
	}
	public static void AddWorker(String name, WorkSpace workSpace) {
		Worker w = new Worker(idController++, name, workSpace);
		workerList.add(w);
	}
	
	public static Worker FindWorker(String name) {
		for (Worker w : workerList) {
			if (w.name == name) {
				return w;
			}
		}
		return NULL;
	}
	
	public static boolean RemoveWorker(int id) {
		for (Worker w : workerList) {
			if (w.id == id) {
				workerList.remove(w);
				return true;
			}
		}
		return false;
	}
	public static boolean RemoveWorker(String name) {
		for (Worker w : workerList) {
			if (w.name == name) {
				workerList.remove(w);
				return true;
			}
		}
		return false;
	}

	private int id;
	private String name;
	@SuppressWarnings("unused")
	private WorkSpace workSpace;
	
	public int GetId() {return id;}
	public String GetName() {return name;}
	
	private Worker(int id, String name) {
		this.id = id;
		this.name = name;
		this.workSpace = WorkSpace.WORKER;
	}
	
	private Worker(int id, String name, WorkSpace workSpace) {
		this.id = id;
		this.name = name;
		this.workSpace = workSpace;
	}
}
