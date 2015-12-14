package pruebas;

public class ListVoteView extends ListUserView {

	private ListVoteController controller;
	
	public ListVoteView() {
		super();
		controller=new ListVoteController();
	}
	
	public void linkPapa() {
		controller.link();
	}

}
