package MVC;

public class MVC {
    View1 mhsview = new View1();
    Model1 mhsmodel = new Model1();
    DAO1 mhsDAO = new DAO1();
    FController mhscontroller = new FController(mhsmodel, mhsview, mhsDAO);
}