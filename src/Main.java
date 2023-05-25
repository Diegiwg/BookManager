import controller.NavigatorController;
import view.AdministrationView;

public class Main {

	public static void main(String[] args) {
		// Navigate to Home View
		NavigatorController.navigateTo(new AdministrationView());
	}
}
