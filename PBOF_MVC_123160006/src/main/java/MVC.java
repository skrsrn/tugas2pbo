public class MVC {
    View view1 = new View();
    Model model1 = new Model();
    DAO DAO1 = new DAO();
    Controller controller1 = new Controller(model1, view1, DAO1);
}
