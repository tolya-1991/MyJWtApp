package tolya.example.myjwt;


import eu.webtoolkit.jwt.WApplication;
import eu.webtoolkit.jwt.WEnvironment;
import eu.webtoolkit.jwt.WtServlet;

public class AuthenticationMain extends WtServlet {
    private static final long serialVersionUID = 1L;

    public AuthenticationMain() {
        super();
    }

    @Override
    public WApplication createApplication(WEnvironment env) {
        /*
         * You could read information from the environment to decide whether the
         * user has permission to start a new application
         */
        return new MainApp(env);
    }
}
