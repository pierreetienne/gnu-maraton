package pruebas;

public abstract class ListUserView {

	private ListUserController controller;
	
	public ListUserView() {
		controller=new ListUserController();
	}
	
	public void onClick() {
		controller.algo();
	}

}
