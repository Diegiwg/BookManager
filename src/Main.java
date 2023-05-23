import controller.NavigatorController;
import view.HomeView;

public class Main {

	public static void main(String[] args) {
		// Navigate to Home View
		NavigatorController.navigateTo(new HomeView());
	}
}
