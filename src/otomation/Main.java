package otomation;

public class Main {

	public static void main(String[] args) {
		
		Worker.AddWorker("Mertkan");
		Worker.AddWorker("Ali");
		Worker.AddWorker("Mehmet");
		
		System.out.println("GetWorkerCount: " + Worker.GetWorkerCount());

		System.out.println("RemoveWorker: " + Worker.RemoveWorker("Ali"));
		
		System.out.println("GetWorkerCount: " + Worker.GetWorkerCount());
		
		
	}

}
